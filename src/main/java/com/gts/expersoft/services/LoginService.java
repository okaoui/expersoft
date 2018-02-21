package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Menus;
import com.gts.expersoft.models.Utilisateur;


public interface LoginService {
	
	Utilisateur autenticateUser(String username, String password);
	List<Menus> getMenu(long pid);
	

}
