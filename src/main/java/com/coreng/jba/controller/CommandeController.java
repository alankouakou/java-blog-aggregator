package com.coreng.jba.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coreng.jba.entities.Client;
import com.coreng.jba.entities.Commande;
import com.coreng.jba.entities.LigneCommande;
import com.coreng.jba.service.ClientService;
import com.coreng.jba.service.CommandeService;

@Controller
public class CommandeController {

	@Autowired
	private CommandeService commandeService;

	@Autowired
	private ClientService clientService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		CustomDateEditor cde = new CustomDateEditor(format, false);
		binder.registerCustomEditor(Date.class, cde);
	}

	@ModelAttribute("commande")
	private Commande nouvelleCommande() {
		Commande commande = new Commande();
		return commande;
	}

	@ModelAttribute("clients")
	private List<Client> listClients() {
		return clientService.findAll();
	}

	@ModelAttribute("commandes")
	private List<Commande> listeCommandes() {
		return commandeService.findAll();
	}

	public List<Commande> findAll() {
		return commandeService.findAll();
	}

	@RequestMapping(value = "/commandes", method = RequestMethod.GET)
	public String listCommande() {

		return "commandes";
	}

	@RequestMapping(value = "/commandes", method = RequestMethod.POST)
	public String saveClient(@ModelAttribute("commande") Commande commande) {
		commande.setLigneCommandes(new ArrayList<LigneCommande>());
		commandeService.save(commande);
		return "redirect:/commandes.html";
	}
}
