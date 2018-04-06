package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Transp;
import com.gts.expersoft.repositories.TranspRepository;

public class TranspServiceImpl implements TranspService {

	@Autowired
	private TranspRepository transpRepository;
	public void create(Transp trans) {
		// TODO Auto-generated method stub

	}

	public List<Transp> list() {
		return transpRepository.list();
	}

	public void delete(String code) {
		// TODO Auto-generated method stub

	}

	public int getMaxId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public TranspRepository getTranspRepository() {
		return transpRepository;
	}

	public void setTranspRepository(TranspRepository transpRepository) {
		this.transpRepository = transpRepository;
	}
	
	

}
