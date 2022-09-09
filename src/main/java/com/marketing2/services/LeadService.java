package com.marketing2.services;

import java.util.List;

import com.marketing2.entities.Lead;

public interface LeadService {

	public void  saveLead(Lead lead);

	public List<Lead> showAllLeads();

	public void deleteOneRecord(long id);

	public Lead getOneRecord(long id);

	
	
}
