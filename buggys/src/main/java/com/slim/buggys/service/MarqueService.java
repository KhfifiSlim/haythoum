package com.slim.buggys.service;


import java.util.List;

import org.springframework.data.domain.Page;

import com.slim.buggys.entities.Marque;
import com.slim.buggys.entities.Marque;



public interface MarqueService {
	Marque saveMarque(Marque b);
	Marque updateMarque(Marque b);
	void deleteMarque(Marque b);
	void deleteMarqueById(Long id);
	Marque getMarque(Long id);
	List<Marque> getAllMarques();
	
}
