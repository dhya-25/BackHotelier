package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Reservation {

	@Id
	@GeneratedValue /* strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR" */
	// @SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName =
	// "SEQ_CONTRATAGENCE", allocationSize = 1)
	private Long idReservation;

	@Temporal(TemporalType.DATE)
	private Date date_res;

	private String commentaire;
	@Temporal(TemporalType.DATE)
	private Date date_arr;
	@Temporal(TemporalType.DATE)
	private Date date_dep;

	private String heure_arr;
	private String heure_dep;

	private String aero_arr;
	private String aero_dep;

	private String vol_arr;
	private String vol_dep;
	private Long remise_resa;
	private boolean etat_resa;
	private String type_resa;
	private String chef_groupe;

	private Long cod_user_creation;
	private Long cod_user_modification;
	@Temporal(TemporalType.DATE)
	private Date date_crreation;
	@Temporal(TemporalType.DATE)
	private Date date_modification;

	@Temporal(TemporalType.DATE)
	private Date date_resa_agence;

	private String groupe;

	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)

	private Agence agence;

	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)

	private Chambre chambre;

	@OneToMany(mappedBy = "reservation")
	private List<Hotel> hotel;

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reservation(Date date_res, String commentaire, Date date_arr, Date date_dep, String heure_arr,
			String heure_dep, String aero_arr, String aero_dep, String vol_arr, String vol_dep, Long remise_resa,
			boolean etat_resa, String type_resa, String chef_groupe, Long cod_user_creation, Long cod_user_modification,
			Date date_crreation, Date date_modification, Date date_resa_agence, String groupe, Agence agence,
			Chambre chambre, List<Hotel> hotel) {
		super();
		this.date_res = date_res;
		this.commentaire = commentaire;
		this.date_arr = date_arr;
		this.date_dep = date_dep;
		this.heure_arr = heure_arr;
		this.heure_dep = heure_dep;
		this.aero_arr = aero_arr;
		this.aero_dep = aero_dep;
		this.vol_arr = vol_arr;
		this.vol_dep = vol_dep;
		this.remise_resa = remise_resa;
		this.etat_resa = etat_resa;
		this.type_resa = type_resa;
		this.chef_groupe = chef_groupe;
		this.cod_user_creation = cod_user_creation;
		this.cod_user_modification = cod_user_modification;
		this.date_crreation = date_crreation;
		this.date_modification = date_modification;
		this.date_resa_agence = date_resa_agence;
		this.groupe = groupe;
		this.agence = agence;
		this.chambre = chambre;
		this.hotel = hotel;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public Date getDate_res() {
		return date_res;
	}

	public void setDate_res(Date date_res) {
		this.date_res = date_res;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public Date getDate_arr() {
		return date_arr;
	}

	public void setDate_arr(Date date_arr) {
		this.date_arr = date_arr;
	}

	public Date getDate_dep() {
		return date_dep;
	}

	public void setDate_dep(Date date_dep) {
		this.date_dep = date_dep;
	}

	public String getHeure_arr() {
		return heure_arr;
	}

	public void setHeure_arr(String heure_arr) {
		this.heure_arr = heure_arr;
	}

	public String getHeure_dep() {
		return heure_dep;
	}

	public void setHeure_dep(String heure_dep) {
		this.heure_dep = heure_dep;
	}

	public String getAero_arr() {
		return aero_arr;
	}

	public void setAero_arr(String aero_arr) {
		this.aero_arr = aero_arr;
	}

	public String getAero_dep() {
		return aero_dep;
	}

	public void setAero_dep(String aero_dep) {
		this.aero_dep = aero_dep;
	}

	public String getVol_arr() {
		return vol_arr;
	}

	public void setVol_arr(String vol_arr) {
		this.vol_arr = vol_arr;
	}

	public String getVol_dep() {
		return vol_dep;
	}

	public void setVol_dep(String vol_dep) {
		this.vol_dep = vol_dep;
	}

	public Long getRemise_resa() {
		return remise_resa;
	}

	public void setRemise_resa(Long remise_resa) {
		this.remise_resa = remise_resa;
	}

	public boolean isEtat_resa() {
		return etat_resa;
	}

	public void setEtat_resa(boolean etat_resa) {
		this.etat_resa = etat_resa;
	}

	public String getType_resa() {
		return type_resa;
	}

	public void setType_resa(String type_resa) {
		this.type_resa = type_resa;
	}

	public String getChef_groupe() {
		return chef_groupe;
	}

	public void setChef_groupe(String chef_groupe) {
		this.chef_groupe = chef_groupe;
	}

	public Long getCod_user_creation() {
		return cod_user_creation;
	}

	public void setCod_user_creation(Long cod_user_creation) {
		this.cod_user_creation = cod_user_creation;
	}

	public Long getCod_user_modification() {
		return cod_user_modification;
	}

	public void setCod_user_modification(Long cod_user_modification) {
		this.cod_user_modification = cod_user_modification;
	}

	public Date getDate_crreation() {
		return date_crreation;
	}

	public void setDate_crreation(Date date_crreation) {
		this.date_crreation = date_crreation;
	}

	public Date getDate_modification() {
		return date_modification;
	}

	public void setDate_modification(Date date_modification) {
		this.date_modification = date_modification;
	}

	public Date getDate_resa_agence() {
		return date_resa_agence;
	}

	public void setDate_resa_agence(Date date_resa_agence) {
		this.date_resa_agence = date_resa_agence;
	}

	public String getGroupe() {
		return groupe;
	}

	public void setGroupe(String groupe) {
		this.groupe = groupe;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	public Chambre getChambre() {
		return chambre;
	}

	public void setChambre(Chambre chambre) {
		this.chambre = chambre;
	}

	public List<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(List<Hotel> hotel) {
		this.hotel = hotel;
	}

	
}
