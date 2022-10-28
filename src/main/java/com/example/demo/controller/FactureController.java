package com.example.demo.controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dao.FactureDao;
import com.example.demo.dao.ReservationDao;
import com.example.demo.entity.Agence;
import com.example.demo.entity.Facture;
import com.example.demo.entity.Reservation;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.services.ConnectionBdReport;

import net.sf.jasperreports.engine.JRException;
@RestController
@CrossOrigin
@RequestMapping("/facture")
public class FactureController {

	@Autowired
	private FactureDao factureDao;
	@Autowired
	private ConnectionBdReport connectionBdReport;

	@PostMapping("/add")

	public ResponseEntity<Facture> createFacture(@RequestBody Facture facture ) {
		return ResponseEntity.ok(factureDao.save(facture));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Facture>> getFactureList() {

		return ResponseEntity.ok(factureDao.findAll());
	}
	@CrossOrigin

	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Facture> findFacture(@PathVariable Long id) {
		return ResponseEntity.ok(
				factureDao.findById(id).orElseThrow(() -> new ProductNotFoundException("Contrat agence Not found")));
	}
	@GetMapping("/getbyNum/{numFactInd}")

	public ResponseEntity<List<Facture>> findFactureByNumero(@PathVariable Long numFactInd) {
		return ResponseEntity.ok(factureDao.findByNumero(numFactInd));
	}
	@DeleteMapping(value = "/{id}")
	public boolean deleteFacture(@PathVariable long id) {
		factureDao.deleteById(id);
		return true;
	}
	@CrossOrigin
	@PutMapping("/update")
	public Facture update(@RequestBody Facture agence) throws NoSuchAlgorithmException {
		try {

			Optional<Facture> Agence = factureDao.findById(agence.getIdFacture());
			Agence.get().setCodAgence(agence.getCodAgence());
			Agence.get().setCodHotel(agence.getCodHotel());
			Agence.get().setCodResid(agence.getCodResid());
			Agence.get().setCommentaire(agence.getCommentaire());
			Agence.get().setDateArr(agence.getDateArr());
			Agence.get().setDateDep(agence.getDateDep());
			Agence.get().setDateFacture(agence.getDateFacture());
			Agence.get().setMntFdcst(agence.getMntFdcst());
			Agence.get().setMntHtax(agence.getMntFdcst());
			Agence.get().setMntHtva(agence.getMntHtva());
			Agence.get().setMntTtc(agence.getMntTtc());
			Agence.get().setMntTtlettre(agence.getMntTtlettre());
			Agence.get().setMnttva(agence.getMnttva());
			Agence.get().setNbrGratuit(agence.getNbrGratuit());
			Agence.get().setNomClient(agence.getNomClient());

		
			Facture AdminUpdated = factureDao.save(Agence.get());
			return AdminUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	@CrossOrigin
	@GetMapping(path = "/report/{ReportName}/{catgId}")
	public byte[] getReportfile(@PathVariable String ReportName, @PathVariable String catgId)
			throws JRException, IOException {
		byte[] getReportFile;

		try {
			/*Call Method Generate PDF */
			getReportFile = connectionBdReport.GeneratePDF(ReportName, catgId);
			System.out.println(getReportFile);


		} catch (Exception ex) {
			return null;
		}
		return getReportFile;
	}

	
}
