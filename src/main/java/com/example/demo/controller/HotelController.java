package com.example.demo.controller;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Optional;
import java.io.*;
import com.sun.mail.iap.Response;

import java.nio.file.*;
import org.springframework.http.ResponseEntity;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.dao.HotelDao;

import com.example.demo.entity.Hotel;
import com.example.demo.model.hotelModel;
import com.example.demo.services.hotelService;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin
@RequestMapping("/hotel")
public class HotelController {
	
	@Autowired
	private HotelDao hotelDao;
	
	@Autowired
	private hotelService hotelService;
	@Autowired  ServletContext context;

	@CrossOrigin
	@PostMapping("/add")
	public String createFacture(@RequestBody Hotel facture,RedirectAttributes re,
			@RequestParam("fileImage") MultipartFile file) throws IOException {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename()); 
		facture.setLogo(fileName);
	Hotel hotelsaved =	hotelDao.save(facture);
	String  uploaddir = "/hotel-logos/" + hotelsaved.getInputHotel();
	Path uploadPath = Paths.get(uploaddir);
	if(!Files.exists(uploadPath)) {
		Files.createDirectories(uploadPath);
	}
	
	try (InputStream inputStream = file.getInputStream()) {
	Path filePath = uploadPath.resolve(fileName);
	Files.copy(inputStream,filePath,StandardCopyOption.REPLACE_EXISTING);
	} catch (IOException e) {
	throw new IOException("could not save uploaded file: "+fileName);	
	}
	re.addFlashAttribute("message","messssage");
		return "redirect:/hotels";
	}
	/*@PostMapping("/add")
	public String createHotelUtilisateur(@RequestBody hotelModel studentModel){
        return hotelService.createResource(studentModel);
    }*/
	
	 @PostMapping("/articles")
	 public ResponseEntity<Response> createArticle (@RequestParam("file") MultipartFile file,
			 @RequestParam("hotel") String hotel) throws JsonParseException , JsonMappingException , Exception
	 {
		 System.out.println("Ok .............");
       Hotel arti = new ObjectMapper().readValue(hotel, Hotel.class);

       boolean isExit = new File(context.getRealPath("/Image/")).exists();
       if (!isExit)
       {
       	new File (context.getRealPath(".//images//articles//")).mkdir();
       	System.out.println("mk dir.............");
       }
       String filename = file.getOriginalFilename();
       String newFileName = FilenameUtils.getBaseName(filename)+"."+FilenameUtils.getExtension(filename);
       File serverFile = new File (context.getRealPath(".//images//articles//"+File.separator+newFileName));
       try
       {
       	System.out.println("Image");
       	 FileUtils.writeByteArrayToFile(serverFile,file.getBytes());
       	 
       }catch(Exception e) {
       	e.printStackTrace();
       }

      
       arti.setLogo(newFileName);
       Hotel art = hotelDao.save(arti);
       if (art != null)
       {
       	return new ResponseEntity<Response>(new Response (""),HttpStatus.OK);
       }
       else
       {
       	return new ResponseEntity<Response>(new Response ("Article not saved"),HttpStatus.BAD_REQUEST);	
       }
	 }
	@CrossOrigin
	@GetMapping("/get")
	public ResponseEntity<List<Hotel>> getAgenceLit() {

		return ResponseEntity.ok(hotelDao.findAll());
	}

	/*@GetMapping("/get")
	public List<hotelModel> readResources(){
        return hotelService.readResources();
    }*/
	
	@CrossOrigin
	@GetMapping("/gett")
	public ResponseEntity<List<Hotel>> getAgenceList() {

		return ResponseEntity.ok(hotelDao.findAll());
	}
	@CrossOrigin
	@GetMapping("/getbyid/{id}")

	public ResponseEntity<List<hotelModel>> findHotell(@PathVariable Long id) {
		return ResponseEntity.ok(
				hotelService.readResourcesById(id));
	}
	
	@GetMapping(path="/Imgarticles/{id}")
	 public byte[] getPhoto(@PathVariable("id") Long id) throws Exception{
		 Hotel Article   = hotelDao.findById(id).get();
		 return Files.readAllBytes(Paths.get(context.getRealPath(".//images//articles//")+Article.getLogo()));
	 }
	
	
	/*@CrossOrigin
	@GetMapping("/getbyidd/{id}")
	public List<hotelModel> readResourcesById(@PathVariable Long id){
        return hotelService.readResourcesById(id);
    }*/
	@DeleteMapping(value = "/{id}")
	public boolean deleteHotel(@PathVariable long id) {
		hotelDao.deleteById(id);
		return true;
	}
	
	@CrossOrigin
	@PutMapping("/update")
	public Hotel update(@RequestBody Hotel hotel) throws NoSuchAlgorithmException {
		try {

			Optional<Hotel> hotell = hotelDao.findById(hotel.getIdHotel());
			hotell.get().setAdr1Hotel(hotel.getAdr1Hotel());
			hotell.get().setAdr2Hotel(hotel.getAdr2Hotel());
			hotell.get().setAdr3Hotel(hotel.getAdr3Hotel());
			hotell.get().setCcb1Hotel(hotel.getCcb1Hotel());
			hotell.get().setCcb2Hotel(hotel.getCcb2Hotel());
			hotell.get().setChambreHotel(hotel.getChambreHotel());
			hotell.get().setCptAvanceHotel(hotel.getCptAvanceHotel());
			hotell.get().setCptClientHotel(hotel.getCptClientHotel());
			hotell.get().setCptTransHotel(hotel.getCptTransHotel());

			hotell.get().setDebSaisonHotel(hotel.getDebSaisonHotel());
			hotell.get().setEmail(hotel.getEmail());
			hotell.get().setFaxHotel(hotel.getFaxHotel());
			hotell.get().setFinSaisonHotel(hotel.getFinSaisonHotel());
			hotell.get().setInputHotel(hotel.getInputHotel());
			hotell.get().setJorBanqueHotel(hotel.getJorBanqueHotel());
			hotell.get().setJorCaisseHotel(hotel.getJorCaisseHotel());
			hotell.get().setJorOdHotel(hotel.getJorOdHotel());
			hotell.get().setJorVenteHotel(hotel.getJorVenteHotel());
			hotell.get().setLaisCaisseHotel(hotel.getLaisCaisseHotel());
			hotell.get().setLaisStandHotel(hotel.getLaisStandHotel());
			hotell.get().setLitHotel(hotel.getLitHotel());
			hotell.get().setMatFiscale(hotel.getMatFiscale());
			hotell.get().setNomHotel(hotel.getNomHotel());
			hotell.get().setRefHotel(hotel.getRefHotel());
			hotell.get().setSigleHotel(hotel.getSigleHotel());
			hotell.get().setStatusHotel(hotel.getStatusHotel());
			hotell.get().setTelHotel(hotel.getTelHotel());

		
		
		
			Hotel HotelUpdated = hotelDao.save(hotell.get());
			return HotelUpdated;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

}
