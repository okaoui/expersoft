package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.VarieteId;

public interface VarieteService {
	
	void create(VarieteId v);
	List<VarieteId> list();
	int getMaxId();
	void delete(int vid);

}
