package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Marque;

public interface MarqueService {
	
	void create(Marque m);
	List<Marque> list();
	int getCount();
	void delete(String code);

}
