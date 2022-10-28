package com.example.demo.controller;

import java.util.Date;
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

import com.example.demo.dao.HotelDao;
import com.example.demo.dao.ReservationDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.Reservation;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	private ReservationDao reservationDao;

	@PostMapping("/add")

	public ResponseEntity<Reservation> createAgence(@RequestBody Reservation agence) {
		return ResponseEntity.ok(reservationDao.save(agence));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Reservation>> getReservationList() {

		return ResponseEntity.ok(reservationDao.findAll());
	}

	@GetMapping("/getbyid/{id}")
	public ResponseEntity<Reservation> findReservation(@PathVariable Long id) {
		return ResponseEntity.ok(reservationDao.findById(id)
				.orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}

	@DeleteMapping(value = "/{id}")
	public boolean deleteReservation(@PathVariable long id) {
		reservationDao.deleteById(id);
		return true;
	}
	
	@CrossOrigin
	@GetMapping("/get/nbrArrive")
	public  ResponseEntity<Integer> getReservationList(@PathVariable Date date_arr) {
		return ResponseEntity.ok(reservationDao.selectByDateArr(date_arr));
	}
}
