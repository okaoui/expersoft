package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Marque;
import com.gts.expersoft.repositories.MarqueRepository;

public class MarqueServiceImpl implements MarqueService {

	@Autowired
	private MarqueRepository marqueRepository;
	
	
	public void create(Marque m) {
		// TODO Auto-generated method stub

	}

	public List<Marque> list() {
		
		return marqueRepository.list();
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String code) {
		// TODO Auto-generated method stub

	}

	public MarqueRepository getMarqueRepository() {
		return marqueRepository;
	}

	public void setMarqueRepository(MarqueRepository marqueRepository) {
		this.marqueRepository = marqueRepository;
	}

	
}
