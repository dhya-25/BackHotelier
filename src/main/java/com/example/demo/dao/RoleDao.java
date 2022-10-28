package com.example.demo.dao;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.ERole;
import com.example.demo.entity.Role;

public interface RoleDao extends MongoRepository<Role, String> {
	
	  Optional<Role> findByName(ERole name);


}
