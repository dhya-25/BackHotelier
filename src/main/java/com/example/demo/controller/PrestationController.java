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

import com.example.demo.dao.ConsomationDao;
import com.example.demo.dao.PrestationDao;
import com.example.demo.entity.Consomation;
import com.example.demo.entity.Prestation;
import com.example.demo.exception.ProductNotFoundException;


@RestController
@CrossOrigin
@RequestMapping("/prestation")
public class PrestationController {
	
	@Autowired
	private PrestationDao prestationDao;

	@PostMapping("/add")

	public ResponseEntity<Prestation> createPrestation(@RequestBody Prestation prestation ) {
		return ResponseEntity.ok(prestationDao.save(prestation));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Prestation>> getPrestationList() {

		return ResponseEntity.ok(prestationDao.findAll());
	}
	
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Prestation> findPrestation(@PathVariable Long id) {
		return ResponseEntity.ok(
				prestationDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePrestation(@PathVariable Long id) {
		prestationDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}


}
