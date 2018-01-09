package com.gts.expersoft.controllers;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.models.User;
import com.gts.expersoft.services.UserService;
import com.gts.expersoft.utils.DateFormatPatterns;
import com.gts.expersoft.utils.HelperClass;



@Controller
@SessionAttributes("storedUser")
public class UserController {
	private static Logger LOGGER = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String displayLoginAndSignupForms(Model model, @RequestParam(value="logout", required=false) String logout) {
    	 
        return "login";
    }
    
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(Model model, @RequestParam String username, @RequestParam String password){
		boolean flag = false;
		String message="";
		if (username.isEmpty() || password.isEmpty()) {
			
			return "login";
		} else {
			try {
				
				User storedUser = userService.findByUsernameAndPassword(username, password);
				
				if(storedUser != null){
					flag = true;
					storedUser.setFirstName(HelperClass.capitalizeFirstLetter(storedUser.getFirstName()));
					model.addAttribute("storedUser", storedUser);
					model.addAttribute("datetime", 
							HelperClass.convertJavaDateToStringFormat(new Date(), DateFormatPatterns.PATTERN_ONE));
					
				}else{
					message="Username or password are invalid, please try again!";
					model.addAttribute("login_message", message);
				}
				
			} catch (Exception e) {
				LOGGER.error("Login failed!", e);
				e.printStackTrace();
			}
			if(flag){
				return "access";
			}else{
				return "login";
			}
		}
	}
}
