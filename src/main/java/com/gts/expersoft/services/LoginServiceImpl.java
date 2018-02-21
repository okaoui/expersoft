package com.gts.expersoft.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.gts.expersoft.models.Menus;
import com.gts.expersoft.models.Profile;
import com.gts.expersoft.models.Utilisateur;
import com.gts.expersoft.repositories.UserRepositoryImpl;

public class LoginServiceImpl implements LoginService {

	@Autowired
	private UserRepositoryImpl userRepository;
	
	public Utilisateur autenticateUser(String username, String password) {
		
		Utilisateur usr = userRepository.getUserInfo(username,password);
		
		if(usr != null){
			userRepository.registerLogin(usr.getId());
			long pid = userRepository.getProfileId(usr.getId());
			
			Profile p = new Profile();
			p.setId((int)pid);
			usr.setProfile(p);
			return usr;
		}
		
		return usr;
	}

	public List<Menus> getMenu(long pid) {
		List<Menus> menus = userRepository.getMenus(pid);
		return menus;
	}

	public UserRepositoryImpl getUserRepository() {
		return userRepository;
	}

	public void setUserRepository(UserRepositoryImpl userRepository) {
		this.userRepository = userRepository;
	}
	
}
