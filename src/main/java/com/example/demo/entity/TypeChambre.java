package com.example.demo.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

@Entity
public class TypeChambre {

	@Id
	@GeneratedValue /* strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR" */
	// @SequenceGenerator(name = "ROLE_ID_GENERATOR", sequenceName =
	// "SEQ_CONTRATAGENCE", allocationSize = 1)
	private Long idType;

	private String code_categ;

	private String commentaire;
	private boolean television;
	private boolean telephone;
	private boolean climant;
	private boolean miniBar;
	private boolean coffren;
	private boolean douchBain;
	private boolean grandLit;
	private boolean communic;
	private boolean distance;
	private boolean balcon;
	private String vue;
	private boolean salon;
	private boolean soleil;
	private Long nbLits;
	private String codClasse1;
	private String codClasse2;
	private String communiquante;
	private String tel;
	private String codType;
	private String codAlie;

	private Long ordre;
	private String cod_hotel;

@ManyToOne
@JsonProperty(access = Access.WRITE_ONLY)

private Chambre chambres;

@OneToMany(mappedBy = "typeChambres")
private List<Etat_Chambre> etat_Chambre;

	public TypeChambre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeChambre(String code_categ, String commentaire, boolean television, boolean telephone, boolean climant,
			boolean miniBar, boolean coffren, boolean douchBain, boolean grandLit, boolean communic, boolean distance,
			boolean balcon, String vue, boolean salon, boolean soleil, Long nbLits, String codClasse1,
			String codClasse2, String communiquante, String tel, String codType, String codAlie, Long ordre,
			String cod_hotel, Chambre chambres, List<Etat_Chambre> etat_Chambre) {
		super();
		this.code_categ = code_categ;
		this.commentaire = commentaire;
		this.television = television;
		this.telephone = telephone;
		this.climant = climant;
		this.miniBar = miniBar;
		this.coffren = coffren;
		this.douchBain = douchBain;
		this.grandLit = grandLit;
		this.communic = communic;
		this.distance = distance;
		this.balcon = balcon;
		this.vue = vue;
		this.salon = salon;
		this.soleil = soleil;
		this.nbLits = nbLits;
		this.codClasse1 = codClasse1;
		this.codClasse2 = codClasse2;
		this.communiquante = communiquante;
		this.tel = tel;
		this.codType = codType;
		this.codAlie = codAlie;
		this.ordre = ordre;
		this.cod_hotel = cod_hotel;
		this.chambres = chambres;
		this.etat_Chambre = etat_Chambre;
	}

	public Long getIdType() {
		return idType;
	}

	public void setIdType(Long idType) {
		this.idType = idType;
	}

	public String getCode_categ() {
		return code_categ;
	}

	public void setCode_categ(String code_categ) {
		this.code_categ = code_categ;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public boolean isTelevision() {
		return television;
	}

	public void setTelevision(boolean television) {
		this.television = television;
	}

	public boolean isTelephone() {
		return telephone;
	}

	public void setTelephone(boolean telephone) {
		this.telephone = telephone;
	}

	public boolean isClimant() {
		return climant;
	}

	public void setClimant(boolean climant) {
		this.climant = climant;
	}

	public boolean isMiniBar() {
		return miniBar;
	}

	public void setMiniBar(boolean miniBar) {
		this.miniBar = miniBar;
	}

	public boolean isCoffren() {
		return coffren;
	}

	public void setCoffren(boolean coffren) {
		this.coffren = coffren;
	}

	public boolean isDouchBain() {
		return douchBain;
	}

	public void setDouchBain(boolean douchBain) {
		this.douchBain = douchBain;
	}

	public boolean isGrandLit() {
		return grandLit;
	}

	public void setGrandLit(boolean grandLit) {
		this.grandLit = grandLit;
	}

	public boolean isCommunic() {
		return communic;
	}

	public void setCommunic(boolean communic) {
		this.communic = communic;
	}

	public boolean isDistance() {
		return distance;
	}

	public void setDistance(boolean distance) {
		this.distance = distance;
	}

	public boolean isBalcon() {
		return balcon;
	}

	public void setBalcon(boolean balcon) {
		this.balcon = balcon;
	}

	public String getVue() {
		return vue;
	}

	public void setVue(String vue) {
		this.vue = vue;
	}

	public boolean isSalon() {
		return salon;
	}

	public void setSalon(boolean salon) {
		this.salon = salon;
	}

	public boolean isSoleil() {
		return soleil;
	}

	public void setSoleil(boolean soleil) {
		this.soleil = soleil;
	}

	public Long getNbLits() {
		return nbLits;
	}

	public void setNbLits(Long nbLits) {
		this.nbLits = nbLits;
	}

	public String getCodClasse1() {
		return codClasse1;
	}

	public void setCodClasse1(String codClasse1) {
		this.codClasse1 = codClasse1;
	}

	public String getCodClasse2() {
		return codClasse2;
	}

	public void setCodClasse2(String codClasse2) {
		this.codClasse2 = codClasse2;
	}

	public String getCommuniquante() {
		return communiquante;
	}

	public void setCommuniquante(String communiquante) {
		this.communiquante = communiquante;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getCodType() {
		return codType;
	}

	public void setCodType(String codType) {
		this.codType = codType;
	}

	public String getCodAlie() {
		return codAlie;
	}

	public void setCodAlie(String codAlie) {
		this.codAlie = codAlie;
	}

	public Long getOrdre() {
		return ordre;
	}

	public void setOrdre(Long ordre) {
		this.ordre = ordre;
	}

	public String getCod_hotel() {
		return cod_hotel;
	}

	public void setCod_hotel(String cod_hotel) {
		this.cod_hotel = cod_hotel;
	}

	public Chambre getChambres() {
		return chambres;
	}

	public void setChambres(Chambre chambres) {
		this.chambres = chambres;
	}

	public List<Etat_Chambre> getEtat_Chambre() {
		return etat_Chambre;
	}

	public void setEtat_Chambre(List<Etat_Chambre> etat_Chambre) {
		this.etat_Chambre = etat_Chambre;
	}

	
	
}
