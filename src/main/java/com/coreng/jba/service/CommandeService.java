package com.coreng.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coreng.jba.entities.Commande;
import com.coreng.jba.repositories.CommandeRepository;

@Service
@Transactional
public class CommandeService {

	@Autowired
	private CommandeRepository commandeRep;

	public List<Commande> findAll() {
		return commandeRep.findAll();
	}

	public void save(Commande commande) {
		commandeRep.save(commande);
	}

	public Commande findById(Long id) {
		// TODO Auto-generated method stub
		return commandeRep.findById(id);
	}

}
