package com.coreng.jba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.Commande;
import com.coreng.jba.entities.LigneCommande;

public interface LigneCommandeRepository extends JpaRepository<LigneCommande, Long> {

	List<LigneCommande> findById(Long id);

	List<LigneCommande> findByCommande(Commande commande);

}
