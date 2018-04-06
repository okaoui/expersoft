package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Marque;



public interface MarqueRepository {
	
	void create(Marque m);
	List<Marque> list();
	int getCount();
	void delete(String code);

}
