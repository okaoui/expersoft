package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Region;

public interface RegionRepository {

	void create(Region reg);
	List<Region> list();
	void delete(int rid);
	int getMaxId();

}
