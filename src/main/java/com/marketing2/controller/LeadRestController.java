package com.marketing2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marketing2.entities.Lead;
import com.marketing2.services.LeadService;

@RestController
@RequestMapping("/api/leads")
public class LeadRestController {

	@Autowired
	LeadService  leadService; 
	
	
	@GetMapping
	public List<Lead> getAllLeads(){
		
	  List<Lead> leads = leadService.showAllLeads();
		return leads;
		
		
	}
}
