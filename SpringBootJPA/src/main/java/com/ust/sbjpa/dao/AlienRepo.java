package com.ust.sbjpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ust.sbjpa.Alien;


public interface AlienRepo extends CrudRepository<Alien, Integer> {
	
	@Query("from Alien where tech=?1 order by aName")
	List<Alien> findByaNameSorList(String tech);
	
	List<Alien> findByaName(String aName);
	List<Alien> findByaIdGreaterThan(int aId);
	
	
}
