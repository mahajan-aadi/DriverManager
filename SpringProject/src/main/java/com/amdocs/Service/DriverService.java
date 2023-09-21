package com.amdocs.Service;

import java.util.List;

import com.amdocs.entity.Driver;

public interface DriverService
{
	public boolean saveDriver(Driver driver);
	public List<Driver> getAllDrivers();
	public boolean updateDriver(Driver driver);
	public boolean deleteDriver(int id);
	public Driver getDriverId(int id);
}
