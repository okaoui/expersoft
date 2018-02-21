package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Profile;
import com.gts.expersoft.repositories.ProfileRepositoryImpl;

public class ProfileServiceImpl implements ProfileService {

	
	@Autowired
	private ProfileRepositoryImpl profileRepository;
	
	public long getMaxProfileId() {
		
		return profileRepository.getMaxProfileId();
	}

	public ProfileRepositoryImpl getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(ProfileRepositoryImpl profileRepository) {
		this.profileRepository = profileRepository;
	}

	public List<Profile> getProfileList() {
		
		return profileRepository.list();
	}

	public void create(int[] menuIds, String nom) {
		profileRepository.create(menuIds, nom);
	}

	public Profile get(int pid) {
		return profileRepository.get(pid);
	}
}
