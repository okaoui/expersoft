package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Station;


public interface StationService {

	void create(Station stat);
	List<Station> list();
	void delete(int sid);
	int getMaxId();
}
