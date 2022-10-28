package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.example.demo.entity.Reservation;
import com.example.demo.entity.RoomRack;


public class hotelModel {

	
	private String nomHotel;
	private String adr1Hotel;
	private String adr2Hotel;
	private String adr3Hotel;
	private String telHotel;
	private String faxHotel;
	private String matHiscale;
	private Long chambreHotel;
	private Long litHotel;
	
	

	@Temporal(TemporalType.DATE)
	private Date debSaison_hotel;

	@Temporal(TemporalType.DATE)
	private Date finSaison_hotel;
	private String statusHotel;
	private String ccb1Hotel;
	private String ccb2Hotel;
	private String cptClientHotel;
	private String cptAvanceHotel;
	private String jorVenteHotel;
	private String jorOdHotel;
	private String jorCaisseHotel;
	private String jorBanqueHotel;
	private String laisCaisseHotel;
	private String laisStandHotel;
	private String sigleHotel;
	private String refHotel;
	private String inputHotel;
	private String cptTransHotel;
	private String email;
	
	
    private List<utilisateurModel> utilisateurModels;
	



	public hotelModel() {
		super();
	
	}




	public hotelModel(String nomHotel, String adr1Hotel, String adr2Hotel, String adr3Hotel, String telHotel,
			String faxHotel, String matHiscale, Long chambreHotel, Long litHotel, Date debSaison_hotel,
			Date finSaison_hotel, String statusHotel, String ccb1Hotel, String ccb2Hotel, String cptClientHotel,
			String cptAvanceHotel, String jorVenteHotel, String jorOdHotel, String jorCaisseHotel,
			String jorBanqueHotel, String laisCaisseHotel, String laisStandHotel, String sigleHotel, String refHotel,
			String inputHotel, String cptTransHotel, String email, List<utilisateurModel> utilisateurModels) {
		super();
		this.nomHotel = nomHotel;
		this.adr1Hotel = adr1Hotel;
		this.adr2Hotel = adr2Hotel;
		this.adr3Hotel = adr3Hotel;
		this.telHotel = telHotel;
		this.faxHotel = faxHotel;
		this.matHiscale = matHiscale;
		this.chambreHotel = chambreHotel;
		this.litHotel = litHotel;
		this.debSaison_hotel = debSaison_hotel;
		this.finSaison_hotel = finSaison_hotel;
		this.statusHotel = statusHotel;
		this.ccb1Hotel = ccb1Hotel;
		this.ccb2Hotel = ccb2Hotel;
		this.cptClientHotel = cptClientHotel;
		this.cptAvanceHotel = cptAvanceHotel;
		this.jorVenteHotel = jorVenteHotel;
		this.jorOdHotel = jorOdHotel;
		this.jorCaisseHotel = jorCaisseHotel;
		this.jorBanqueHotel = jorBanqueHotel;
		this.laisCaisseHotel = laisCaisseHotel;
		this.laisStandHotel = laisStandHotel;
		this.sigleHotel = sigleHotel;
		this.refHotel = refHotel;
		this.inputHotel = inputHotel;
		this.cptTransHotel = cptTransHotel;
		this.email = email;
		this.utilisateurModels = utilisateurModels;
	}




	public String getNomHotel() {
		return nomHotel;
	}




	public void setNomHotel(String nomHotel) {
		this.nomHotel = nomHotel;
	}




	public String getAdr1Hotel() {
		return adr1Hotel;
	}




	public void setAdr1Hotel(String adr1Hotel) {
		this.adr1Hotel = adr1Hotel;
	}




	public String getAdr2Hotel() {
		return adr2Hotel;
	}




	public void setAdr2Hotel(String adr2Hotel) {
		this.adr2Hotel = adr2Hotel;
	}




	public String getAdr3Hotel() {
		return adr3Hotel;
	}




	public void setAdr3Hotel(String adr3Hotel) {
		this.adr3Hotel = adr3Hotel;
	}




	public String getTelHotel() {
		return telHotel;
	}




	public void setTelHotel(String telHotel) {
		this.telHotel = telHotel;
	}




	public String getFaxHotel() {
		return faxHotel;
	}




