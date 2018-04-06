package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Transp;


public interface TranspRepository {

	void create(Transp trans);
	List<Transp> list();
	void delete(String code);
	int getMaxId();
}
