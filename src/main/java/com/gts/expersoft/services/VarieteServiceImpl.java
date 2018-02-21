package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.repositories.VarieteRepository;

public class VarieteServiceImpl implements VarieteService {

	@Autowired
	private VarieteRepository varieteRepository;
	
	public void create(VarieteId v) {
		varieteRepository.create(v);
	}

	public List<VarieteId> list() {
		
		return varieteRepository.list();
	}

	public int getMaxId() {
		return varieteRepository.getMaxId();
	}

	public VarieteRepository getVarieteRepository() {
		return varieteRepository;
	}

	public void setVarieteRepository(VarieteRepository varieteRepository) {
		this.varieteRepository = varieteRepository;
	}

	public void delete(int vid) {
		varieteRepository.delete(vid);
		
	}
	
	

}
