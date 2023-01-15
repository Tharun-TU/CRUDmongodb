package com.mongo.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongo.crud.Model.HostelModel;
import com.mongo.crud.repository.HostelRepository;

@RestController
@RequestMapping("/api/mongosh")
public class HostelController {
	
	@Autowired
	HostelRepository hostelRepository;
	
	@PostMapping
	public void insertData(@RequestBody HostelModel hostelModel) {
		hostelRepository.save(hostelModel);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDataById(@PathVariable int id) {
		try {
			return ResponseEntity.ok(hostelRepository.findById(id));
		}catch (Exception e) {
			return ResponseEntity.ok("Data is not in database");
		}
	}
	
	@GetMapping
	public ResponseEntity<?> getAllData() {
		return ResponseEntity.ok(hostelRepository.findAll());
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateData(@RequestBody HostelModel hostelModel, @PathVariable int id) {
		try {
			return ResponseEntity.ok(hostelRepository.save(hostelModel));
		}catch (Exception e) {
			return ResponseEntity.ok("Data is not updated");
		}
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteDataById(@PathVariable int id) {
		hostelRepository.deleteById(id);
		return ResponseEntity.ok("Data has been deleted from the database"+id);
	}
	
	@DeleteMapping
	public ResponseEntity<?> deleteAllDetails() {
		try {
			hostelRepository.deleteAll();
			return ResponseEntity.ok("All Data has been deleted");
		}catch (Exception e) {
			return ResponseEntity.ok("Data has not been deleted");
		}
	}
}
