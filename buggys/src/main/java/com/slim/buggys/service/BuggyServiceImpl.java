package com.slim.buggys.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slim.buggys.entities.Buggy;
import com.slim.buggys.entities.Marque;
import com.slim.buggys.repos.BuggyRepository;

@Service
public class BuggyServiceImpl implements BuggyService {
	@Autowired
	BuggyRepository buggyRepository;
	@Override
	public Buggy saveBuggy(Buggy b) {
	return buggyRepository.save(b);
	}
	@Override
	public Buggy updateBuggy(Buggy b) {
	return buggyRepository.save(b);
	}
	@Override
	public void deleteBuggy(Buggy b) {
	buggyRepository.delete(b);
	}
	@Override
	public void deleteBuggyById(Long id) {
	buggyRepository.deleteById(id);
	}
	@Override
	public Buggy getBuggy(Long id) {
	return buggyRepository.findById(id).get();
	}
	@Override
	public List<Buggy> getAllBuggys() {
	return buggyRepository.findAll();
	}
	@Override
	public List<Buggy> findByNomBuggy(String nom) {
	return buggyRepository.findByNomBuggy(nom);
	}
	@Override
	public List<Buggy> findByNomBuggyContains(String nom) {
	return buggyRepository.findByNomBuggyContains(nom);
	}
	@Override
	public List<Buggy> findByNomPrix(String nom, Double prix) {
		return buggyRepository.findByNomPrix(nom, prix);
	}
	@Override
	public List<Buggy> findByMarque(Marque marque) {
	return buggyRepository.findByMarque(marque);
	}
	@Override
	public List<Buggy> findByMarqueIdMq(Long id) {
	return buggyRepository.findByMarqueIdMq(id);
	}
	@Override
	public List<Buggy> findByOrderByNomBuggyAsc() {
	return buggyRepository.findByOrderByNomBuggyAsc();
	}
	@Override
	public List<Buggy> trierBuggysNomsPrix() {
	return buggyRepository.trierBuggysNomsPrix();
	}
	}


