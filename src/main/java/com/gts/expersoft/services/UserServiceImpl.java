package com.gts.expersoft.services;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gts.expersoft.models.User;
import com.gts.expersoft.repositories.UserRepository;



@Service
public class UserServiceImpl implements UserService {
	private static Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);
	
	@Autowired
    private UserRepository userRepository;

	public boolean saveAndEmailLoginDetails(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	public User findByUsernameAndPassword(String username, String password) {
		User u = new User();
		u.setFirstName("oussama");
		u.setLastName("kaoui");
		return u;
	}

	public User findByFullName(String firstname, String lastname) {
		User u = new User();
		u.setFirstName("oussama");
		u.setLastName("kaoui");
		return u;
	}
	
	
    
	
	
}
