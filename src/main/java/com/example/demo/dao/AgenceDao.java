package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Agence;


public interface AgenceDao extends JpaRepository <Agence , Long> {

}
