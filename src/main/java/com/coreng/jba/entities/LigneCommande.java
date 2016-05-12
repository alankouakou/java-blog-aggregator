package com.coreng.jba.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class LigneCommande {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String article;
	private int quantiteLigne;
	private int prixArticle;
	private int prixTotalLigne;

	@ManyToOne
	@JoinColumn(name = "commande_id")
	private Commande commande;

	public LigneCommande() {
		quantiteLigne = 0;
		article = "";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public int getQuantiteLigne() {
		return quantiteLigne;
	}

	public void setQuantiteLigne(int quantiteLigne) {
		this.quantiteLigne = quantiteLigne;
	}

	public int getPrixArticle() {
		return prixArticle;
	}

	public void setPrixArticle(int prixArticle) {
		this.prixArticle = prixArticle;
	}

	public String getArticle() {
		return article;
	}

	public void setArticle(String article) {
		this.article = article;
	}

	public int getPrixTotalLigne() {
		return prixTotalLigne;
	}

	public void setPrixTotalLigne(int prixTotalLigne) {
		this.prixTotalLigne = prixTotalLigne;
	}

}
