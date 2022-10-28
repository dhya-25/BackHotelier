package com.example.demo.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
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

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;


@Entity
public class Chambre {

	
	@Id
	@GeneratedValue/*strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR"*/
	//@SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName = "SEQ_CHAMBRE", allocationSize = 1)
	
	private Long idChambre;
	private Long codeResaChambre;
	private Long codResid;
	private Long nbrAdulte;
	private String nomResa;
	private String arrangAdult;
	private String arrangBebe;
	private Long nbrbebe;
	@Temporal(TemporalType.DATE)
	private Date dateArr;
	@Temporal(TemporalType.DATE)
	private Date dateDep;
	private String num_chambre ;
	private String codeVip ;
	private String etatRes ;
	private Long nbrAdult_a;
	private Long nbrEnfant_a;
	private Long nbrBebe_a;
	private String commentaire ;
	private String heureArr ;
	private String heureDep ;
	private boolean remise ; 
	private String motif ; 
	private Long prixUnitaire ; 
	private Long numFacture ; 
	@Temporal(TemporalType.DATE)
	private Date dateFacture ; 
	private boolean offre ;
	private Long mntRemise ;
	private String typeRemise ;
	private String libRemise ;
	@Temporal(TemporalType.DATE)
	private Date dateRemise ; 
	private Long userRemise ;

	
	private String cod_categ ;
	private String cod_hotel ;

	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Resident residents;


	
@OneToMany(mappedBy = "chambre")
private List<Reservation> reservation;
	
	@ManyToOne
	@JsonProperty(access = Access.WRITE_ONLY)
	private Facture factures;
	
	@OneToMany(mappedBy = "chambres")
	private List<TypeChambre> typeChambre;

	public Chambre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chambre(Long codeResaChambre, Long codResid, Long nbrAdulte, String nomResa, String arrangAdult,
			String arrangBebe, Long nbrbebe, Date dateArr, Date dateDep, String num_chambre, String codeVip,
			String etatRes, Long nbrAdult_a, Long nbrEnfant_a, Long nbrBebe_a, String commentaire, String heureArr,
			String heureDep, boolean remise, String motif, Long prixUnitaire, Long numFacture, Date dateFacture,
			boolean offre, Long mntRemise, String typeRemise, String libRemise, Date dateRemise, Long userRemise,
			String cod_categ, String cod_hotel, Resident residents, List<Reservation> reservation, Facture factures,
			List<TypeChambre> typeChambre) {
		super();
		this.codeResaChambre = codeResaChambre;
		this.codResid = codResid;
		this.nbrAdulte = nbrAdulte;
		this.nomResa = nomResa;
		this.arrangAdult = arrangAdult;
		this.arrangBebe = arrangBebe;
		this.nbrbebe = nbrbebe;
		this.dateArr = dateArr;
		this.dateDep = dateDep;
		this.num_chambre = num_chambre;
		this.codeVip = codeVip;
		this.etatRes = etatRes;
		this.nbrAdult_a = nbrAdult_a;
		this.nbrEnfant_a = nbrEnfant_a;
		this.nbrBebe_a = nbrBebe_a;
		this.commentaire = commentaire;
		this.heureArr = heureArr;
		this.heureDep = heureDep;
		this.remise = remise;
		this.motif = motif;
		this.prixUnitaire = prixUnitaire;
		this.numFacture = numFacture;
		this.dateFacture = dateFacture;
		this.offre = offre;
		this.mntRemise = mntRemise;
		this.typeRemise = typeRemise;
		this.libRemise = libRemise;
		this.dateRemise = dateRemise;
		this.userRemise = userRemise;
		this.cod_categ = cod_categ;
		this.cod_hotel = cod_hotel;
		this.residents = residents;
		this.reservation = reservation;
		this.factures = factures;
		this.typeChambre = typeChambre;
	}

	public Long getIdChambre() {
		return idChambre;
	}

	public void setIdChambre(Long idChambre) {
		this.idChambre = idChambre;
	}

	public Long getCodeResaChambre() {
		return codeResaChambre;
	}

	public void setCodeResaChambre(Long codeResaChambre) {
		this.codeResaChambre = codeResaChambre;
	}

	public Long getCodResid() {
		return codResid;
	}

	public void setCodResid(Long codResid) {
		this.codResid = codResid;
	}

