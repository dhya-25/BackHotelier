package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Consomation {

	

	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CONSOMMATION", allocationSize = 1)
	
	private Long idConsommation;
	
	private Long mntConso;
	private long codCons;
	private long codResid;
	private String codPrestation;
	private long codUser;
	private String codHotel;
	private String codAgence;

	@Temporal(TemporalType.DATE)
	private Date dateConso;
	
	private String heureConso;
	
	private String numBon;
	private String typeConso;
	@Temporal(TemporalType.DATE)
	private Date dateSys;
	
	private String offre;
	private String typeClient;
	private Long numFactInd;
	private Long numFactDeb;
	private String forfait;
	private String codeDev;
	private Long tauxDev;
	private Long unite;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)

	private Resident residents;

	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Facture facture;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Prestation prestation;

	public Consomation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Consomation(Long mntConso, long codCons, long codResid, String codPrestation, long codUser, String codHotel,
			String codAgence, Date dateConso, String heureConso, String numBon, String typeConso, Date dateSys,
			String offre, String typeClient, Long numFactInd, Long numFactDeb, String forfait, String codeDev,
			Long tauxDev, Long unite, Resident residents, Facture facture, Prestation prestation) {
		super();
		this.mntConso = mntConso;
		this.codCons = codCons;
		this.codResid = codResid;
		this.codPrestation = codPrestation;
		this.codUser = codUser;
		this.codHotel = codHotel;
		this.codAgence = codAgence;
		this.dateConso = dateConso;
		this.heureConso = heureConso;
		this.numBon = numBon;
		this.typeConso = typeConso;
		this.dateSys = dateSys;
		this.offre = offre;
		this.typeClient = typeClient;
		this.numFactInd = numFactInd;
		this.numFactDeb = numFactDeb;
		this.forfait = forfait;
		this.codeDev = codeDev;
		this.tauxDev = tauxDev;
		this.unite = unite;
		this.residents = residents;
		this.facture = facture;
		this.prestation = prestation;
	}

	public Long getIdConsommation() {
		return idConsommation;
	}

	public void setIdConsommation(Long idConsommation) {
		this.idConsommation = idConsommation;
	}

	public Long getMntConso() {
		return mntConso;
	}

	public void setMntConso(Long mntConso) {
		this.mntConso = mntConso;
	}

	public long getCodCons() {
		return codCons;
	}

	public void setCodCons(long codCons) {
		this.codCons = codCons;
	}

	public long getCodResid() {
		return codResid;
	}

	public void setCodResid(long codResid) {
		this.codResid = codResid;
	}

	public String getCodPrestation() {
		return codPrestation;
	}

	public void setCodPrestation(String codPrestation) {
		this.codPrestation = codPrestation;
	}

	public long getCodUser() {
		return codUser;
	}

	public void setCodUser(long codUser) {
		this.codUser = codUser;
	}

	public String getCodHotel() {
		return codHotel;
	}

	public void setCodHotel(String codHotel) {
		this.codHotel = codHotel;
	}

	public String getCodAgence() {
		return codAgence;
	}

	public void setCodAgence(String codAgence) {
		this.codAgence = codAgence;
	}

	public Date getDateConso() {
		return dateConso;
	}

	public void setDateConso(Date dateConso) {
		this.dateConso = dateConso;
	}

	public String getHeureConso() {
		return heureConso;
	}

	public void setHeureConso(String heureConso) {
		this.heureConso = heureConso;
	}

	public String getNumBon() {
		return numBon;
	}

	public void setNumBon(String numBon) {
		this.numBon = numBon;
	}

	public String getTypeConso() {
		return typeConso;
	}

	public void setTypeConso(String typeConso) {
		this.typeConso = typeConso;
	}

	public Date getDateSys() {
		return dateSys;
	}

	public void setDateSys(Date dateSys) {
		this.dateSys = dateSys;
	}

	public String getOffre() {
		return offre;
	}

	public void setOffre(String offre) {
		this.offre = offre;
	}

	public String getTypeClient() {
		return typeClient;
	}

	public void setTypeClient(String typeClient) {
		this.typeClient = typeClient;
	}

	public Long getNumFactInd() {
		return numFactInd;
	}

	public void setNumFactInd(Long numFactInd) {
		this.numFactInd = numFactInd;
	}

	public Long getNumFactDeb() {
		return numFactDeb;
	}

	public void setNumFactDeb(Long numFactDeb) {
		this.numFactDeb = numFactDeb;
	}

	public String getForfait() {
		return forfait;
	}

	public void setForfait(String forfait) {
		this.forfait = forfait;
	}

	public String getCodeDev() {
		return codeDev;
	}

	public void setCodeDev(String codeDev) {
		this.codeDev = codeDev;
	}

	public Long getTauxDev() {
		return tauxDev;
	}

	public void setTauxDev(Long tauxDev) {
		this.tauxDev = tauxDev;
	}

	public Long getUnite() {
		return unite;
	}

	public void setUnite(Long unite) {
		this.unite = unite;
	}

	public Resident getResidents() {
		return residents;
	}

	public void setResidents(Resident residents) {
		this.residents = residents;
	}

	public Facture getFacture() {
		return facture;
	}

	public void setFacture(Facture facture) {
		this.facture = facture;
	}

	public Prestation getPrestation() {
		return prestation;
	}

	public void setPrestation(Prestation prestation) {
		this.prestation = prestation;
	}

	
	
}
