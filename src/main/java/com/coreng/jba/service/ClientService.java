package com.coreng.jba.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.coreng.jba.entities.Client;
import com.coreng.jba.repositories.ClientRepository;

@Service
@Transactional
public class ClientService {

	@Autowired
	private ClientRepository clientRep;

	public List<Client> findAll() {
		return clientRep.findAll();
	}

	public void save(Client client) {
		clientRep.save(client);
	}

	public Client findById(Long id) {
		// TODO Auto-generated method stub
		return clientRep.findById(id);
	}

}
