package com.coreng.jba.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Consommation {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name;

	@ManyToOne
	@JoinColumn(name = "typeconso_id")
	private TypeConso typeConso;
	private int prixConso;
	private int stockMini;
	private int qteEnStock;

	protected Consommation() {

	}

	public Consommation(String name, TypeConso typeConso, int prix, int qteEnStock, int stockMini) {
		this.name = name;
		this.typeConso = typeConso;
		this.prixConso = prix;
		this.qteEnStock = qteEnStock;
		this.stockMini = stockMini;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public TypeConso getTypeConso() {
		return typeConso;
	}

	public void setTypeConso(TypeConso typeConso) {
		this.typeConso = typeConso;
	}

	public int getPrixConso() {
		return prixConso;
	}

	public void setPrixConso(int prixConso) {
		this.prixConso = prixConso;
	}

	public int getStockMini() {
		return stockMini;
	}

	public void setStockMini(int stockAlerte) {
		this.stockMini = stockAlerte;
	}

	public int getQteEnStock() {
		return qteEnStock;
	}

	public void setQteEnStock(int qteEnStock) {
		this.qteEnStock = qteEnStock;
	}

}
