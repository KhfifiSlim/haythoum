package com.slim.buggys.service;

import java.util.List;

import com.slim.buggys.entities.Buggy;
import com.slim.buggys.entities.Marque;

public interface BuggyService {
	Buggy saveBuggy(Buggy b);
	Buggy updateBuggy(Buggy b);
	void deleteBuggy(Buggy b);
	void deleteBuggyById(Long id);
	Buggy getBuggy(Long id);
	List<Buggy> getAllBuggys();
	List<Buggy> findByNomBuggy(String nom);
	List<Buggy> findByNomBuggyContains(String nom);
	List<Buggy> findByNomPrix (String nom, Double prix);
	List<Buggy> findByMarque (Marque marque);
	List<Buggy> findByMarqueIdMq(Long id);
	List<Buggy> findByOrderByNomBuggyAsc();
	List<Buggy> trierBuggysNomsPrix();
}
