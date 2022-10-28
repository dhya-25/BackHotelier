package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Agence {

	
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
//	@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_AGENCE", allocationSize = 1)
	
	private Long idAgence;
	
	private String nomAgence; 
	private String adrOne_Agence;
	private String adrTwo_Agence;
	private String adrTree_Agence;
	private String telAgence;
	private String faxAgence;
	private String telexAgence;
	private String representant;
	private String domiAgence;
	private String typeAgence;
	private String cpteAgence;
	private String etatAgence;
	private String siteWeb;
	private String email;
	private String nomComercial;
	private String paysAgence;
	private String provinceAgence;
	private String codAgence;

	
	@OneToMany(mappedBy = "agence")
	private List<Reservation> reservations;

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(String nomAgence, String adrOne_Agence, String adrTwo_Agence, String adrTree_Agence, String telAgence,
			String faxAgence, String telexAgence, String representant, String domiAgence, String typeAgence,
			String cpteAgence, String etatAgence, String siteWeb, String email, String nomComercial, String paysAgence,
			String provinceAgence, String codAgence,List<Reservation> reservations) {
		super();
		this.nomAgence = nomAgence;
		this.adrOne_Agence = adrOne_Agence;
		this.adrTwo_Agence = adrTwo_Agence;
		this.adrTree_Agence = adrTree_Agence;
		this.telAgence = telAgence;
		this.faxAgence = faxAgence;
		this.telexAgence = telexAgence;
		this.representant = representant;
		this.domiAgence = domiAgence;
		this.typeAgence = typeAgence;
		this.cpteAgence = cpteAgence;
		this.etatAgence = etatAgence;
		this.siteWeb = siteWeb;
		this.email = email;
		this.nomComercial = nomComercial;
		this.paysAgence = paysAgence;
		this.provinceAgence = provinceAgence;
		this.codAgence = codAgence;

		this.reservations = reservations;
	}
	

	public String getCodAgence() {
		return codAgence;
	}

	public void setCodAgence(String codAgence) {
		this.codAgence = codAgence;
	}

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getNomAgence() {
		return nomAgence;
	}

	public void setNomAgence(String nomAgence) {
		this.nomAgence = nomAgence;
	}

	public String getAdrOne_Agence() {
		return adrOne_Agence;
	}

	public void setAdrOne_Agence(String adrOne_Agence) {
		this.adrOne_Agence = adrOne_Agence;
	}

	public String getAdrTwo_Agence() {
		return adrTwo_Agence;
	}

	public void setAdrTwo_Agence(String adrTwo_Agence) {
		this.adrTwo_Agence = adrTwo_Agence;
	}

	public String getAdrTree_Agence() {
		return adrTree_Agence;
	}

	public void setAdrTree_Agence(String adrTree_Agence) {
		this.adrTree_Agence = adrTree_Agence;
	}

	public String getTelAgence() {
		return telAgence;
	}

	public void setTelAgence(String telAgence) {
		this.telAgence = telAgence;
	}

	public String getFaxAgence() {
		return faxAgence;
	}

	public void setFaxAgence(String faxAgence) {
		this.faxAgence = faxAgence;
	}

	public String getTelexAgence() {
		return telexAgence;
	}

	public void setTelexAgence(String telexAgence) {
		this.telexAgence = telexAgence;
	}

	public String getRepresentant() {
		return representant;
	}

	public void setRepresentant(String representant) {
		this.representant = representant;
	}

	public String getDomiAgence() {
		return domiAgence;
	}

	public void setDomiAgence(String domiAgence) {
		this.domiAgence = domiAgence;
	}

	public String getTypeAgence() {
		return typeAgence;
	}

	public void setTypeAgence(String typeAgence) {
		this.typeAgence = typeAgence;
	}

	public String getCpteAgence() {
		return cpteAgence;
	}

	public void setCpteAgence(String cpteAgence) {
		this.cpteAgence = cpteAgence;
	}

	public String getEtatAgence() {
		return etatAgence;
	}

	public void setEtatAgence(String etatAgence) {
		this.etatAgence = etatAgence;
	}

	public String getSiteWeb() {
		return siteWeb;
	}

	public void setSiteWeb(String siteWeb) {
		this.siteWeb = siteWeb;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomComercial() {
		return nomComercial;
	}

	public void setNomComercial(String nomComercial) {
		this.nomComercial = nomComercial;
	}

	public String getPaysAgence() {
		return paysAgence;
	}

	public void setPaysAgence(String paysAgence) {
		this.paysAgence = paysAgence;
	}

	public String getProvinceAgence() {
		return provinceAgence;
	}

	public void setProvinceAgence(String provinceAgence) {
		this.provinceAgence = provinceAgence;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}
	
	
	

	}
