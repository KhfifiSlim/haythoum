package com.slim.buggys;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.slim.buggys.entities.Buggy;
import com.slim.buggys.entities.Marque;
import com.slim.buggys.repos.BuggyRepository;

@SpringBootTest
class BuggysApplicationTests {
	@Autowired
	private BuggyRepository buggyRepository;

	@Test
	public void testCreateBuggy() {
		Buggy prod = new Buggy("Can-am rs turbo",155000.500,new Date());
		buggyRepository.save(prod);
		}
	@Test
	public void testFindBuggy()
	{
	Buggy b = buggyRepository.findById(1L).get();

	System.out.println(b);
	}
	@Test
	public void testUpdateBuggy()
	{
	Buggy b = buggyRepository.findById(1L).get();
	b.setPrixBuggy(100000.0);
	buggyRepository.save(b);
	}
	@Test
	public void testDeleteProduit()
	{
	buggyRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousBuggys()
	{
	List<Buggy> bgs = buggyRepository.findAll();
	for (Buggy b : bgs)
	{
	System.out.println(b);
	}

    }
	@Test
	public void testFindByNomBuggy()
	{
	List<Buggy> bgs = buggyRepository.findByNomBuggy("can-am maverick x3");

	for (Buggy b : bgs)
	{
	System.out.println(b);
	}

	}
	@Test
	public void testFindByNomBuggyContains ()
	{
	List<Buggy> bgs=buggyRepository.findByNomBuggyContains("o");

	for (Buggy b : bgs)
	{
	System.out.println(b);
	} }
	
	@Test
	public void testfindByNomPrix()
	{
	List<Buggy> bgs = buggyRepository.findByNomPrix("polaris rzr xp", 100000.0);
	for (Buggy b : bgs)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void testfindByMarque()
	{
	Marque maq = new Marque();
	maq.setIdMq(1L);
	List<Buggy> bgs = buggyRepository.findByMarque(maq);
	for (Buggy b : bgs)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void findByMarqueIdMq()
	{
	List<Buggy> bgs = buggyRepository.findByMarqueIdMq(1L);
	for (Buggy b : bgs)
	{
	System.out.println(b);
	}

	}
	
	@Test
	public void testfindByOrderByNomBuggyAsc()
	{
	List<Buggy> bgs =

	buggyRepository.findByOrderByNomBuggyAsc();
	for (Buggy b : bgs)
	{
	System.out.println(b);
	}
	}
	
	@Test
	public void testTrierBuggysNomsPrix()
	{
	List<Buggy> bgs = buggyRepository.trierBuggysNomsPrix();
	for (Buggy b : bgs)
	{
	System.out.println(b);
	}

	}
}
