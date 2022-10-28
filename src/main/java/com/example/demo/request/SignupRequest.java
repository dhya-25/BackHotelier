package com.example.demo.request;

import java.util.Date;
import java.util.Set;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class SignupRequest {
	private String id;
	  @NotBlank
	  @Size(min = 3, max = 20)
	  private String username;

	  private String matPers;
		private Long dureeAcc;
		private String adresse;
		private String tel;
		private String cin;

		private Date dateDeb;
		private String ref;
		@NotBlank
		  @Size(min = 6, max = 40)
	  private String password;
	  private Set<String> roles;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Set<String> getRoles() {
		return roles;
	}
	public void setRoles(Set<String> roles) {
		this.roles = roles;
	}
	

   
}
