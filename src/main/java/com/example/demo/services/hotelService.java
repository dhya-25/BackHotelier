package com.example.demo.services;

import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.dao.HotelDao;
import com.example.demo.dao.UtilisateurDao;
import com.example.demo.entity.Hotel;
import com.example.demo.entity.Utilisateur;
import com.example.demo.model.hotelModel;
import com.example.demo.model.utilisateurModel;

@Service
public class hotelService {

	@Autowired
	UtilisateurDao utilisateurDao;

	@Autowired
	HotelDao hotelDao;

	@Transactional
	public String createResource(hotelModel hotelmodel) {
		if (!hotelDao.existsByNomHotel(hotelmodel.getNomHotel())) {
			Hotel hotel = new Hotel();
			BeanUtils.copyProperties(hotelmodel, hotel);
			try {
				hotelDao.save(hotel);
				hotelmodel.getUtilisateurModels().stream().forEach(c -> {
					Utilisateur utilisateur = new Utilisateur();

					BeanUtils.copyProperties(c, utilisateur);
					try {
						utilisateurDao.save(utilisateur);
					} catch (Exception e) {
						throw e;
					}

				});
			} catch (Exception e) {
				throw e;
			}

			return "Resource added successfully!";
		} else {
			return "Duplicate resource";
		}
	}

	@Transactional
	public List<hotelModel> readResources() {
		List<hotelModel> hotelModels = new ArrayList<>();
		List<Hotel> hotels = new ArrayList<>();
		try {
			hotels = hotelDao.findAll(); // Fetch all the Students from the database.
		} catch (Exception e) {
			throw e;
		}

		if (hotels.size() > 0) { // If the above list is not empty then return the list after unwrapping all the
									// records
			hotels.stream().forEach(s -> { // Traverse through the reords
				hotelModel hotel = new hotelModel();
				/*
				 * hotel.setAdr1_hotel(s.getAdr1_hotel());
				 * hotel.setAdr2_hotel(s.getAdr2_hotel());
				 * hotel.setAdr3_hotel(s.getAdr3_hotel()); hotel.setNom_hotel(s.getNom_hotel());
				 * hotel.setCcb1_hotel(s.getCcb1_hotel());
				 * hotel.setCcb2_hotel(s.getCcb2_hotel()); hotel.setTel_hotel(s.getTel_hotel());
				 * hotel.setFax_hotel(s.getFax_hotel());
				 * hotel.setChambre_hotel(s.getChambre_hotel());
				 * hotel.setCpt_avance_hotel(s.getCpt_avance_hotel());
				 * hotel.setCpt_trans_hotel(s.getCpt_trans_hotel());
				 * hotel.setCpt_client_hotel(s.getCpt_client_hotel());
				 * hotel.setFin_saison_hotel(s.getFin_saison_hotel());
				 * hotel.setInput_hotel(s.getInput_hotel());
				 * hotel.setJor_banque_hotel(s.getJor_banque_hotel());
				 * hotel.setJor_caisse_hotel(s.getJor_caisse_hotel());
				 * hotel.setJor_od_hotel(s.getJor_od_hotel());
				 * hotel.setJor_vente_hotel(s.getJor_vente_hotel());
				 * hotel.setLais_caisse_hotel(s.getLais_caisse_hotel());
				 * hotel.setLais_stand_hotel(s.getLais_stand_hotel());
				 * hotel.setLit_hotel(s.getLit_hotel());
				 * hotel.setMat_fiscale(s.getMat_fiscale());
				 * hotel.setRef_hotel(s.getRef_hotel());
				 * hotel.setSigle_hotel(s.getSigle_hotel());
				 * hotel.setStatus_hotel(s.getStatus_hotel());
				 * hotel.setDeb_saison_hotel(s.getDeb_saison_hotel());
				 * hotel.setEmail(s.getEmail());
				 */

				BeanUtils.copyProperties(s, hotel);
				hotelModels.add(hotel);

				List<Utilisateur> utilisateurs = new ArrayList<>();
				List<utilisateurModel> models = new ArrayList<>();
				try {
					utilisateurs = utilisateurDao.findByRef(s.getRefHotel()); // Fetch all the courses by email ID.
				} catch (Exception e) {
					throw e;
				}
				if (utilisateurs.size() > 0) {
					utilisateurs.stream().forEach(c -> {
						utilisateurModel model = new utilisateurModel();
						BeanUtils.copyProperties(c, model);
						models.add(model);
					});
				}
				hotel.setUtilisateurModels(models);
				hotelModels.add(hotel);
			});
		}
		return hotelModels;
	}

	@Transactional
	public List<hotelModel> readResourcesById(Long id) {

		List<hotelModel> hotelModels = new ArrayList<>();
		Hotel hotelss = new Hotel();

		List<Hotel> hotels = new ArrayList<>();
		
	
		try {
			hotels = hotelDao.findByIdd(id); // Fetch all the Students from the database.
		} catch (Exception e) {
			throw e;
		}

		if (hotels.size() > 0) { // If the above list is not empty then return the list after unwrapping all the
									// records
			hotels.stream().forEach(s -> { // Traverse through the reords
				hotelModel hotel = new hotelModel();

				BeanUtils.copyProperties(s, hotel);
				hotelModels.add(hotel);

				List<Utilisateur> utilisateurs = new ArrayList<>();
				List<utilisateurModel> models = new ArrayList<>();
				try {
					utilisateurs = utilisateurDao.findByRef(s.getRefHotel()); // Fetch all the courses by email ID.
				} catch (Exception e) {
					throw e;
				}
				if (utilisateurs.size() > 0) {
					utilisateurs.stream().forEach(c -> {
						utilisateurModel model = new utilisateurModel();
						BeanUtils.copyProperties(c, model);
						models.add(model);
					});
				}
				hotel.setUtilisateurModels(models);
				hotelModels.add(hotel);
			});
		}
		return hotelModels;
	}

	/*
	 * @Transactional public String updateResource(hotelModel studentModel){ if
	 * (hotelDao.existsByEmail(studentModel.getEmail())){ //Check for availability
	 * of resource by email ID. Update if resource exists. Hotel student =
	 * hotelDao.findByEmail(studentModel.getEmail()).get(0);
	 * BeanUtils.copyProperties(studentModel, student); try {
	 * hotelDao.save(student); //Update Student List<Utilisateur> courses =
	 * utilisateurDao.findCourseByEmail(studentModel.getEmail()); //Read the courses
	 * from the database for (int i = 0; i <
	 * studentModel.getUtilisateurModels().size(); i++){
	 * BeanUtils.copyProperties(studentModel.getUtilisateurModels().get(i),courses.
	 * get(i)); }
	 * 
	 * courses.stream().forEach(c -> { Utilisateur course =
	 * utilisateurDao.findById(c.getCode_utilisateur()).get();
	 * BeanUtils.copyProperties(c, course);
	 * course.setEmail(studentModel.getEmail()); courseRepository.save(course); });
	 * 
	 * }catch (Exception e){ throw e; } return "Resource was updated successfully";
	 * }else{ return "Resource does not exist"; } }
	 */
	/*
	 * @Transactional public String deleteResource(hotelModel studentModel){
	 * 
	 * try { hotelDao.deleteByEmail(studentModel.getEmail()); try {
	 * utilisateurDao.deleteByEmail(studentModel.getEmail()); }catch (Exception e){
	 * throw e; } }catch (Exception e){ throw e; } return "Removed successfully!";
	 * 
	 * }
	 */

}
