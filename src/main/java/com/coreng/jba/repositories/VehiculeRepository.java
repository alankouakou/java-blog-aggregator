package com.coreng.jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long> {

	Vehicule findByImmatriculation(String immatriculation);

}
