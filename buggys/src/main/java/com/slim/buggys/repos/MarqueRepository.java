package com.slim.buggys.repos;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.slim.buggys.entities.Marque;


@RepositoryRestResource(path = "marq")
public interface MarqueRepository extends JpaRepository<Marque, Long> {
	
	
}
