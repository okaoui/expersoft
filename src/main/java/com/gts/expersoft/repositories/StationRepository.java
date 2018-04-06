package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Station;


public interface StationRepository {
	
	void create(Station stat);
	List<Station> list();
	void delete(int sid);
	int getMaxId();

}
