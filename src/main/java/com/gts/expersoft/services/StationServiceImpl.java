package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Station;
import com.gts.expersoft.repositories.StationRepository;

public class StationServiceImpl implements StationService {

	@Autowired
	private StationRepository stationRepository;
	
	public void create(Station stat) {
		

	}

	public List<Station> list() {
		
		return stationRepository.list();
	}

	public void delete(int sid) {
		// TODO Auto-generated method stub

	}

	public int getMaxId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public StationRepository getStationRepository() {
		return stationRepository;
	}

	public void setStationRepository(StationRepository stationRepository) {
		this.stationRepository = stationRepository;
	}
	
	

}
