package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.UtilisateurDao;
import com.example.demo.entity.Role;
import com.example.demo.entity.Utilisateur;

@RestController
@CrossOrigin
@RequestMapping("/utilisateur")
public class UtilisateurController {
	
	@Autowired
	UtilisateurDao dao;
	
	@PostMapping("/add")
	public Utilisateur saveUtilisateur(@RequestBody Utilisateur util) {
		return	dao.save(util);
		
	}

}
