package com.marketing2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing2.entities.Lead;
import com.marketing2.repositories.LeadRepository;

@Service
public class LeadServiceImpl implements LeadService {

	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
 
		leadRepo.save(lead);
		
		
	}

	@Override
	public List showAllLeads() {
		
		List<Lead> leads = leadRepo.findAll();
		
		return leads;
	}

	@Override
	public void deleteOneRecord(long id) {

		leadRepo.deleteById(id);
	}

	@Override
	public Lead getOneRecord(long id) {

		Optional<Lead> data = leadRepo.findById(id);
		     Lead lead = data.get();
		return lead;
	}
	
}
