package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Region;


public interface RegionService {
	
	void create(Region reg);
	List<Region> list();
	void delete(int rid);
	int getMaxId();

}
