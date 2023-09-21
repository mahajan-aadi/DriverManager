package com.amdocs.Service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.amdocs.Service.DriverService;
import com.amdocs.entity.Driver;
import com.amdocs.repo.DriverRepository;

@Service
public class DriverServiceImpl implements DriverService
{

	@Autowired
	private DriverRepository driverRepository;

	@Override
	public boolean saveDriver(Driver driver) 
	{
		Driver driverSave = driverRepository.save(driver);
		boolean flag = false;

		if (driverSave != null)
			flag = true;

		return flag;
	}

	@Override
	public List<Driver> getAllDrivers() {
		List<Driver> driverRecords = driverRepository.findAll();
		return driverRecords;
	}

	@Override
	public boolean updateDriver(Driver driver) {
		// TODO Auto-generated method stub
		return saveDriver(driver);
		}

	@Override
	public boolean deleteDriver(int id) {
		Driver dvr = getDriverId(id);
		boolean flag=false;
		if(dvr!=null)
		{
			driverRepository.delete(dvr);
		flag=true;	
		}
		return flag;	
	}

	@Override
	public Driver getDriverId(int id) {
		Optional<Driver> dvrID = driverRepository.findById(id);
		Driver dvr = dvrID.get();
		return dvr;
	}
}
