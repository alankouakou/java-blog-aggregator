package com.coreng.jba.entities;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Vehicule {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String immatriculation;
	private String marque;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "typevehicule_id")
	private TypeVehicule typeVehicule;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "client_id")
	private Client owner;

	public Vehicule() {
	}

	public Vehicule(String immatriculation, String marque, TypeVehicule typeVehicule) {
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.typeVehicule = typeVehicule;
	}

	public Vehicule(String immatriculation, String marque, TypeVehicule typeVehicule, Client client) {
		this.immatriculation = immatriculation;
		this.marque = marque;
		this.typeVehicule = typeVehicule;
		this.owner = client;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public TypeVehicule getTypeVehicule() {
		return typeVehicule;
	}

	public void setTypeVehicule(TypeVehicule typeVehicule) {
		this.typeVehicule = typeVehicule;
	}

	public Client getOwner() {
		return owner;
	}

	public void setOwner(Client owner) {
		this.owner = owner;
	}

	@Override
	public String toString() {
		return String.format("Id : %d, immatriculation : %s, marque : %s", id, immatriculation, marque);
	}
}
