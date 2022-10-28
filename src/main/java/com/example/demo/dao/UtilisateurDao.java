package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.entity.Utilisateur;

public interface UtilisateurDao extends MongoRepository<Utilisateur, String>{
	
	
    public List<Utilisateur> findByRef(String refHotel);
    public List<Utilisateur> findByCin(String cin);
    
    Optional<Utilisateur> findByUsername(String username);

    Boolean existsByUsername(String username);




}
