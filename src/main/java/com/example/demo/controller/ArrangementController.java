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

import com.example.demo.dao.AgenceDao;
import com.example.demo.dao.ArrangementDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.Arrangement;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/arrangement")
public class ArrangementController {
	@Autowired
	private ArrangementDao arrangementDao;

	@PostMapping("/add")

	public ResponseEntity<Arrangement> createArrangement(@RequestBody Arrangement arrangement) {
		return ResponseEntity.ok(arrangementDao.save(arrangement));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Arrangement>> getArrangementList() {

		return ResponseEntity.ok(arrangementDao.findAll());
	}

	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Arrangement> findArrangement(@PathVariable String id) {
		return ResponseEntity
				.ok(arrangementDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteArrangement(@PathVariable String id) {
		arrangementDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
}
