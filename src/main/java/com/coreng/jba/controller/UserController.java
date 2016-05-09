package com.coreng.jba.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coreng.jba.entities.Role;
import com.coreng.jba.entities.User;
import com.coreng.jba.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@ModelAttribute("user")
	public User construct() {
		return new User();
	}

	@ModelAttribute("roles")
	public List<Role> listRoles() {
		return userService.findAllRoles();
	}

	@RequestMapping(value = "/register-user", method = RequestMethod.GET)
	public String showRegister() {
		return "register-user";
	}

	@RequestMapping(value = "/register-user", method = RequestMethod.POST)
	public String doRegistration(@ModelAttribute("user") User user) {

		userService.save(user);
		return "index";
	}

	@RequestMapping("/users")
	public String listUsers(Model model) {
		List<User> users = userService.findAllUsers();
		model.addAttribute("users", users);
		return "users";
	}

	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("user") User user) {

		userService.save(user);
		return "redirect:/users.html";
	}

}
