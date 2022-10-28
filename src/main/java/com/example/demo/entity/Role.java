package com.example.demo.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "roles")
public class Role {
	
	@Id
	  private String id;

	  private ERole name;
	

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Role(com.example.demo.entity.ERole name) {
		super();
		this.name = name;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public ERole getName() {
		return name;
	}


	public void setName(ERole name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}


	
	
	

}
