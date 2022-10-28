package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Arrangement;

public interface ArrangementDao extends JpaRepository<Arrangement,String> {

}
