package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Profile;

public interface ProfileService {

	long getMaxProfileId();
	List<Profile> getProfileList();
	Profile get(int pid);
	void create(int[] menuIds, String nom);
}
