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
public class Arrangement {
	
	@Id
	@GeneratedValue
	private Long idArrangement;

	private String codArrangement;
	private Long rangArrangement;
	private String libArrangement;
	private String premierService;
	private String dernierService;
	private boolean pdej;
	private boolean dej;
	private boolean din;
	private boolean allInclusif;
	
@ManyToOne
@JsonProperty(access = Access.WRITE_ONLY)

private Resident resident;



	public Arrangement() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Arrangement(String codArrangement, Long rangArrangement, String libArrangement, String premierService,
			String dernierService, boolean pdej, boolean dej, boolean din, boolean allInclusif, Resident resident) {
		super();
		this.codArrangement = codArrangement;
		this.rangArrangement = rangArrangement;
		this.libArrangement = libArrangement;
		this.premierService = premierService;
		this.dernierService = dernierService;
		this.pdej = pdej;
		this.dej = dej;
		this.din = din;
		this.allInclusif = allInclusif;
		this.resident = resident;
	}



	public Long getIdArrangement() {
		return idArrangement;
	}



	public void setIdArrangement(Long idArrangement) {
		this.idArrangement = idArrangement;
	}



	public String getCodArrangement() {
		return codArrangement;
	}



	public void setCodArrangement(String codArrangement) {
		this.codArrangement = codArrangement;
	}



	public Long getRangArrangement() {
		return rangArrangement;
	}



	public void setRangArrangement(Long rangArrangement) {
		this.rangArrangement = rangArrangement;
	}



	public String getLibArrangement() {
		return libArrangement;
	}



	public void setLibArrangement(String libArrangement) {
		this.libArrangement = libArrangement;
	}



	public String getPremierService() {
		return premierService;
	}



	public void setPremierService(String premierService) {
		this.premierService = premierService;
	}



	public String getDernierService() {
		return dernierService;
	}



	public void setDernierService(String dernierService) {
		this.dernierService = dernierService;
	}



	public boolean isPdej() {
		return pdej;
	}



	public void setPdej(boolean pdej) {
		this.pdej = pdej;
	}



	public boolean isDej() {
		return dej;
	}



	public void setDej(boolean dej) {
		this.dej = dej;
	}



	public boolean isDin() {
		return din;
	}



	public void setDin(boolean din) {
		this.din = din;
	}



	public boolean isAllInclusif() {
		return allInclusif;
	}



	public void setAllInclusif(boolean allInclusif) {
		this.allInclusif = allInclusif;
	}



	public Resident getResident() {
		return resident;
	}



	public void setResident(Resident resident) {
		this.resident = resident;
	}

	

	
	
	

}
