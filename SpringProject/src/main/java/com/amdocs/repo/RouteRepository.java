package com.amdocs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amdocs.entity.Route;
import com.amdocs.entity.Driver;

@Repository
public interface RouteRepository extends JpaRepository<Route, Integer> 
{
}
