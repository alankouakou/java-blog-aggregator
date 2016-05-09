package com.coreng.jba.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.coreng.jba.entities.TypeVehicule;

public interface TypeVehiculeRep extends JpaRepository<TypeVehicule, Long> {

	TypeVehicule findByLibelle(String libelle);

	TypeVehicule findById(Long id);

}
