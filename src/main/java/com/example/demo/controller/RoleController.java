package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.RoleDao;
import com.example.demo.dao.RoleRepository;
import com.example.demo.entity.Role;




@RestController
@CrossOrigin
@RequestMapping("/role")
public class RoleController {
	
	@Autowired
	private  RoleDao repository;
	


	
	@PostMapping("/addRole")
	public Role saveAdministrateur(@RequestBody Role role) {
		return	repository.save(role);
		
	}
	
	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Role>> getProductList() {
		
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	

}
