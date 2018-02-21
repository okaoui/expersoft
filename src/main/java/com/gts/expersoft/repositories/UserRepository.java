package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Menus;
import com.gts.expersoft.models.Utilisateur;

public interface UserRepository {
	
	
	Utilisateur getUserInfo(String username, String password);
	void registerLogin(long uid);
	long getProfileId(long uid);
	List<Menus> getMenus(long pid);
	
	
	

}
