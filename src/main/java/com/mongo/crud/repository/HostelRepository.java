package com.mongo.crud.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.mongo.crud.Model.HostelModel;

public interface HostelRepository extends MongoRepository<HostelModel, Integer>{

}
