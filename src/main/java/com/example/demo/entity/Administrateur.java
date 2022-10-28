package com.example.demo.entity;

import java.math.BigDecimal;
import java.util.Date;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Administrateur")
public class Administrateur {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	
	private Long id;

	private String useMatricule;

	private String adminLogin;
	
	private String adminLname;
	
	private String adminFname;
	
	private String adminPassword;

	private Long nbEssai;
	
	@Temporal(TemporalType.DATE)
	private Date crtdt;
	
	@Temporal(TemporalType.DATE)
	private Date lastConx;
	
	private String cpteStatus;

	
	
	public Administrateur(long id, String use_matricule, String adminLogin, String adminLname, String adminFname,
			String adminPassword, Long nbEssai, Date crtdt, Date lastConx, String cpteStatus) {
		super();
		this.id = id;
		this.useMatricule = use_matricule;
		this.adminLogin = adminLogin;
		this.adminLname = adminLname;
		this.adminFname = adminFname;
		this.adminPassword = adminPassword;
		this.nbEssai = nbEssai;
		this.crtdt = crtdt;
		this.lastConx = lastConx;
		this.cpteStatus = cpteStatus;
	}

	public Administrateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUse_matricule() {
		return useMatricule;
	}

	public void setUse_matricule(String use_matricule) {
		this.useMatricule = use_matricule;
	}

	public String getAdminLogin() {
		return adminLogin;
	}

	public void setAdminLogin(String adminLogin) {
		this.adminLogin = adminLogin;
	}

	public String getAdminLname() {
		return adminLname;
	}

	public void setAdminLname(String adminLname) {
		this.adminLname = adminLname;
	}

	public String getAdminFname() {
		return adminFname;
	}

	public void setAdminFname(String adminFname) {
		this.adminFname = adminFname;
	}

	public String getAdminPassword() {
		return adminPassword;
	}

	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}

	public Long getNbEssai() {
		return nbEssai;
	}

	public void setNbEssai(Long nbEssai) {
		this.nbEssai = nbEssai;
	}

	public Date getCrtdt() {
		return crtdt;
	}

	public void setCrtdt(Date crtdt) {
		this.crtdt = crtdt;
	}

	public Date getLastConx() {
		return lastConx;
	}

	public void setLastConx(Date lastConx) {
		this.lastConx = lastConx;
	}

	public String getCpteStatus() {
		return cpteStatus;
	}

	public void setCpteStatus(String cpteStatus) {
		this.cpteStatus = cpteStatus;
	}

	@Override
	public String toString() {
		return "Administrateur [id=" + id + ", use_matricule=" + useMatricule + ", adminLogin=" + adminLogin
				+ ", adminLname=" + adminLname + ", adminFname=" + adminFname + ", adminPassword=" + adminPassword
				+ ", nbEssai=" + nbEssai + ", crtdt=" + crtdt + ", lastConx=" + lastConx + ", cpteStatus=" + cpteStatus
				+ "]";
	}
	
	
	


}
