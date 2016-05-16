package com.coreng.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coreng.jba.entities.TypeConso;
import com.coreng.jba.repositories.TypeConsoRepository;

@Service
@Transactional
public class TypeConsoService {

	@Autowired
	private TypeConsoRepository typeConsoRepo;

	public List<TypeConso> findAll() {
		return typeConsoRepo.findAll();
	}

	public TypeConso findOne(Long id) {
		return typeConsoRepo.findOne(id);
	}

	public void save(TypeConso typeConso) {
		typeConsoRepo.save(typeConso);
	}

}
