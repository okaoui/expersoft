package com.gts.expersoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.models.Produit;
import com.gts.expersoft.models.Region;
import com.gts.expersoft.models.Uom;
import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.models.ZoneId;
import com.gts.expersoft.services.ProduitService;
import com.gts.expersoft.services.ProfileService;
import com.gts.expersoft.services.RegionService;
import com.gts.expersoft.services.VarieteService;
import com.gts.expersoft.services.ZoneService;
import com.gts.expersoft.utils.ApplicationConstants;

@Controller
@SessionAttributes({"profileList","listUom","listP","listV","listZ","listR"})
public class EventController {
	
	@Autowired
	private ProfileService profileService;
	@Autowired
	private ProduitService produitService;
	@Autowired
	private VarieteService varieteService;
	@Autowired
	private ZoneService zoneService;
	@Autowired
	private RegionService regionService;
	
	@RequestMapping(value = {"/event"}, method = RequestMethod.GET)
    public String handleEvent(Model model, @RequestParam(value="id", required=true) int menuId) {
		List<Uom> listUom = produitService.listUom();
		List<Produit> listP = produitService.list();
		List<VarieteId> listV = varieteService.list();
		List<ZoneId> listZ = zoneService.list();
		List<Region> listR = regionService.list();
		
		model.addAttribute("listR",listR);
		model.addAttribute("listZ",listZ);
		model.addAttribute("listV",listV);
		model.addAttribute("listUom",listUom);
		model.addAttribute("listP",listP);
		model.addAttribute("profileList", profileService.getProfileList());
		
		System.out.println(menuId);
		switch (menuId) {
		case ApplicationConstants.PROFILE_PAGE_ID:
			return ApplicationConstants.PROFILE_PAGE_NAME;
		case ApplicationConstants.ACCESS_PAGE_ID:
			return ApplicationConstants.ACCESS_PAGE_NAME;
		case ApplicationConstants.PRODUIT_PAGE_ID:
			return ApplicationConstants.PRODUIT_PAGE_NAME;
		case ApplicationConstants.VARIETE_PAGE_ID:
			return ApplicationConstants.VARIETE_PAGE_NAME;
		case ApplicationConstants.ZONE_PAGE_ID:
			return ApplicationConstants.ZONE_PAGE_NAME;
		case ApplicationConstants.REGION_PAGE_ID:
			return ApplicationConstants.REGION_PAGE_NAME;
		default:
			return "home";
		}
    }

}
