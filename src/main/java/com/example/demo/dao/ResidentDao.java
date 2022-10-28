package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Chambre;
import com.example.demo.entity.Resident;

public interface ResidentDao extends JpaRepository<Resident,Long>{

	 List<Resident> findByChambre(String chambre);
	
	
	
	 @Query(value ="select count(*),r.pays from resident r group by r.pays",nativeQuery = true)
		List<Object> SelectResidParNat();
	
	
}
