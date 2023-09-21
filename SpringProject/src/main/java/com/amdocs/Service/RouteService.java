package com.amdocs.Service;

import java.util.List;

import com.amdocs.Exceptions.DriverNotFoundException;
import com.amdocs.entity.Route;

public interface RouteService 
{
	public Route saveRoute(int driverID,Route route) throws DriverNotFoundException;
	public Route getRouteID(int id);
	public void deleteRoute(int id);
	public Route updateRoute(int routeid ,Route updatedRoute);
	public List<Route> getAllRoutes();

}
