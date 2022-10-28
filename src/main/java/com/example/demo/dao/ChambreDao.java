package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Chambre;

public interface ChambreDao extends JpaRepository<Chambre,Long> {
	
	
	
	List<Chambre> findChambreByNomResa(String nom);
	
	@Query(value ="select * from chambre p where p.code_categ=code_categ",nativeQuery = true)
	List<Chambre> FindByIdTypeChambre(String id);
	
	@Query(value ="select * from chambre c , agence a where c.cod_agence = a.cod_agence",nativeQuery = true)
	List<Chambre> FindByCodAgencee();

}
