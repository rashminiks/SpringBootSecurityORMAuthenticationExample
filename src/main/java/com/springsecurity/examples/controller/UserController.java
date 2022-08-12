package com.springsecurity.examples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.springsecurity.examples.Entity.User;
import com.springsecurity.examples.service.IUserService;

@Controller
public class UserController {

	@Autowired
	private IUserService service;

	// 1.showRegisterPage
	@GetMapping("/reg")
	public String showRegisterPage() {

		return "UserRegister";
	}

	@PostMapping("/save")
	public String saveUser(@ModelAttribute User user, Model model) {
		Integer id = service.saveUser(user);
		String msg = "User" + id + "saved";
		model.addAttribute("message", msg);
		return "UserRegister";
	}
}
