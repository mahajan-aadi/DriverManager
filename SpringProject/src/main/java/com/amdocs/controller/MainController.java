package com.amdocs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.entity.Driver;
import com.amdocs.entity.Route;

@Controller
public class MainController
{

	@RequestMapping("/")
	public String loadForm()
	{
		return "mainpage";
	}
	@RequestMapping("/connectionpage")
	public String openDriverPage(Model model)
	{
		return "connectionpage";
	}

}
