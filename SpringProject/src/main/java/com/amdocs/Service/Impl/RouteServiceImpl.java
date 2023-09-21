package com.amdocs.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.Exceptions.DriverNotFoundException;
import com.amdocs.Service.RouteService;
import com.amdocs.entity.Driver;
import com.amdocs.entity.Route;
import com.amdocs.repo.DriverRepository;
import com.amdocs.repo.RouteRepository;

@Service
public class RouteServiceImpl implements RouteService
{
	private RouteRepository routeRepository;
	private DriverRepository driverRepository;
	@Autowired
	public RouteServiceImpl(RouteRepository routeRepository,DriverRepository driverRepository)
	{
		super();
		this.driverRepository=driverRepository;
		this.routeRepository=routeRepository;
	}

	@Override
	public Route saveRoute(int driverID,Route route) throws DriverNotFoundException {
		Driver driver=driverRepository.findById(driverID).orElse(null);
		if(driver!=null)
		{
			route.setDriver(driver);
			return routeRepository.save(route);

		}
		else
		{
			throw new DriverNotFoundException("Driver is not existed");
		}	
	}

	@Override
	public Route getRouteID(int id)
	{
		return routeRepository.findById(id).orElse(null);
	}

	@Override
	public void deleteRoute(int id) {
		routeRepository.deleteById(id);
		
	}

	@Override
	public Route updateRoute(int routeid,Route updatedRoute)
	{       
        Route existingRoute = routeRepository.findById(routeid).orElse(null);
        if(existingRoute != null) {
        existingRoute.setRouteName(updatedRoute.getRouteName());
        existingRoute.setRouteName(updatedRoute.getRouteName());
        
        //existingOrder.setOrder_status(existingOrder.getOrder_status());

        return routeRepository.save(existingRoute);
        }
        return null;	
       }

	@Override
	public List<Route> getAllRoutes() {
		return routeRepository.findAll();
	}

}
