package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Fourn;

public interface FournService {

	List<Fourn> list();
	Fourn get(int pid);
	void create(Fourn f);
}
