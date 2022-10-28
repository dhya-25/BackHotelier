package com.example.demo.model;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;

public class utilisateurModel {
	
	private String nom_user;
	private String password;
	private String mat_pers;
	private Long duree_acc;
	private String adresse;
	private String tel;
	private String cin;
	private String ref;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date date_deb;
	
	
	
	
	public utilisateurModel(String nom_user, String password, String mat_pers, Long duree_acc, String adresse,
			String tel, String cin, String refHotel, Date date_deb) {
		super();
		this.nom_user = nom_user;
		this.password = password;
		this.mat_pers = mat_pers;
		this.duree_acc = duree_acc;
		this.adresse = adresse;
		this.tel = tel;
		this.cin = cin;
		this.ref = refHotel;
		this.date_deb = date_deb;
	}



	public utilisateurModel() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getRef() {
		return ref;
	}



	public void setRef(String refHotel) {
		this.ref = refHotel;
	}



	public String getNom_user() {
		return nom_user;
	}
	public void setNom_user(String nom_user) {
		this.nom_user = nom_user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public Long getDuree_acc() {
		return duree_acc;
	}
	public void setDuree_acc(Long duree_acc) {
		this.duree_acc = duree_acc;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getCin() {
		return cin;
	}
	public void setCin(String cin) {
		this.cin = cin;
	}
	public Date getDate_deb() {
		return date_deb;
	}
	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}
	
	
	

}
