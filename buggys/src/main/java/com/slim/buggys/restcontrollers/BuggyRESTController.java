package com.slim.buggys.restcontrollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.slim.buggys.entities.Buggy;
import com.slim.buggys.service.BuggyService;

@RestController
@RequestMapping("/api")
@CrossOrigin


public class BuggyRESTController {
	@Autowired
	BuggyService buggyService;
	@RequestMapping(path = "all",method = RequestMethod.GET)
	public List<Buggy> getAllBuggys() {
	return buggyService.getAllBuggys();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Buggy getBuggyById(@PathVariable("id") Long id) { return buggyService.getBuggy(id);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public Buggy createBuggy(@RequestBody Buggy buggy) {
	return buggyService.saveBuggy(buggy);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Buggy updateBuggy(@RequestBody Buggy buggy) {
	return buggyService.updateBuggy(buggy);
	}
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteBuggy(@PathVariable("id") Long id)
	{
	buggyService.deleteBuggyById(id);
	}
	
	@RequestMapping(value="/bgsmq/{idMq}",method = RequestMethod.GET)
	public List<Buggy> getBuggysByMqId(@PathVariable("idMq") Long idMq) {
	return buggyService.findByMarqueIdMq(idMq);
	}
	}

