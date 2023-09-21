package com.amdocs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.Exceptions.DriverNotFoundException;
import com.amdocs.Service.DriverService;
import com.amdocs.Service.RouteService;
import com.amdocs.entity.Route;

@RestController
@RequestMapping("/Routes")
public class RouteController
{
	private RouteService routeService;
	private DriverService driverService;
	
	@Autowired
	public RouteController(RouteService routeService,DriverService driverService) {
		super();
		this.routeService=routeService;
		this.driverService= driverService;
	}
	
	@PostMapping("/insertRoute/{isdrno}")
	public Route saveRoute(@PathVariable int isdrno,@RequestBody Route route) throws DriverNotFoundException
	{
		return routeService.saveRoute(isdrno,route);
	}
	
	@GetMapping("/{isrno}")
	public Route getRouteById(@PathVariable int isrno)
	{
		return routeService.getRouteID(isrno);
	}
	@GetMapping("/GetAllRoutes")
	public List<Route> getallRoutes()
	{
		return routeService.getAllRoutes();
	}
	@PutMapping("/update/{isrno}")
	public Route updateRoute(@PathVariable int isrno,@RequestBody Route route)
	{
		System.out.println("ftrdesw");
		return routeService.updateRoute(isrno, route);
	}
	
	
	@DeleteMapping("/delete/{isrno}")
	public void deleteRoute(@PathVariable int isrno)
	{
		routeService.deleteRoute(isrno);
	}
	
}
