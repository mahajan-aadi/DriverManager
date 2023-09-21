package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.amdocs.Service.Impl.DriverServiceImpl;
import com.amdocs.entity.Driver;

@Controller
public class DriverController
{	
	@Autowired
	private DriverServiceImpl driverService;
	
	@RequestMapping("/driverpage")
	public String openDriverPage(Model model)
	{
		Driver driver=new Driver();
		model.addAttribute("driver", driver);
		return "driverpage";
	}
	
	@RequestMapping(value="/insertDriver", method = RequestMethod.POST)
	public String handleDriverForm(@ModelAttribute("driver") Driver driver,Model model)
	{
		boolean saveDriver = driverService.saveDriver(driver);
		
		String msg="";
		
		if(saveDriver)
			msg="Data Inserted SuccessFully";
		else
			msg="Data Was Not Able To Be Inserted";
		
		model.addAttribute("msg", msg);
		return "driverpage";
	}
	
	@RequestMapping("/editdvr")
	public String editEmployee(@RequestParam("did") int id,Model model)
	{
		Driver driver = driverService.getDriverId(id);
		
		model.addAttribute("driver", driver);
		return "editdriver";
	}
	
	@RequestMapping("/View All Drivers")
	public String viewAllDrivers(Model model)
	{
		List<Driver> allDrivers = driverService.getAllDrivers();	
		model.addAttribute("alldrivers", allDrivers);
		return "viewAllDrivers";
	}
	
	@RequestMapping("/updatedriver")
	public String updateEmployee(Driver driver)
	{
		boolean updateBook = driverService.updateDriver(driver);
		
		return "redirect:/View All Drivers";

	}

	@RequestMapping("/deletedvr")
	public String deleteDriver(@RequestParam("did")  int id)
	{
		boolean flag = driverService.deleteDriver(id);
		
		return "redirect:/View All Drivers";

	}
	
	
}
