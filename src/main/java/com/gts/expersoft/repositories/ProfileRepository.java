package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Profile;

public interface ProfileRepository {
	
	long getMaxProfileId();
	List<Profile> list();
	void create(int[] menuIds, String nom);
	Profile get(int pid);
	
	
	

}
