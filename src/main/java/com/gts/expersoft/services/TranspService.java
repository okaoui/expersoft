package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Transp;

public interface TranspService {
	
	void create(Transp trans);
	List<Transp> list();
	void delete(String code);
	int getMaxId();

}
