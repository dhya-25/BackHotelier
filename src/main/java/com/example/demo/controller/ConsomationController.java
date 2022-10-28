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

import com.example.demo.dao.ChambreDao;
import com.example.demo.dao.ConsomationDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.Chambre;
import com.example.demo.entity.Consomation;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/consommation")
public class ConsomationController {
	
	@Autowired
	private ConsomationDao consomationDao;

	@PostMapping("/add")

	public ResponseEntity<Consomation> createConsomation(@RequestBody Consomation consomation ) {
		return ResponseEntity.ok(consomationDao.save(consomation));
	}

	@CrossOrigin
	@GetMapping("/get")

	public ResponseEntity<List<Consomation>> getConsomationList() {

		return ResponseEntity.ok(consomationDao.findAll());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Consomation> findConsomation(@PathVariable Long id) {
		return ResponseEntity.ok(
				consomationDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping(value = "/{id}")
	public boolean deleteConso(@PathVariable long id) {
		consomationDao.deleteById(id);
		return true;
	}
	
	@CrossOrigin
	@PutMapping("/update")
	public Consomation update(@RequestBody Consomation agence) throws NoSuchAlgorithmException {
		try {

			Optional<Consomation> Agence = consomationDao.findById(agence.getIdConsommation());
			Agence.get().setMntConso(agence.getMntConso());
			Agence.get().setCodCons(agence.getCodCons());
			Agence.get().setCodPrestation(agence.getCodPrestation());
			Agence.get().setCodResid(agence.getCodResid());
			Agence.get().setCodUser(agence.getCodUser());
			Agence.get().setCodHotel(agence.getCodHotel());
			Agence.get().setCodAgence(agence.getCodAgence());
			Agence.get().setDateConso(agence.getDateConso());
			Agence.get().setHeureConso(agence.getHeureConso());

			Agence.get().setNumBon(agence.getNumBon());
			Agence.get().setTypeConso(agence.getTypeConso());
			Agence.get().setDateSys(agence.getDateSys());
			Agence.get().setOffre(agence.getOffre());
			Agence.get().setTypeClient(agence.getTypeClient());
			Agence.get().setNumFactInd(agence.getNumFactInd());
			Agence.get().setNumFactDeb(agence.getNumFactDeb());
			Agence.get().setForfait(agence.getForfait());
			Agence.get().setCodeDev(agence.getCodeDev());
			Agence.get().setTauxDev(agence.getTauxDev());
			Agence.get().setUnite(agence.getUnite());

			Consomation AdminUpdated = consomationDao.save(Agence.get());
			return AdminUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	

}
