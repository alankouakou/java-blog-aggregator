package com.coreng.jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

	Commande findById(Long id);

}
