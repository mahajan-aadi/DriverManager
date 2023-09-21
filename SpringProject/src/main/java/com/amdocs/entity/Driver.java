package com.amdocs.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Driver")
public class Driver
{
	@Id
	@Column(name="DriverID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer driverID;
	@Column(name="Drivername")
	private String driverName;
	@Column(name="DriverNumber")
	private int driverNumber;
	
    @OneToMany(mappedBy = "driver", cascade = CascadeType.ALL)
    private Set<Route> route = new HashSet<>();
    
	
	public Integer getDriverID() {
		return driverID;
	}
	public void setDriverID(Integer driverID) {
		this.driverID = driverID;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public int getDriverNumber() {
		return driverNumber;
	}
	public void setDriverNumber(int driverNumber) {
		this.driverNumber = driverNumber;
	}
	
	public Driver(String driverName, int driverNumber) {
		super();
		this.driverName = driverName;
		this.driverNumber = driverNumber;
	}
	public Driver() {
		// TODO Auto-generated constructor stub
	}
}
