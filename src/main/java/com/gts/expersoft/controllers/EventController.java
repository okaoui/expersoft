package com.gts.expersoft.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.models.Equipe;
import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.Fourn;
import com.gts.expersoft.models.Marque;
import com.gts.expersoft.models.Nation;
import com.gts.expersoft.models.Personel;
import com.gts.expersoft.models.Produit;
import com.gts.expersoft.models.Region;
import com.gts.expersoft.models.Station;
import com.gts.expersoft.models.Transp;
import com.gts.expersoft.models.Uom;
import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.models.Village;
import com.gts.expersoft.models.ZoneId;
import com.gts.expersoft.services.EquipeService;
import com.gts.expersoft.services.FournService;
import com.gts.expersoft.services.MarqueService;
import com.gts.expersoft.services.PersonnelService;
import com.gts.expersoft.services.ProducteurService;
import com.gts.expersoft.services.ProduitService;
import com.gts.expersoft.services.ProfileService;
import com.gts.expersoft.services.RegionService;
import com.gts.expersoft.services.StationService;
import com.gts.expersoft.services.TranspService;
import com.gts.expersoft.services.VarieteService;
import com.gts.expersoft.services.ZoneService;
import com.gts.expersoft.utils.ApplicationConstants;
import com.gts.expersoft.utils.XPLogger;

@Controller
@SessionAttributes({"profileList","listUom","listP","listV","listZ",
	"listR","listNat", "listVil", "listFarm","listStat",
	"listTransp","listPerson","listEquip","listParc","listFourn","listMarq"})
public class EventController {
	private static final Class<EventController> CLASSNAME = EventController.class;

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
	@Autowired
	private StationService stationService;
	@Autowired
	private TranspService transpService;
	@Autowired
	private PersonnelService personnelService;
	@Autowired
	private ProducteurService producteurService;
	@Autowired
	private EquipeService equipeService;
	@Autowired
	private FournService fournService;
	@Autowired
	private MarqueService marqueService;
	
	@RequestMapping(value = {"/event"}, method = RequestMethod.GET)
    public String handleEvent(Model model, @RequestParam(value="id", required=true) int menuId) {
		
		try{	
			List<Uom> listUom = produitService.listUom();
			List<Produit> listP = produitService.list();
			List<VarieteId> listV = varieteService.list();
			List<ZoneId> listZ = zoneService.list();
			List<Region> listR = regionService.list();
			List<Nation> listNat = producteurService.listNation();
			List<Village> listVil = producteurService.listVillage();
			List<Farmer> listFarm = producteurService.list();
			List<Station> listStat = stationService.list();
			List<Transp> listTrans = transpService.list();
			List<Personel> listPerson = personnelService.list();
			List<Equipe> listEquipe = equipeService.list();
			List<Farmsurf> listParc = producteurService.listParcelle();
			List<Fourn> listFourn = fournService.list();
			List<Marque> listMarq = marqueService.list();
			
			model.addAttribute("listR",listR);
			model.addAttribute("listZ",listZ);
			model.addAttribute("listV",listV);
			model.addAttribute("listUom",listUom);
			model.addAttribute("listP",listP);
			model.addAttribute("listNat",listNat);
			model.addAttribute("listVil",listVil);
			model.addAttribute("listFarm",listFarm);
			model.addAttribute("listStat",listStat);
			model.addAttribute("listTransp",listTrans);
			model.addAttribute("listPerson",listPerson);
			model.addAttribute("listEquip",listEquipe);
			model.addAttribute("listParc",listParc);
			model.addAttribute("listFourn",listFourn);
			model.addAttribute("listMarq",listMarq);
			model.addAttribute("profileList", profileService.getProfileList());
		}catch(Exception e){
			XPLogger.error(CLASSNAME,"handleEvent",e);
		}
		
		//System.out.println(menuId);
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
		case ApplicationConstants.PRODUCTEUR_PAGE_ID:
			return ApplicationConstants.PRODUCTEUR_PAGE_NAME;
		case ApplicationConstants.RECEPPROD_PAGE_ID:
			return ApplicationConstants.RECEPPROD_PAGE_NAME;
		default:
			return "home";
		}
    }

}
