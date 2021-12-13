package com.slim.buggys.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import com.slim.buggys.repos.MarqueRepository;

import com.slim.buggys.entities.Marque;




@Service
public class MarqueServiceImpl implements MarqueService {
	@Autowired
	MarqueRepository marqueRepository;
	@Override
	public Marque saveMarque(Marque b) {
	return marqueRepository.save(b);
	}
	@Override
	public Marque updateMarque(Marque b) {
	return marqueRepository.save(b);
	}
	@Override
	public void deleteMarque(Marque b) {
	marqueRepository.delete(b);
	}
	@Override
	public void deleteMarqueById(Long id) {
	marqueRepository.deleteById(id);
	}
	@Override
	public Marque getMarque(Long id) {
	return marqueRepository.findById(id).get();
	}
	@Override
	public List<Marque> getAllMarques() {
	return marqueRepository.findAll();
	}
	
}
