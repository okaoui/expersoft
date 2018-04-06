package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Equipe;

public interface EquipeRepository {
	
	void create(Equipe e);
	List<Equipe> list();
	int getCount();
	void delete(String code);

}
