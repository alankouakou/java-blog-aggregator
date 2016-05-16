package com.coreng.jba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coreng.jba.entities.Consommation;
import com.coreng.jba.entities.TypeConso;
import com.coreng.jba.service.ConsommationService;
import com.coreng.jba.service.TypeConsoService;

@Controller
public class ConsommationController {

	@Autowired
	private ConsommationService consommationService;

	@Autowired
	private TypeConsoService typeConsoService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.registerCustomEditor(TypeConso.class, new TypeConsoIdEditor(typeConsoService));
	}

	@ModelAttribute("typesConso")
	public List<TypeConso> listTypesConso() {
		return typeConsoService.findAll();
	}

	@ModelAttribute("consommation")
	public Consommation consommation() {
		return new Consommation();
	}

	@ModelAttribute("consommations")
	public List<Consommation> consommations() {
		return consommationService.findAll();
	}

	@RequestMapping("/consommations")
	public String listConsommations() {
		List<Consommation> consommations = consommationService.findAll();
		for (Consommation consommation : consommations) {
			consommation.setTypeConso(typeConsoService.findOne(consommation.getTypeConso().getId()));
		}
		return "consommations";
	}

	@RequestMapping(value = "/consommations", method = RequestMethod.POST)
	public String saveConsommation(@ModelAttribute("consommation") Consommation consommation) {
		consommationService.save(consommation);
		return "redirect:/consommations.html";
	}

}
