package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class ContratAgence {
	@Id
	@GeneratedValue /* strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR" */
	// @SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName =
	// "SEQ_CONTRATAGENCE", allocationSize = 1)

	private Long idContartAgence;

	@Temporal(TemporalType.DATE)
	private Date dateContrat;
	private Long cpdePeriode;
	private String codeTarif;

	private String codeReduction;
	private String codeSupplement;
	private Long prixReduction;
	private Long prixArragement;
	private Long valeurSupp;
	public ContratAgence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ContratAgence(Date dateContrat, Long cpdePeriode, String codeTarif, String codeReduction,
			String codeSupplement, Long prixReduction, Long prixArragement, Long valeurSupp) {
		super();
		this.dateContrat = dateContrat;
		this.cpdePeriode = cpdePeriode;
		this.codeTarif = codeTarif;
		this.codeReduction = codeReduction;
		this.codeSupplement = codeSupplement;
		this.prixReduction = prixReduction;
		this.prixArragement = prixArragement;
		this.valeurSupp = valeurSupp;
	}
	public Long getIdContartAgence() {
		return idContartAgence;
	}
	public void setIdContartAgence(Long idContartAgence) {
		this.idContartAgence = idContartAgence;
	}
	public Date getDateContrat() {
		return dateContrat;
	}
	public void setDateContrat(Date dateContrat) {
		this.dateContrat = dateContrat;
	}
	public Long getCpdePeriode() {
		return cpdePeriode;
	}
	public void setCpdePeriode(Long cpdePeriode) {
		this.cpdePeriode = cpdePeriode;
	}
	public String getCodeTarif() {
		return codeTarif;
	}
	public void setCodeTarif(String codeTarif) {
		this.codeTarif = codeTarif;
	}
	public String getCodeReduction() {
		return codeReduction;
	}
	public void setCodeReduction(String codeReduction) {
		this.codeReduction = codeReduction;
	}
	public String getCodeSupplement() {
		return codeSupplement;
	}
	public void setCodeSupplement(String codeSupplement) {
		this.codeSupplement = codeSupplement;
	}
	public Long getPrixReduction() {
		return prixReduction;
	}
	public void setPrixReduction(Long prixReduction) {
		this.prixReduction = prixReduction;
	}
	public Long getPrixArragement() {
		return prixArragement;
	}
	public void setPrixArragement(Long prixArragement) {
		this.prixArragement = prixArragement;
	}
	public Long getValeurSupp() {
		return valeurSupp;
	}
	public void setValeurSupp(Long valeurSupp) {
		this.valeurSupp = valeurSupp;
	}

	

}