	public void setFaxHotel(String faxHotel) {
		this.faxHotel = faxHotel;
	}




	public String getMatHiscale() {
		return matHiscale;
	}




	public void setMatHiscale(String matHiscale) {
		this.matHiscale = matHiscale;
	}




	public Long getChambreHotel() {
		return chambreHotel;
	}




	public void setChambreHotel(Long chambreHotel) {
		this.chambreHotel = chambreHotel;
	}




	public Long getLitHotel() {
		return litHotel;
	}




	public void setLitHotel(Long litHotel) {
		this.litHotel = litHotel;
	}




	public Date getDebSaison_hotel() {
		return debSaison_hotel;
	}




	public void setDebSaison_hotel(Date debSaison_hotel) {
		this.debSaison_hotel = debSaison_hotel;
	}




	public Date getFinSaison_hotel() {
		return finSaison_hotel;
	}




	public void setFinSaison_hotel(Date finSaison_hotel) {
		this.finSaison_hotel = finSaison_hotel;
	}




	public String getStatusHotel() {
		return statusHotel;
	}




	public void setStatusHotel(String statusHotel) {
		this.statusHotel = statusHotel;
	}




	public String getCcb1Hotel() {
		return ccb1Hotel;
	}




	public void setCcb1Hotel(String ccb1Hotel) {
		this.ccb1Hotel = ccb1Hotel;
	}




	public String getCcb2Hotel() {
		return ccb2Hotel;
	}




	public void setCcb2Hotel(String ccb2Hotel) {
		this.ccb2Hotel = ccb2Hotel;
	}




	public String getCptClientHotel() {
		return cptClientHotel;
	}




	public void setCptClientHotel(String cptClientHotel) {
		this.cptClientHotel = cptClientHotel;
	}




	public String getCptAvanceHotel() {
		return cptAvanceHotel;
	}




	public void setCptAvanceHotel(String cptAvanceHotel) {
		this.cptAvanceHotel = cptAvanceHotel;
	}




	public String getJorVenteHotel() {
		return jorVenteHotel;
	}




	public void setJorVenteHotel(String jorVenteHotel) {
		this.jorVenteHotel = jorVenteHotel;
	}




	public String getJorOdHotel() {
		return jorOdHotel;
	}




	public void setJorOdHotel(String jorOdHotel) {
		this.jorOdHotel = jorOdHotel;
	}




	public String getJorCaisseHotel() {
		return jorCaisseHotel;
	}




	public void setJorCaisseHotel(String jorCaisseHotel) {
		this.jorCaisseHotel = jorCaisseHotel;
	}




	public String getJorBanqueHotel() {
		return jorBanqueHotel;
	}




	public void setJorBanqueHotel(String jorBanqueHotel) {
		this.jorBanqueHotel = jorBanqueHotel;
	}




	public String getLaisCaisseHotel() {
		return laisCaisseHotel;
	}




	public void setLaisCaisseHotel(String laisCaisseHotel) {
		this.laisCaisseHotel = laisCaisseHotel;
	}




	public String getLaisStandHotel() {
		return laisStandHotel;
	}




	public void setLaisStandHotel(String laisStandHotel) {
		this.laisStandHotel = laisStandHotel;
	}




	public String getSigleHotel() {
		return sigleHotel;
	}




	public void setSigleHotel(String sigleHotel) {
		this.sigleHotel = sigleHotel;
	}




	public String getRefHotel() {
		return refHotel;
	}




	public void setRefHotel(String refHotel) {
		this.refHotel = refHotel;
	}




	public String getInputHotel() {
		return inputHotel;
	}




	public void setInputHotel(String inputHotel) {
		this.inputHotel = inputHotel;
	}




	public String getCptTransHotel() {
		return cptTransHotel;
	}




	public void setCptTransHotel(String cptTransHotel) {
		this.cptTransHotel = cptTransHotel;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public List<utilisateurModel> getUtilisateurModels() {
		return utilisateurModels;
	}




	public void setUtilisateurModels(List<utilisateurModel> utilisateurModels) {
		this.utilisateurModels = utilisateurModels;
	}




	
	
	
}
