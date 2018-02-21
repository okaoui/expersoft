package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.ZoneId;

public interface ZoneService {

	void create(ZoneId z);
	List<ZoneId> list();
	void delete(int zid);
	int getMaxId();
}
