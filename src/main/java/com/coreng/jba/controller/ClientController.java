package com.coreng.jba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coreng.jba.entities.Client;
import com.coreng.jba.service.ClientService;

@Controller
public class ClientController {

	@Autowired
	private ClientService clientService;

	@ModelAttribute("client")
	private Client nouveauClient() {
		Client client = new Client();
		return client;
	}

	@ModelAttribute("clients")
	private List<Client> listeClients() {
		return clientService.findAll();
	}

	public List<Client> findAll() {
		return clientService.findAll();
	}

	@RequestMapping(value = "/clients", method = RequestMethod.GET)
	public String creerClient() {
		return "clients";
	}

	@RequestMapping(value = "/clients", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("client") Client client) {
		clientService.save(client);
		return "redirect:/clients.html";
	}
}
