package com.coreng.jba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coreng.jba.entities.TypeConso;
import com.coreng.jba.service.TypeConsoService;

@Controller
public class TypeConsoController {

	@Autowired
	private TypeConsoService typeConsoService;

	@ModelAttribute("typeConso")
	public TypeConso construct() {
		return new TypeConso();
	}

	@ModelAttribute("typesConso")
	public List<TypeConso> listTypeConso() {
		return typeConsoService.findAll();
	}

	@RequestMapping(value = "/newtypeconso", method = RequestMethod.GET)
	public String showRegister() {
		return "typesconso";
	}

	@RequestMapping(value = "/newtypeconso", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute("typeConso") TypeConso typeConso) {

		typeConsoService.save(typeConso);
		return "redirect:/typesconso.html";
	}

	@RequestMapping("/typesconso")
	public String listTypesConso(Model model) {
		List<TypeConso> typesConso = typeConsoService.findAll();
		model.addAttribute("typesConso", typesConso);
		return "typesconso";
	}

	@RequestMapping(value = "/typesconso", method = RequestMethod.POST)
	public String saveTypeConso(@ModelAttribute("typeconso") TypeConso typeConso) {

		typeConsoService.save(typeConso);
		return "redirect:/typesconso.html";
	}

}
