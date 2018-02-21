package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Region;
import com.gts.expersoft.repositories.RegionRepository;

public class RegionServiceImpl implements RegionService {

	@Autowired
	private RegionRepository regionRepository;
	
	public void create(Region reg) {
		regionRepository.create(reg);

	}

	public List<Region> list() {
		
		return regionRepository.list();
	}

	public void delete(int rid) {
		regionRepository.delete(rid);
	}

	public int getMaxId() {
		return regionRepository.getMaxId();
	}

	public RegionRepository getRegionRepository() {
		return regionRepository;
	}

	public void setRegionRepository(RegionRepository regionRepository) {
		this.regionRepository = regionRepository;
	}

	
}
