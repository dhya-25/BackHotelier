package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class Facture {

	@Id
	@GeneratedValue /* strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR" */
	// @SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName =
	// "SEQ_CONTRATAGENCE", allocationSize = 1)

	private Long idFacture;
	private Long numFactInd;

	@Temporal(TemporalType.DATE)
	private Date dateArr;
	@Temporal(TemporalType.DATE)
	private Date dateDep;
	private String commentaire;
	private Long mntHtax;
	private Long mntHtva;
	private Long mnttva;

	private Long mntFdcst;
	private Long tbreFiscal;
	private Long mntTtc;
	private String mntTtlettre;
	private String promotion;
	private Long nbrGratuit;
	private String typePaiment;
	@Temporal(TemporalType.DATE)
	private Date dateFacture;
	private String nomClient;
	private String typeFacture;
	private String codHotel;
	private String codAgence;
	private long codResid;



	@OneToMany(mappedBy = "factures")
	@JsonProperty(access = Access.WRITE_ONLY)

	private List<Chambre> chambre;
	
@OneToMany(mappedBy = "facture")

private List<Consomation> consomations;

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}
//
//	public Facture(Date dateArr, Date dateDep, String commentaire, Long mntHtax, Long mntHtva, Long mntFdcst,
//			Long tbreFiscal, Long mntTtc, String mntTtlettre, String promotion, Long nbrGratuit, String typePaiment,
//			Date dateFacture, String nomClient, String typeFacture, List<Chambre> chambre,
//			List<Consomation> consomation) {
//		
		
		public Facture(Facture facture) {
		super();
		this.numFactInd = facture.numFactInd;
		this.mnttva = facture.mnttva;
		this.codAgence = facture.codAgence;
		this.codHotel = facture.codHotel;


		this.dateArr = facture.dateArr;
		this.dateDep = facture.dateDep;
		this.commentaire = facture.commentaire;
		this.mntHtax = facture.mntHtax;
		this.mntHtva = facture.mntHtva;
		this.mntFdcst = facture.mntFdcst;
		this.tbreFiscal = facture.tbreFiscal;
		this.mntTtc = facture.mntTtc;
		this.mntTtlettre = facture.mntTtlettre;
		this.promotion = facture.promotion;
		this.nbrGratuit = facture.nbrGratuit;
		this.typePaiment = facture.typePaiment;
		this.dateFacture = facture.dateFacture;
		this.nomClient = facture.nomClient;
		this.typeFacture = facture.typeFacture;
		this.chambre = facture.chambre;
		this.consomations = facture.consomations;
		this.codResid = facture.codResid;

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

		public Long getMnttva() {
			return mnttva;
		}

		public void setMnttva(Long mnttva) {
			this.mnttva = mnttva;
		}

		public Long getIdFacture() {
			return idFacture;
		}

		public void setIdFacture(Long idFacture) {
			this.idFacture = idFacture;
		}

		public Long getNumFactInd() {
			return numFactInd;
		}

		public void setNumFactInd(Long numFactInd) {
			this.numFactInd = numFactInd;
		}

		public Date getDateArr() {
			return dateArr;
		}

		public void setDateArr(Date dateArr) {
			this.dateArr = dateArr;
		}

		public Date getDateDep() {
			return dateDep;
		}

		public void setDateDep(Date dateDep) {
			this.dateDep = dateDep;
		}

		public String getCommentaire() {
			return commentaire;
		}

		public void setCommentaire(String commentaire) {
			this.commentaire = commentaire;
		}

		public Long getMntHtax() {
			return mntHtax;
		}

		public void setMntHtax(Long mntHtax) {
			this.mntHtax = mntHtax;
		}

		public Long getMntHtva() {
			return mntHtva;
		}

		public void setMntHtva(Long mntHtva) {
			this.mntHtva = mntHtva;
		}

		public Long getMntFdcst() {
			return mntFdcst;
		}

		public void setMntFdcst(Long mntFdcst) {
			this.mntFdcst = mntFdcst;
		}

		public Long getTbreFiscal() {
			return tbreFiscal;
		}

		public void setTbreFiscal(Long tbreFiscal) {
			this.tbreFiscal = tbreFiscal;
		}

		public Long getMntTtc() {
			return mntTtc;
		}

		public void setMntTtc(Long mntTtc) {
			this.mntTtc = mntTtc;
		}

		public String getMntTtlettre() {
			return mntTtlettre;
		}

		public void setMntTtlettre(String mntTtlettre) {
			this.mntTtlettre = mntTtlettre;
		}

		public String getPromotion() {
			return promotion;
		}

		public void setPromotion(String promotion) {
			this.promotion = promotion;
		}

		public Long getNbrGratuit() {
			return nbrGratuit;
		}

		public void setNbrGratuit(Long nbrGratuit) {
			this.nbrGratuit = nbrGratuit;
		}

		public String getTypePaiment() {
			return typePaiment;
		}

		public void setTypePaiment(String typePaiment) {
			this.typePaiment = typePaiment;
		}

		public Date getDateFacture() {
			return dateFacture;
		}

		public void setDateFacture(Date dateFacture) {
			this.dateFacture = dateFacture;
		}

		public String getNomClient() {
			return nomClient;
		}

		public void setNomClient(String nomClient) {
			this.nomClient = nomClient;
		}

		public String getTypeFacture() {
			return typeFacture;
		}

		public void setTypeFacture(String typeFacture) {
			this.typeFacture = typeFacture;
		}

		public List<Chambre> getChambre() {
			return chambre;
		}

		public void setChambre(List<Chambre> chambre) {
			this.chambre = chambre;
		}

		public List<Consomation> getConsomations() {
			return consomations;
		}

		public void setConsomations(List<Consomation> consomations) {
			this.consomations = consomations;
		}

		public long getCodResid() {
			return codResid;
		}

		public void setCodResid(long codResid) {
			this.codResid = codResid;
		}
		
		



}
