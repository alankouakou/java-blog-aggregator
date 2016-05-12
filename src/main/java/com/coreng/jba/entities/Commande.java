package com.coreng.jba.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Commande {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	private Date dateCommande;
	@OneToMany(mappedBy = "commande")
	private List<LigneCommande> ligneCommandes;

	public Commande() {
		dateCommande = new Date();
		ligneCommandes = new ArrayList<LigneCommande>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public List<LigneCommande> getLigneCommandes() {
		return ligneCommandes;
	}

	public void setLigneCommandes(List<LigneCommande> ligneCommandes) {
		this.ligneCommandes = ligneCommandes;
	}

	public int getTotalCommande() {
		int total = 0;
		// Si on a des lignes commandes
		/*
		 * if (ligneCommandes.size() > 0) { for (LigneCommande ligne :
		 * ligneCommandes) { total += ligne.getPrixArticle() *
		 * ligne.getQuantiteLigne(); } }
		 */
		return total;
	}

}
