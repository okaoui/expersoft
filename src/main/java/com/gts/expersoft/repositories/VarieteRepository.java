package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.VarieteId;

public interface VarieteRepository {
	
	void create(VarieteId v);
	List<VarieteId> list();
	int getMaxId();
	void delete(int vid);

}
