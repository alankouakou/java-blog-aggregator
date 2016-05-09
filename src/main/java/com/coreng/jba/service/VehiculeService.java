package com.coreng.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coreng.jba.entities.Vehicule;
import com.coreng.jba.repositories.VehiculeRepository;

@Service
@Transactional
public class VehiculeService {

	@Autowired
	private VehiculeRepository vehiculeRep;

	public List<Vehicule> findAll() {
		return vehiculeRep.findAll();
	}

	public void save(Vehicule vehicule) {
		vehiculeRep.save(vehicule);
	}

	public Vehicule findByImmatriculation(String immatriculation) {
		return vehiculeRep.findByImmatriculation(immatriculation);
	}

}
