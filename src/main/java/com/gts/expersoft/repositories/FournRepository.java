package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Fourn;


public interface FournRepository {

	void create(Fourn f);
	List<Fourn> list();
	int getCount();
	void delete(String code);
}
