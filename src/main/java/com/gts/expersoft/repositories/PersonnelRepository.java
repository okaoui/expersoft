package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Personel;


public interface PersonnelRepository {

	void create(Personel p);
	List<Personel> list();
	int getCount();
	void delete(String code);
}
