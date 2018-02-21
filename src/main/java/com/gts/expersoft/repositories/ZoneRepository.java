package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.ZoneId;

public interface ZoneRepository {

	void create(ZoneId z);
	List<ZoneId> list();
	void delete(int zid);
	int getMaxId();
}