	public Long getNbrAdulte() {
		return nbrAdulte;
	}

	public void setNbrAdulte(Long nbrAdulte) {
		this.nbrAdulte = nbrAdulte;
	}

	public String getNomResa() {
		return nomResa;
	}

	public void setNomResa(String nomResa) {
		this.nomResa = nomResa;
	}

	public String getArrangAdult() {
		return arrangAdult;
	}

	public void setArrangAdult(String arrangAdult) {
		this.arrangAdult = arrangAdult;
	}

	public String getArrangBebe() {
		return arrangBebe;
	}

	public void setArrangBebe(String arrangBebe) {
		this.arrangBebe = arrangBebe;
	}

	public Long getNbrbebe() {
		return nbrbebe;
	}

	public void setNbrbebe(Long nbrbebe) {
		this.nbrbebe = nbrbebe;
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

	public String getNum_chambre() {
		return num_chambre;
	}

	public void setNum_chambre(String num_chambre) {
		this.num_chambre = num_chambre;
	}

	public String getCodeVip() {
		return codeVip;
	}

	public void setCodeVip(String codeVip) {
		this.codeVip = codeVip;
	}

	public String getEtatRes() {
		return etatRes;
	}

	public void setEtatRes(String etatRes) {
		this.etatRes = etatRes;
	}

	public Long getNbrAdult_a() {
		return nbrAdult_a;
	}

	public void setNbrAdult_a(Long nbrAdult_a) {
		this.nbrAdult_a = nbrAdult_a;
	}

	public Long getNbrEnfant_a() {
		return nbrEnfant_a;
	}

	public void setNbrEnfant_a(Long nbrEnfant_a) {
		this.nbrEnfant_a = nbrEnfant_a;
	}

	public Long getNbrBebe_a() {
		return nbrBebe_a;
	}

	public void setNbrBebe_a(Long nbrBebe_a) {
		this.nbrBebe_a = nbrBebe_a;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public String getHeureArr() {
		return heureArr;
	}

	public void setHeureArr(String heureArr) {
		this.heureArr = heureArr;
	}

	public String getHeureDep() {
		return heureDep;
	}

	public void setHeureDep(String heureDep) {
		this.heureDep = heureDep;
	}

	public boolean isRemise() {
		return remise;
	}

	public void setRemise(boolean remise) {
		this.remise = remise;
	}

	public String getMotif() {
		return motif;
	}

	public void setMotif(String motif) {
		this.motif = motif;
	}

	public Long getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Long prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Long getNumFacture() {
		return numFacture;
	}

	public void setNumFacture(Long numFacture) {
		this.numFacture = numFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public boolean isOffre() {
		return offre;
	}

	public void setOffre(boolean offre) {
		this.offre = offre;
	}

	public Long getMntRemise() {
		return mntRemise;
	}

	public void setMntRemise(Long mntRemise) {
		this.mntRemise = mntRemise;
	}

	public String getTypeRemise() {
		return typeRemise;
	}

	public void setTypeRemise(String typeRemise) {
		this.typeRemise = typeRemise;
	}

	public String getLibRemise() {
		return libRemise;
	}

	public void setLibRemise(String libRemise) {
		this.libRemise = libRemise;
	}

	public Date getDateRemise() {
		return dateRemise;
	}

	public void setDateRemise(Date dateRemise) {
		this.dateRemise = dateRemise;
	}

	public Long getUserRemise() {
		return userRemise;
	}

	public void setUserRemise(Long userRemise) {
		this.userRemise = userRemise;
	}

	public String getCod_categ() {
		return cod_categ;
	}

	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}

	public String getCod_hotel() {
		return cod_hotel;
	}

	public void setCod_hotel(String cod_hotel) {
		this.cod_hotel = cod_hotel;
	}

	public Resident getResidents() {
		return residents;
	}

	public void setResidents(Resident residents) {
		this.residents = residents;
	}

	public List<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(List<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Facture getFactures() {
		return factures;
	}

	public void setFactures(Facture factures) {
		this.factures = factures;
	}

	public List<TypeChambre> getTypeChambre() {
		return typeChambre;
	}

	public void setTypeChambre(List<TypeChambre> typeChambre) {
		this.typeChambre = typeChambre;
	}

	
	

	

}