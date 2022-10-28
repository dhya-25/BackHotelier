package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.ChambreDao;
import com.example.demo.dao.FactureDao;
import com.example.demo.entity.Chambre;
import com.example.demo.entity.Facture;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/chambre")
public class ChambreController {
	
	@Autowired
	private ChambreDao chambreDao;

	@PostMapping("/add")

	public ResponseEntity<Chambre> createChambre(@RequestBody Chambre chambre ) {
		return ResponseEntity.ok(chambreDao.save(chambre));
	}

	@CrossOrigin
	@GetMapping("/getByNomResa/{nomResa}")
	public ResponseEntity<List<Chambre>> findChambreByNomResa(@PathVariable String nomResa) {

		return ResponseEntity.ok(chambreDao.findChambreByNomResa(nomResa));
	}
	
	
	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Chambre>> getChambreList() {

		return ResponseEntity.ok(chambreDao.findAll());
	}
	@CrossOrigin
	@GetMapping("/getbycodagence")
	public ResponseEntity<List<Chambre>> getChambreByCodAgence() {

		return ResponseEntity.ok(chambreDao.FindByCodAgencee());
	}
	@CrossOrigin
	@GetMapping("/getByIdTypeChambre/{code_categ}")
	public ResponseEntity<List<Chambre>> FindByIdTypeChambre(@PathVariable String code_categ) {

		return ResponseEntity.ok(chambreDao.FindByIdTypeChambre(code_categ));
	}

	
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Chambre> findChambre(@PathVariable Long id) {
		return ResponseEntity.ok(
				chambreDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping(value = "/{id}")
	public boolean deleteChambre(@PathVariable long id) {
		chambreDao.deleteById(id);
		return true;
	}
	

}
