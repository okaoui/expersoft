package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gts.expersoft.models.Fourn;
import com.gts.expersoft.repositories.FournRepository;

@Service
public class FournServiceImpl implements FournService {

	@Autowired
	private FournRepository fournRepository;
	
	public List<Fourn> list() {
		return fournRepository.list();
	}

	public Fourn get(int pid) {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(Fourn f) {
		// TODO Auto-generated method stub

	}

	public FournRepository getFournRepository() {
		return fournRepository;
	}

	public void setFournRepository(FournRepository fournRepository) {
		this.fournRepository = fournRepository;
	}
	
	

}
