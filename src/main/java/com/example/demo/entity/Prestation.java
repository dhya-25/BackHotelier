package com.example.demo.entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity

public class Prestation {

	@Id
	@GeneratedValue
	private long idPrestation;
	private String cod_prestation;
	private String lib_prestation;

	private String dep_prestation;
	private String cod_typp;
	private String cod_tva;
	private String in_arrang;
	private Long default_prix;


	@OneToMany(mappedBy = "prestation")
	private List<Consomation> consomation;

	public Prestation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Prestation(String cod_prestation, String lib_prestation, String dep_prestation, String cod_typp,
			String cod_tva, String in_arrang, Long default_prix, List<Consomation> consomation) {
		super();
		this.cod_prestation = cod_prestation;
		this.lib_prestation = lib_prestation;
		this.dep_prestation = dep_prestation;
		this.cod_typp = cod_typp;
		this.cod_tva = cod_tva;
		this.in_arrang = in_arrang;
		this.default_prix = default_prix;
		this.consomation = consomation;
	}

	public long getIdPrestation() {
		return idPrestation;
	}

	public void setIdPrestation(long idPrestation) {
		this.idPrestation = idPrestation;
	}

	public String getCod_prestation() {
		return cod_prestation;
	}

	public void setCod_prestation(String cod_prestation) {
		this.cod_prestation = cod_prestation;
	}

	public String getLib_prestation() {
		return lib_prestation;
	}

	public void setLib_prestation(String lib_prestation) {
		this.lib_prestation = lib_prestation;
	}

	public String getDep_prestation() {
		return dep_prestation;
	}

	public void setDep_prestation(String dep_prestation) {
		this.dep_prestation = dep_prestation;
	}

	public String getCod_typp() {
		return cod_typp;
	}

	public void setCod_typp(String cod_typp) {
		this.cod_typp = cod_typp;
	}

	public String getCod_tva() {
		return cod_tva;
	}

	public void setCod_tva(String cod_tva) {
		this.cod_tva = cod_tva;
	}

	public String getIn_arrang() {
		return in_arrang;
	}

	public void setIn_arrang(String in_arrang) {
		this.in_arrang = in_arrang;
	}

	public Long getDefault_prix() {
		return default_prix;
	}

	public void setDefault_prix(Long default_prix) {
		this.default_prix = default_prix;
	}

	public List<Consomation> getConsomation() {
		return consomation;
	}

	public void setConsomation(List<Consomation> consomation) {
		this.consomation = consomation;
	}




}
