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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Resident {
	@Id
	@GeneratedValue /* strategy = GenerationType.SEQUENCE, generator = "ROLE_ID_GENERATOR" */
	private Long id_Resident;
	private Long codResid;

	private Long cod_nat;
	private String nom_resid;
	private String adr_res;
	@Temporal(TemporalType.DATE)
	private Date dat_naissance;
	private String num_pass;
	private String num_voucher;
	private String profession;
	private String sexe;
	private String num_cin;
	@Temporal(TemporalType.DATE)
	private Date date_livr;
	private String dern_serv;
	@Temporal(TemporalType.DATE)
	private Date date_arr;
	@Temporal(TemporalType.DATE)
	private Date date_dep;
	private Long plafond_cred;
	private String adr2_res;
	private String num_chambre;
	private String nature;
	private Long nb_bebe;
	private Long cod_resid_p;
	private String h_depart;
	private String code_postal;
	private String ville;
	private String pays;
	private String offre;
	private Long age;
	private Long mint_remise;
	private String type_remise;
	private String lib_remise;
	private String type_client;

	@Temporal(TemporalType.DATE)
	private Date date_remise;
	@OneToMany(mappedBy = "residents")
	private List<Chambre> chambre;

@OneToMany(mappedBy = "resident")
private List <Arrangement> arrangement;

@OneToMany(mappedBy = "residents")
private List <Consomation> consomation;

	public Resident() {
		System.out.println("Le résident créer avec succée");
	}

	public Resident(Long codResid, Long cod_nat, String nom_resid, String adr_res, Date dat_naissance, String num_pass,
			String num_voucher, String profession, String sexe, String num_cin, Date date_livr, String dern_serv,
			Date date_arr, Date date_dep, Long plafond_cred, String adr2_res, String num_chambre, String nature,
			Long nb_bebe, Long cod_resid_p, String h_depart, String code_postal, String ville, String pays,
			String offre, Long age, Long mint_remise, String type_remise, String lib_remise, String type_client,
			Date date_remise, List<Chambre> chambre, List<Arrangement> arrangement, List<Consomation> consomation) {
		super();
		this.codResid = codResid;
		this.cod_nat = cod_nat;
		this.nom_resid = nom_resid;
		this.adr_res = adr_res;
		this.dat_naissance = dat_naissance;
		this.num_pass = num_pass;
		this.num_voucher = num_voucher;
		this.profession = profession;
		this.sexe = sexe;
		this.num_cin = num_cin;
		this.date_livr = date_livr;
		this.dern_serv = dern_serv;
		this.date_arr = date_arr;
		this.date_dep = date_dep;
		this.plafond_cred = plafond_cred;
		this.adr2_res = adr2_res;
		this.num_chambre = num_chambre;
		this.nature = nature;
		this.nb_bebe = nb_bebe;
		this.cod_resid_p = cod_resid_p;
		this.h_depart = h_depart;
		this.code_postal = code_postal;
		this.ville = ville;
		this.pays = pays;
		this.offre = offre;
		this.age = age;
		this.mint_remise = mint_remise;
		this.type_remise = type_remise;
		this.lib_remise = lib_remise;
		this.type_client = type_client;
		this.date_remise = date_remise;
		this.chambre = chambre;
		this.arrangement = arrangement;
		this.consomation = consomation;
	}

	public Long getId_Resident() {
		return id_Resident;
	}

	public void setId_Resident(Long id_Resident) {
		this.id_Resident = id_Resident;
	}

	public Long getCodResid() {
		return codResid;
	}

	public void setCodResid(Long codResid) {
		this.codResid = codResid;
	}

	public Long getCod_nat() {
		return cod_nat;
	}

	public void setCod_nat(Long cod_nat) {
		this.cod_nat = cod_nat;
	}

	public String getNom_resid() {
		return nom_resid;
	}

	public void setNom_resid(String nom_resid) {
		this.nom_resid = nom_resid;
	}

	public String getAdr_res() {
		return adr_res;
	}

	public void setAdr_res(String adr_res) {
		this.adr_res = adr_res;
	}

	public Date getDat_naissance() {
		return dat_naissance;
	}

	public void setDat_naissance(Date dat_naissance) {
		this.dat_naissance = dat_naissance;
	}

	public String getNum_pass() {
		return num_pass;
	}

	public void setNum_pass(String num_pass) {
		this.num_pass = num_pass;
	}

	public String getNum_voucher() {
		return num_voucher;
	}

	public void setNum_voucher(String num_voucher) {
		this.num_voucher = num_voucher;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public String getNum_cin() {
		return num_cin;
	}

	public void setNum_cin(String num_cin) {
		this.num_cin = num_cin;
	}

	public Date getDate_livr() {
		return date_livr;
	}

	public void setDate_livr(Date date_livr) {
		this.date_livr = date_livr;
	}

	public String getDern_serv() {
		return dern_serv;
	}

	public void setDern_serv(String dern_serv) {
		this.dern_serv = dern_serv;
	}

	public Date getDate_arr() {
		return date_arr;
	}

	public void setDate_arr(Date date_arr) {
		this.date_arr = date_arr;
	}

	public Date getDate_dep() {
		return date_dep;
	}

	public void setDate_dep(Date date_dep) {
		this.date_dep = date_dep;
	}

	public Long getPlafond_cred() {
		return plafond_cred;
	}

	public void setPlafond_cred(Long plafond_cred) {
		this.plafond_cred = plafond_cred;
	}

	public String getAdr2_res() {
		return adr2_res;
	}

	public void setAdr2_res(String adr2_res) {
		this.adr2_res = adr2_res;
	}

	public String getNum_chambre() {
		return num_chambre;
	}

	public void setNum_chambre(String num_chambre) {
		this.num_chambre = num_chambre;
	}

	public String getNature() {
		return nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	public Long getNb_bebe() {
		return nb_bebe;
	}

	public void setNb_bebe(Long nb_bebe) {
		this.nb_bebe = nb_bebe;
	}

	public Long getCod_resid_p() {
		return cod_resid_p;
	}

	public void setCod_resid_p(Long cod_resid_p) {
		this.cod_resid_p = cod_resid_p;
	}

	public String getH_depart() {
		return h_depart;
	}

	public void setH_depart(String h_depart) {
		this.h_depart = h_depart;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getOffre() {
		return offre;
	}

	public void setOffre(String offre) {
		this.offre = offre;
	}

	public Long getAge() {
		return age;
	}

	public void setAge(Long age) {
		this.age = age;
	}

	public Long getMint_remise() {
		return mint_remise;
	}

	public void setMint_remise(Long mint_remise) {
		this.mint_remise = mint_remise;
	}

	public String getType_remise() {
		return type_remise;
	}

	public void setType_remise(String type_remise) {
		this.type_remise = type_remise;
	}

	public String getLib_remise() {
		return lib_remise;
	}

	public void setLib_remise(String lib_remise) {
		this.lib_remise = lib_remise;
	}

	public String getType_client() {
		return type_client;
	}

	public void setType_client(String type_client) {
		this.type_client = type_client;
	}

	public Date getDate_remise() {
		return date_remise;
	}

	public void setDate_remise(Date date_remise) {
		this.date_remise = date_remise;
	}

	public List<Chambre> getChambre() {
		return chambre;
	}

	public void setChambre(List<Chambre> chambre) {
		this.chambre = chambre;
	}

	public List<Arrangement> getArrangement() {
		return arrangement;
	}

	public void setArrangement(List<Arrangement> arrangement) {
		this.arrangement = arrangement;
	}

	public List<Consomation> getConsomation() {
		return consomation;
	}

	public void setConsomation(List<Consomation> consomation) {
		this.consomation = consomation;
	}

	

	

}
