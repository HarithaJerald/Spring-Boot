package com.ust.sdr.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ust.sdr.Alien;
@RepositoryRestResource(collectionResourceRel = "aliens", path="aliens")
public interface AlienRepo extends JpaRepository<Alien, Integer> {

}
