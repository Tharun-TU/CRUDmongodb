package com.mongo.crud.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Hostel")

public class HostelModel {
	
	@Id
	
	private int id;
	private String name;
	private String lastName;
	private String address;
	private int age;
	private Long mobileNo;
	
	public HostelModel() {
		
	}
	public HostelModel(int id, String name, String lastName, String address, int age, Long mobileNo) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.address = address;
		this.age = age;
		this.mobileNo = mobileNo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(Long mobileNo) {
		this.mobileNo = mobileNo;
	}
}
