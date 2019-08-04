package com.hc.jee.pharma.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hc.jee.pharma.model.PharmacieEnService;

@Repository
public interface PharmacieRepository extends    CrudRepository<PharmacieEnService,Long> {

}
