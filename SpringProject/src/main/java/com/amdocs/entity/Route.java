package com.amdocs.entity;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Route")
public class Route
{
	@Id
	@Column(name="RouteID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer routeID;
	@Column(name="RouteName")
	private String routeName;
	@Column(name="RouteInfo")
	private String routeInfo;
	
	
    @ManyToOne
    @JoinColumn(name="driverID")
	private Driver driver;
    
	public Integer getRouteID() {
		return routeID;
	}
	public void setRouteID(Integer routeID) {
		this.routeID = routeID;
	}
	public String getRouteName() {
		return routeName;
	}
	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}
	
	public Route( String routeName, String routeInfo) {
		super();
		this.routeName = routeName;
		this.routeInfo = routeInfo;
	}
	public Route() {
		// TODO Auto-generated constructor stub
	}
	public String getRouteInfo() {
		return routeInfo;
	}
	public void setRouteInfo(String routeInfo) {
		this.routeInfo = routeInfo;
	}
	public Driver getDriver() {
		return driver;
	}
	public  void setDriver(Driver driver) {
		this.driver= driver;
	}

}