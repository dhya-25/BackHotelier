package com.example.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Administrateur;



public interface AdminDao extends MongoRepository<Administrateur, Long> {
	
	


}
