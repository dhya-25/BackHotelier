package com.example.demo.controller;

import java.io.FileInputStream;
import java.io.IOException;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
import com.example.demo.entity.Resident;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.services.ConnectionBdReport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


@RestController
@CrossOrigin
@RequestMapping("/resident")
public class ResidentController {
	@Autowired
	private ResidentDao residentDao;
	@Autowired
	private ConnectionBdReport connectionBdReport;
	@PostMapping("/add")

	public ResponseEntity<Resident> createResident(@RequestBody Resident resident) {
		return ResponseEntity.ok(residentDao.save(resident));
	}

	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Resident>> getResidentList() {

		return ResponseEntity.ok(residentDao.findAll());
	}
	@CrossOrigin
	@GetMapping("/getbynat")
	public ResponseEntity<List<Object>> SelectResidParNat() {

		return ResponseEntity.ok(residentDao.SelectResidParNat());
	}
	@CrossOrigin
	@GetMapping("/getByChambre/{chambre}")
	public ResponseEntity<List<Resident>> findByChambre(@PathVariable	String chambre) {

		return ResponseEntity.ok(residentDao.findByChambre(chambre));
	}
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<Resident> findResident(@PathVariable Long id) {
		return ResponseEntity.ok(
				residentDao.findById(id).orElseThrow(() -> new ProductNotFoundException("agence Not found")));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteResident(@PathVariable Long id) {
		residentDao.deleteById(id);
		return ResponseEntity.ok("Deleted");
	}
	
	@GetMapping(value = "/pdff", produces = MediaType.APPLICATION_PDF_VALUE)
	public ResponseEntity<byte[]> downloadInvoice() throws JRException, IOException {



		
		List<Resident> resident =residentDao.findAll();
		
		JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(resident);
		
		Map<String, Object> parameters = new HashMap<>();
		//parameters.put("total", "7000");

		JasperReport compileReport = JasperCompileManager.compileReport(new FileInputStream("src/main/resources/Essai.jrxml"));

		JasperPrint jasperPrint = JasperFillManager.fillReport(compileReport, parameters, dataSource);

		// JasperExportManager.exportReportToPdfFile(jasperPrint,
		// System.currentTimeMillis() + ".pdf");

		byte data[] = JasperExportManager.exportReportToPdf(jasperPrint);

		System.err.println(data);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Content-Disposition", "inline; filename=Essai.pdf");

		return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF).body(data);
	}
	
	@CrossOrigin
	@GetMapping(path = "/report/{ReportName}")
	public byte[] getReportfile(@PathVariable String ReportName)
			throws JRException, IOException {
		byte[] getReportFile;

		try {
			/*Call Method Generate PDF */
			getReportFile = connectionBdReport.GeneratePDFF(ReportName);
			System.out.println(getReportFile);


		} catch (Exception ex) {
			return null;
		}
		return getReportFile;
	}
}
