package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Personel;

public interface PersonnelService {

	void create(Personel p);
	List<Personel> list();
	int getCount();
	void delete(String code);
}
