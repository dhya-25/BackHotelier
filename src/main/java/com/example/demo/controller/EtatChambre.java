package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.EtatChambreDao;
import com.example.demo.dao.FactureDao;
import com.example.demo.entity.ContratAgence;
import com.example.demo.entity.Etat_Chambre;
import com.example.demo.entity.Facture;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/etatChambre")
public class EtatChambre {
	
	@Autowired
	private EtatChambreDao chambreDao;

	@PostMapping("/add")

	public ResponseEntity<Etat_Chambre> createFacture(@RequestBody Etat_Chambre chambre ) {
		return ResponseEntity.ok(chambreDao.save(chambre));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Etat_Chambre>> getFactureList() {

		return ResponseEntity.ok(chambreDao.findAll());
	}
	
	@CrossOrigin
	@GetMapping("/getOccup")
	public ResponseEntity<List<Object>> getOccParCateg() {

		return ResponseEntity.ok(chambreDao.SelectOccupationParCateg());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Etat_Chambre> findFacture(@PathVariable Long id) {
		return ResponseEntity.ok(
				chambreDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping(value = "/{id}")
	public boolean deleteClient(@PathVariable long id) {
		chambreDao.deleteById(id);
		return true;
	}

	@CrossOrigin
	@PutMapping("/update")
	public Etat_Chambre update(@RequestBody Etat_Chambre etat) throws NoSuchAlgorithmException {
		try {

			Optional<Etat_Chambre> etatChambre = chambreDao.findById(etat.getIdEtatChambre());
			etatChambre.get().setCodCateg(etat.getCodCateg());
			etatChambre.get().setCodHotel(etat.getCodHotel());
			etatChambre.get().setEtatChambre(etat.getEtatChambre());
			etatChambre.get().setNumChambre(etat.getNumChambre());
			
			
		
			Etat_Chambre ContraUpdated = chambreDao.save(etatChambre.get());
			return ContraUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
