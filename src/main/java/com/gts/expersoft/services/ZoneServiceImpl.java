package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.ZoneId;
import com.gts.expersoft.repositories.ZoneRepository;

public class ZoneServiceImpl implements ZoneService {

	@Autowired
	private ZoneRepository zoneRepository;
	
	public void create(ZoneId z) {
		zoneRepository.create(z);
	}

	public List<ZoneId> list() {
		
		return zoneRepository.list();
	}

	public void delete(int zid) {
		zoneRepository.delete(zid);
	}

	public int getMaxId() {
		
		return zoneRepository.getMaxId();
	}

	public ZoneRepository getZoneRepository() {
		return zoneRepository;
	}

	public void setZoneRepository(ZoneRepository zoneRepository) {
		this.zoneRepository = zoneRepository;
	}

	
}
