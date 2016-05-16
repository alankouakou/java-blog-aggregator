package com.coreng.jba.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.Client;
import com.coreng.jba.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande, Long> {

	List<Commande> findByClient(Client client);

	Commande findById(Long id);

	// Client findClientById(Long id);

}
