package com.coreng.jba.entities;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: TypeVehicule
 *
 */
@Entity

public class TypeVehicule implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String libelle;
	
	@OneToMany(mappedBy="typeVehicule")
	private List<Vehicule> vehicules;

	public TypeVehicule() {
		super();
	}   
	
	public TypeVehicule(String name){
		this.libelle = name;
	}
	
	public Long getId() {
		return this.id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return this.libelle;
	}
	
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}   

   
}
