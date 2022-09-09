package com.marketing2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing2.dto.LeadData;
import com.marketing2.entities.Lead;
import com.marketing2.services.LeadService;

@Controller
public class LeadController {
	
	@Autowired
	private LeadService leadService;
	
	//Handller methods
	@RequestMapping("/createLeadPage")
	public String viewLeadPage() {
		
		return"create_lead";
	}
	
	@RequestMapping("/saveLead")
	public String saveLead(@ModelAttribute("lead")Lead lead,ModelMap model) {
		
		leadService.saveLead(lead);
		
	    model.addAttribute("msg", "lead is saved successfully");
		
		return"create_lead";
	}
	
	@RequestMapping("/showAllLeads")
	public String showAllLeads(ModelMap model) {
		
		List leads = leadService.showAllLeads();
		model.addAttribute("Lead", leads);
		return "lead_search_result";
		
		
	}
	
	@RequestMapping("/delete")
	public String deleteById(@RequestParam("id")long id,ModelMap model) {
         
		leadService.deleteOneRecord(id);
		

		List leads = leadService.showAllLeads();
		model.addAttribute("Lead", leads);
		return "lead_search_result";
		
	}
	
	@RequestMapping("/update")
	public String updateOneRecord(@RequestParam("id")long id,ModelMap model) {
		
		Lead oneRec = leadService.getOneRecord(id);
		model.addAttribute("coin",oneRec);
		return "update_lead";
		
	}
	
	@RequestMapping("/updateLead")
	public String updateOneLead(LeadData data,ModelMap model) {
		
		Lead lead=new Lead();
		
		lead.setId(data.getId());
		lead.setFirstName(data.getFirstName());
		lead.setLastName(data.getLastName());
		lead.setEmail(data.getEmail());
		lead.setMobile(data.getMobile());
		
		leadService.saveLead(lead);
		
		List leads = leadService.showAllLeads();
		model.addAttribute("Lead", leads);
		return "lead_search_result";
		
		
	}

}
