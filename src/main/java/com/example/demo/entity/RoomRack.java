package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class RoomRack {
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONTRATAGENCE", allocationSize = 1)
	private Long idRoomRack;
	 private Long numChambre ; 
	 private String codNatcod_etat ; 
	 @Temporal(TemporalType.DATE)
	 private Date dateLivrdate_debut ;
	 @Temporal(TemporalType.DATE)
	 private Date dateFin ;
	  
	 @ManyToOne
		private Hotel hotel;

	public RoomRack() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RoomRack(Long numChambre, String codNatcod_etat, Date dateLivrdate_debut, Date dateFin, Hotel hotel) {
		super();
		this.numChambre = numChambre;
		this.codNatcod_etat = codNatcod_etat;
		this.dateLivrdate_debut = dateLivrdate_debut;
		this.dateFin = dateFin;
		this.hotel = hotel;
	}

	public Long getIdRoomRack() {
		return idRoomRack;
	}

	public void setIdRoomRack(Long idRoomRack) {
		this.idRoomRack = idRoomRack;
	}

	public Long getNumChambre() {
		return numChambre;
	}

	public void setNumChambre(Long numChambre) {
		this.numChambre = numChambre;
	}

	public String getCodNatcod_etat() {
		return codNatcod_etat;
	}

	public void setCodNatcod_etat(String codNatcod_etat) {
		this.codNatcod_etat = codNatcod_etat;
	}

	public Date getDateLivrdate_debut() {
		return dateLivrdate_debut;
	}

	public void setDateLivrdate_debut(Date dateLivrdate_debut) {
		this.dateLivrdate_debut = dateLivrdate_debut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Hotel getHotel() {
		return hotel;
	}

	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	 
	



}
