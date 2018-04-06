package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Equipe;

public interface EquipeService {
	
	void create(Equipe e);
	List<Equipe> list();
	int getCount();
	void delete(String code);

}
