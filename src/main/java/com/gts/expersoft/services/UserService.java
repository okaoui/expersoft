package com.gts.expersoft.services;

import com.gts.expersoft.models.User;

public interface UserService {
	boolean saveAndEmailLoginDetails(User user);
	User findByUsernameAndPassword(String username, String password);
	User findByFullName(String firstname, String lastname);

}
