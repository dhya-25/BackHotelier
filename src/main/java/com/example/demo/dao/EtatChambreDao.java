package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Etat_Chambre;

public interface EtatChambreDao extends JpaRepository<Etat_Chambre,Long> {

	 @Query(value ="select count(*),e.cod_categ\r\n"
	 		+ "from chambre c,type_chambre t,etat_chambre e\r\n"
	 		+ "where c.id_chambre = t.chambres_id_chambre\r\n"
	 		+ "and t.id_type = e.type_chambres_id_type\r\n"
	 		+ "group by e.cod_categ",nativeQuery = true)
		List<Object> SelectOccupationParCateg();
	
	
}
