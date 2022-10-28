package com.example.demo.services;

import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.demo.entity.Utilisateur;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDetailsImpl implements UserDetails {
  private static final long serialVersionUID = 1L;

  private String id;

  private String username;

  private String matPers;
	private Long dureeAcc;
	private String adresse;
	private String tel;
	private String cin;

	private Date dateDeb;
	private String ref;

  @JsonIgnore
  private String password;

  private Collection<? extends GrantedAuthority> authorities;

  
  
  public UserDetailsImpl(String id, String username, String matPers, Long dureeAcc, String adresse, String tel,
		String cin, Date dateDeb, String ref, String password, Collection<? extends GrantedAuthority> authorities) {
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
	this.authorities = authorities;
}



  public static UserDetailsImpl build(Utilisateur user) {
    List<GrantedAuthority> authorities = user.getRoles().stream()
        .map(role -> new SimpleGrantedAuthority(role.getName().name()))
        .collect(Collectors.toList());

    return new UserDetailsImpl(
        user.getId(), 
        user.getUsername(), 
        user.getMatPers(),
        user.getDureeAcc(),
        user.getAdresse(),
        user.getTel(),
        user.getCin(),
        user.getDateDeb(),
        user.getRef(),
        user.getPassword(),

        authorities);
  }

  @Override
  public Collection<? extends GrantedAuthority> getAuthorities() {
    return authorities;
  }

  public String getId() {
    return id;
  }



  @Override
  public String getPassword() {
    return password;
  }
  
  public String getMatPers() {
	return matPers;
}



public Long getDureeAcc() {
	return dureeAcc;
}



public String getAdresse() {
	return adresse;
}



public String getTel() {
	return tel;
}



public String getCin() {
	return cin;
}


public Date getDateDeb() {
	return dateDeb;
}



public String getRef() {
	return ref;
}



@Override
  public String getUsername() {
    return username;
  }

  @Override
  public boolean isAccountNonExpired() {
    return true;
  }

  @Override
  public boolean isAccountNonLocked() {
    return true;
  }

  @Override
  public boolean isCredentialsNonExpired() {
    return true;
  }

  @Override
  public boolean isEnabled() {
    return true;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    UserDetailsImpl user = (UserDetailsImpl) o;
    return Objects.equals(id, user.id);
  }
}
