package com.slim.buggys.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.slim.buggys.entities.Buggy;
import com.slim.buggys.entities.Marque;
@RepositoryRestResource(path = "rest")
public interface BuggyRepository extends JpaRepository<Buggy, Long> {
	List<Buggy> findByNomBuggy(String nom);
	List<Buggy> findByNomBuggyContains(String nom);
	@Query("select b from Buggy b where b.nomBuggy like %?1 and b.prixBuggy > ?2")
	List<Buggy> findByNomPrix (String nom, Double prix);
	@Query("select b from Buggy b where b.marque = ?1")
	List<Buggy> findByMarque (Marque marque);
	List<Buggy> findByMarqueIdMq(Long id);
	List<Buggy> findByOrderByNomBuggyAsc();
	@Query("select b from Buggy b order by b.nomBuggy ASC, b.prixBuggy DESC")
	List<Buggy> trierBuggysNomsPrix ();
}
