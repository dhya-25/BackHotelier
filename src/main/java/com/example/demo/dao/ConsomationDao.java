package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Consomation;

public interface ConsomationDao extends JpaRepository<Consomation,Long> {

}
