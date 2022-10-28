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

import com.example.demo.dao.ResidentDao;
import com.example.demo.dao.RoomRackDao;
import com.example.demo.entity.Resident;
import com.example.demo.entity.RoomRack;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/roomRack")
public class RoomRackController {
	
	@Autowired
	private RoomRackDao rackDao;

	@PostMapping("/add")

	public ResponseEntity<RoomRack> createRoomRack(@RequestBody RoomRack resident) {
		return ResponseEntity.ok(rackDao.save(resident));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<RoomRack>> getResidentList() {

		return ResponseEntity.ok(rackDao.findAll());
	}



}
