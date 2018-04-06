package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Equipe;
import com.gts.expersoft.repositories.EquipeRepository;

public class EquipeServiceImpl implements EquipeService {

	@Autowired
	private EquipeRepository equipeRepository;
	
	public void create(Equipe e) {
		// TODO Auto-generated method stub

	}

	public List<Equipe> list() {
		return equipeRepository.list();
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String code) {
		// TODO Auto-generated method stub

	}

	public EquipeRepository getEquipeRepository() {
		return equipeRepository;
	}

	public void setEquipeRepository(EquipeRepository equipeRepository) {
		this.equipeRepository = equipeRepository;
	}
	
	

}
