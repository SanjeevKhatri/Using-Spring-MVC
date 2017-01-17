package edu.mum.springmvc.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edu.mum.springmvc.lab1.model.User;
import edu.mum.springmvc.lab1.service.LoginService;
import edu.mum.springmvc.lab1.serviceImpl.LoginServiceImpl;

@Controller
public class UserController {

	LoginService loginService = new LoginServiceImpl();

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String displayLogin() {
		return "login";
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String checkLogin(@ModelAttribute("user") User user, Model model) {
		Boolean result = loginService.loginVerification(user.getUser_name(), user.getPassword());
		if (result) {
			model.addAttribute("user_name", user);
			return "/welcome";
		} else {
			model.addAttribute("errormsg", "Username and/or Password is incorrect.");
			return "/login";
		}

	}
}
