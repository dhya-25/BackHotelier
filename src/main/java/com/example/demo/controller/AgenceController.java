package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.AgenceDao;
import com.example.demo.entity.Agence;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/agence")
public class AgenceController {

	@Autowired
	private AgenceDao agenceDao;

	@PostMapping("/add")

	public ResponseEntity<Agence> createAgence(@RequestBody Agence agence) {
		return ResponseEntity.ok(agenceDao.save(agence));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Agence>> getAgenceList() {

		return ResponseEntity.ok(agenceDao.findAll());
	}
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Agence> findAgence(@PathVariable Long id) {
		return ResponseEntity.ok(
				agenceDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean deleteClient(@PathVariable long id) {
		agenceDao.deleteById(id);
		return true;
	}
	

	
	
	@CrossOrigin
	@PutMapping("/update")
	public Agence update(@RequestBody Agence agence) throws NoSuchAlgorithmException {
		try {

			Optional<Agence> Agence = agenceDao.findById(agence.getIdAgence());
			Agence.get().setAdrOne_Agence(agence.getAdrOne_Agence());
			Agence.get().setAdrTwo_Agence(agence.getAdrTwo_Agence());
			Agence.get().setAdrTree_Agence(agence.getAdrTree_Agence());
			Agence.get().setCpteAgence(agence.getCpteAgence());
			Agence.get().setEtatAgence(agence.getEtatAgence());
			Agence.get().setDomiAgence(agence.getDomiAgence());
			Agence.get().setEmail(agence.getEmail());
			Agence.get().setFaxAgence(agence.getFaxAgence());
			Agence.get().setTelAgence(agence.getTelAgence());

			Agence.get().setNomAgence(agence.getNomAgence());
			Agence.get().setNomComercial(agence.getNomComercial());
			Agence.get().setPaysAgence(agence.getPaysAgence());
			Agence.get().setProvinceAgence(agence.getProvinceAgence());
			Agence.get().setRepresentant(agence.getRepresentant());
		
			Agence AdminUpdated = agenceDao.save(Agence.get());
			return AdminUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	@ExceptionHandler(ProductNotFoundException.class)
	public ResponseEntity<String> handleProductNotFoundException() {
		return ResponseEntity.ok("Product Not Found");
	}

}
