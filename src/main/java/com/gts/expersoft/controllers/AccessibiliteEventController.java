package com.gts.expersoft.controllers;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.models.Profile;
import com.gts.expersoft.services.ProfileService;
import com.gts.expersoft.utils.ApplicationConstants;
import com.gts.expersoft.utils.XPLogger;

@Controller
@SessionAttributes("profileList")
public class AccessibiliteEventController {

	private static final Class<AccessibiliteEventController> CLASSNAME = AccessibiliteEventController.class;
	
	@Autowired
	private ProfileService profileService;
	
	@RequestMapping(value = {"/accessibilite/profile"}, method = RequestMethod.GET)
    public String handleEvent(Model model, @RequestParam(value="action", required=true) String action) {
		
		if (action.equals(ApplicationConstants.NEW)) {
			model.addAttribute("action", ApplicationConstants.NEW);
			model.addAttribute("newProfileId",profileService.getMaxProfileId() + 1);
		}

		return ApplicationConstants.PROFILE_PAGE_NAME;
    }
	
	
	@RequestMapping(value = {"/profile/create"}, method = RequestMethod.POST)
	public String createNewProfile(Model model, @RequestParam(value = "menuIds", required = true) int[] menuIds, 
			@RequestParam(value = "nom", required = true) String nom){
		
	    for(int id : menuIds){
	    	System.out.println(id);
	    }
	    
	    System.out.println(nom);
	    
	    try{
	    	profileService.create(menuIds, nom);
		    
		    model.addAttribute("profileList",profileService.getProfileList());
	    }catch(Exception e){
	    	XPLogger.error(CLASSNAME,"createNewProfile",e);
	    }
	    
	    
	    return ApplicationConstants.PROFILE_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/profile/show"}, method = RequestMethod.GET)
	public String showProfile(Model model, @RequestParam(value = "pid", required = true) int pid, 
			HttpServletRequest request){
		
		try{
			Profile p = profileService.get(pid);
			//System.out.println(p.toString());
			model.addAttribute("profile",p);
		}catch(Exception e){
			XPLogger.error(CLASSNAME,"showProfile",e);
		}
		
		
		
		return ApplicationConstants.PROFILE_PAGE_NAME;
	}

}
