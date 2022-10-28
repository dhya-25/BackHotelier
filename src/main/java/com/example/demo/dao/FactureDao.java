package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Facture;
import com.example.demo.entity.Hotel;

public interface FactureDao extends JpaRepository<Facture,Long> {
	
	@Query(value ="select * from facture f  where f.NUM_FACT_IND=NUM_FACT_IND",nativeQuery = true)
	 public List<Facture> findByNumero( Long numFactInd );

}
