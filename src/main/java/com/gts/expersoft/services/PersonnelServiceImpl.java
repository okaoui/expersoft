package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Personel;
import com.gts.expersoft.repositories.PersonnelRepository;

public class PersonnelServiceImpl implements PersonnelService {

	@Autowired
	private PersonnelRepository personnelRepository;
	
	public void create(Personel p) {
		// TODO Auto-generated method stub

	}

	public List<Personel> list() {
		return personnelRepository.list();
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String code) {
		// TODO Auto-generated method stub

	}

	public PersonnelRepository getPersonnelRepository() {
		return personnelRepository;
	}

	public void setPersonnelRepository(PersonnelRepository personnelRepository) {
		this.personnelRepository = personnelRepository;
	}

	
}
