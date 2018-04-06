package com.gts.expersoft.controllers;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.models.Menus;
import com.gts.expersoft.models.Utilisateur;
import com.gts.expersoft.services.LoginService;
import com.gts.expersoft.utils.DateFormatPatterns;
import com.gts.expersoft.utils.FormattingUtilitiy;
import com.gts.expersoft.utils.XPLogger;



@Controller
@SessionAttributes({"currentUser","userMenus"})
public class LoginController {
	private static final Class<LoginController> CLASSNAME = LoginController.class;
	
	@Autowired
	private LoginService loginService;

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
				
				Utilisateur usr = loginService.autenticateUser(username, password);
				
				if(usr != null){
					flag = true;
					model.addAttribute("currentUser", usr);
					
					if(usr.getLogins().size() != 0)
					model.addAttribute("lastLogin", 
							FormattingUtilitiy.longFormattedDate(usr.getLogins().get(0).getLoginDate().getTime(), 
									DateFormatPatterns.PATTERN_3));
					List<Menus> menus = loginService.getMenu(usr.getProfile().getId());
					
					for(Menus m : menus){
						System.out.println(m.toString());
					}
					
					model.addAttribute("userMenus", menus);
					
				}else{
					message="Username or password are invalid, please try again!";
					model.addAttribute("login_message", message);
				}
				
			} catch(Exception e) {
				XPLogger.error(CLASSNAME,"Login failed!",e);
				//e.printStackTrace();
			}
			if(flag){
				return "home";
			}else{
				return "login";
			}
		}
	}
}
