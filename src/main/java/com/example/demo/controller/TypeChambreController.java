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

import com.example.demo.dao.ResidentDao;
import com.example.demo.dao.TypeChambreDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.Resident;
import com.example.demo.entity.TypeChambre;
import com.example.demo.exception.ProductNotFoundException;

@RestController
@CrossOrigin
@RequestMapping("/typeChambre")
public class TypeChambreController {
	@Autowired
	private TypeChambreDao typeChambreDao;

	@PostMapping("/add")

	public ResponseEntity<TypeChambre> createTypeChambre(@RequestBody TypeChambre resident) {
		return ResponseEntity.ok(typeChambreDao.save(resident));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<TypeChambre>> getTypeChambreList() {

		return ResponseEntity.ok(typeChambreDao.findAll());
	}
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<TypeChambre> findTypeChambre(@PathVariable Long id) {
		return ResponseEntity.ok(
				typeChambreDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}
	
	@DeleteMapping(value = "/{id}")
	public boolean deleteType(@PathVariable long id) {
		typeChambreDao.deleteById(id);
		return true;
	}
	
	@CrossOrigin
	@PutMapping("/update")
	public TypeChambre update(@RequestBody TypeChambre typeChambre) throws NoSuchAlgorithmException {
		try {

			Optional<TypeChambre> Agence = typeChambreDao.findById(typeChambre.getIdType());
			Agence.get().setCode_categ(typeChambre.getCode_categ());
			Agence.get().setBalcon(typeChambre.isBalcon());
			Agence.get().setCommentaire(typeChambre.getCommentaire());
			Agence.get().setClimant(typeChambre.isClimant());
			Agence.get().setCod_hotel(typeChambre.getCod_hotel());
			Agence.get().setCodAlie(typeChambre.getCodAlie());
			Agence.get().setCodClasse1(typeChambre.getCodClasse1());
			Agence.get().setCodClasse2(typeChambre.getCodClasse2());
			Agence.get().setCode_categ(typeChambre.getCode_categ());
			

			Agence.get().setCodType(typeChambre.getCodType());
			Agence.get().setCoffren(typeChambre.isCoffren());
			Agence.get().setCommunic(typeChambre.isCommunic());
			Agence.get().setCommuniquante(typeChambre.getCommuniquante());
			Agence.get().setDistance(typeChambre.isDistance());
			Agence.get().setDouchBain(typeChambre.isDouchBain());
			Agence.get().setEtat_Chambre(typeChambre.getEtat_Chambre());
			Agence.get().setGrandLit(typeChambre.isGrandLit());
			Agence.get().setMiniBar(typeChambre.isMiniBar());
			Agence.get().setNbLits(typeChambre.getNbLits());
			Agence.get().setOrdre(typeChambre.getOrdre());
			Agence.get().setSalon(typeChambre.isSalon());
			Agence.get().setSoleil(typeChambre.isSoleil());
			Agence.get().setTel(typeChambre.getTel());
			Agence.get().setTelephone(typeChambre.isTelephone());
			Agence.get().setTelevision(typeChambre.isTelevision());
			Agence.get().setVue(typeChambre.getVue());


		
			TypeChambre AdminUpdated = typeChambreDao.save(Agence.get());
			return AdminUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


}
