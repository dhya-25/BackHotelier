package com.example.demo.entity;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Etat_Chambre {

	@Id
	@GeneratedValue
	private long idEtatChambre;
	private String etatChambre;
	private String codCateg;
	private String numChambre;
	private String codHotel;

	
@ManyToOne
@JsonProperty(access = Access.WRITE_ONLY)

private TypeChambre typeChambres;


	public Etat_Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Etat_Chambre(String etatChambre, String codCateg, String numChambre, String codHotel,
			TypeChambre typeChambres) {
		super();
		this.etatChambre = etatChambre;
		this.codCateg = codCateg;
		this.numChambre = numChambre;
		this.codHotel = codHotel;
		this.typeChambres = typeChambres;
	}


	public long getIdEtatChambre() {
		return idEtatChambre;
	}


	public void setIdEtatChambre(long idEtatChambre) {
		this.idEtatChambre = idEtatChambre;
	}


	public String getEtatChambre() {
		return etatChambre;
	}


	public void setEtatChambre(String etatChambre) {
		this.etatChambre = etatChambre;
	}


	public String getCodCateg() {
		return codCateg;
	}


	public void setCodCateg(String codCateg) {
		this.codCateg = codCateg;
	}


	public String getNumChambre() {
		return numChambre;
	}


	public void setNumChambre(String numChambre) {
		this.numChambre = numChambre;
	}


	public String getCodHotel() {
		return codHotel;
	}


	public void setCodHotel(String codHotel) {
		this.codHotel = codHotel;
	}


	public TypeChambre getTypeChambres() {
		return typeChambres;
	}


	public void setTypeChambres(TypeChambre typeChambres) {
		this.typeChambres = typeChambres;
	}



	
	
}
