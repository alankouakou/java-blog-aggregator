package com.coreng.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coreng.jba.entities.Commande;
import com.coreng.jba.entities.Consommation;
import com.coreng.jba.entities.LigneCommande;
import com.coreng.jba.repositories.ConsommationRepository;
import com.coreng.jba.repositories.LigneCommandeRepository;

@Service
@Transactional
public class DetailCommandeService {

	@Autowired
	private LigneCommandeRepository ligneCommandeRepo;

	@Autowired
	private ConsommationRepository consommationRepo;

	public List<LigneCommande> findByCommande(Commande commande) {
		// TODO Auto-generated method stub
		return ligneCommandeRepo.findByCommande(commande);
	}

	public void save(LigneCommande ligneCommande) {
		Consommation conso;
		int qte;
		int prix;

		conso = consommationRepo.findOne(ligneCommande.getConsommation().getId());
		prix = conso.getPrixConso();
		qte = ligneCommande.getQuantite();
		ligneCommande.setMontant(prix * qte);
		ligneCommandeRepo.save(ligneCommande);
	}

	public void save(LigneCommande ligneCommande, Commande commande) {
		ligneCommande.setCommande(commande);
		ligneCommandeRepo.save(ligneCommande);
	}
}
