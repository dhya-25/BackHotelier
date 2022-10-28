package com.example.demo.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Role;




public interface RoleRepository extends MongoRepository<Role, String> {

}
