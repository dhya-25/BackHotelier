package com.example.demo.response;

import java.util.Date;
import java.util.List;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserInfoResponse {
	private String id;

	  private String username;

	  private String matPers;
		private Long dureeAcc;
		private String adresse;
		private String tel;
		private String cin;

		private Date dateDeb;
		private String ref;

	 
	  private String password;
  private List<String> roles;

public UserInfoResponse(String id, String username, String matPers, Long dureeAcc, String adresse, String tel,
		String cin, Date dateDeb, String ref, String password, List<String> roles) {
	super();
	this.id = id;
	this.username = username;
	this.matPers = matPers;
	this.dureeAcc = dureeAcc;
	this.adresse = adresse;
	this.tel = tel;
	this.cin = cin;
	this.dateDeb = dateDeb;
	this.ref = ref;
	this.password = password;
	this.roles = roles;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getNomUser() {
	return username;
}
public void setNomUser(String nomUser) {
	this.username = nomUser;
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
public List<String> getRoles() {
	return roles;
}
public void setRoles(List<String> roles) {
	this.roles = roles;
}

  
}
