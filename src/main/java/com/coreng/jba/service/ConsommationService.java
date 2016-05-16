package com.coreng.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coreng.jba.entities.Consommation;
import com.coreng.jba.repositories.ConsommationRepository;

@Service
@Transactional
public class ConsommationService {

	@Autowired
	private ConsommationRepository consommationRepository;

	public List<Consommation> findAll() {
		return consommationRepository.findAll();
	}

	public Consommation findOne(Long id) {
		return consommationRepository.findOne(id);
	}

}
