package com.marketing.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketing.entities.Lead;
import com.marketing.repositories.LeadRepository;
 
@Service
public class LeadServiceImpl implements LeadService{

	@Autowired
	private LeadRepository leadRepo;
	
	@Override
	public void saveLead(Lead lead) {
         leadRepo.save(lead);
		
	}

	@Override
	public List<Lead> getLeads() {
		List<Lead> lead = leadRepo.findAll();
		return lead;
	}

	@Override
	public Lead findOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleteOneLead(long id) {
         leadRepo.deleteById(id);	
	}

}
