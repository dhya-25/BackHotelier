package com.example.demo.entity;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonFormat;

@Document(collection = "util")
public class Utilisateur {

	@Id
	private String id;
	private String username;
	private String password;
	private String matPers;
	private Long dureeAcc;
	private String adresse;
	private String tel;
	private String cin;
	@Temporal(TemporalType.DATE)
	@JsonFormat(pattern = "dd-MM-yyyy")
	private Date dateDeb;
	private String ref;

	@DBRef
	  private Set<Role> roles = new HashSet<>();
	

	public Utilisateur() {

	}


	public Utilisateur(String username, String password, String matPers, Long dureeAcc, String adresse, String tel,
			String cin, Date dateDeb, String ref) {
		super();
		this.username = username;
		this.password = password;
		this.matPers = matPers;
		this.dureeAcc = dureeAcc;
		this.adresse = adresse;
		this.tel = tel;
		this.cin = cin;
		this.dateDeb = dateDeb;
		this.ref = ref;
		
	}


	

	

	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getMatPers() {
		return matPers;
	}


	public void setMatPers(String matPers) {
		this.matPers = matPers;
	}


	public Long getDureeAcc() {
		return dureeAcc;
	}


	public void setDureeAcc(Long dureeAcc) {
		this.dureeAcc = dureeAcc;
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


	public Date getDateDeb() {
		return dateDeb;
	}


	public void setDateDeb(Date dateDeb) {
		this.dateDeb = dateDeb;
	}


	public String getRef() {
		return ref;
	}


	public void setRef(String ref) {
		this.ref = ref;
	}


	public Set<Role> getRoles() {
		return roles;
	}


	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}


	@Override
	public String toString() {
		return "Utilisateur [codeUtilisateur=" + id + ", nomUser=" + username + ", password=" + password
				+ ", matPers=" + matPers + ", dureeAcc=" + dureeAcc + ", adresse=" + adresse + ", tel=" + tel + ", cin="
				+ cin + ", dateDeb=" + dateDeb + ", ref=" + ref + ", roles=" + roles + "]";
	}


	
	

}
