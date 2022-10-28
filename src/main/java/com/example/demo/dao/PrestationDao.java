package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Prestation;

public interface PrestationDao extends JpaRepository<Prestation,Long> {

}
