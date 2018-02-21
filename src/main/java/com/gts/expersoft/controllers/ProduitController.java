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
import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.models.ZoneId;
import com.gts.expersoft.services.ProduitService;
import com.gts.expersoft.services.RegionService;
import com.gts.expersoft.services.VarieteService;
import com.gts.expersoft.services.ZoneService;
import com.gts.expersoft.utils.ApplicationConstants;

@Controller
@SessionAttributes({"profileList","listUom","listP","listV","listZ","listR"})
public class ProduitController {
	
	@Autowired
	private ProduitService produitService;
	
	@Autowired
	private VarieteService varieteService;
	
	@Autowired
	private ZoneService zoneService;
	
	@Autowired
	private RegionService regionService;
	
	@RequestMapping(value = {"/produit/create"}, method = RequestMethod.POST)
	public String createNewProduit(Model model, 
			@RequestParam(value = "pref_nbe", required = true) String prefNbe, 
			@RequestParam(value = "nom", required = true) String nom,
			@RequestParam(value = "prochainN", required = true) String prochainN,
			@RequestParam(value = "cpteAch", required = true) String cpteAch,
			@RequestParam(value = "tauxBic", required = true) String tauxBic,
			@RequestParam(value = "prefNbs", required = true) String prefNbs,
			@RequestParam(value = "prochainN2", required = true) String prochainN2,
			@RequestParam(value = "cpteVte", required = true) String cpteVte,
			@RequestParam(value = "cptBic", required = true) String cptBic,
			@RequestParam(value = "uomAch", required = true) String uomAch,
			@RequestParam(value = "uomStat", required = true) String uomStat,
			@RequestParam(value = "puAchProd", required = true) double puAchProd,
			@RequestParam(value = "puAchTechRec", required = true) double puAchTechRec){
		
	    
	    
	    Produit p = new Produit();
	    p.setLibProd(nom);
	    p.setPnobe(prefNbe);
	    p.setPnobs(prefNbs);
	    p.setCodUom(uomAch);
	    p.setCodUom2(uomStat);
	    p.setPuFarm(puAchProd);
	    p.setPuFou(puAchTechRec);
	    p.setCptAch(cpteAch);
	    p.setCptVte(cpteVte);
	    p.setCptBic(cptBic);
	    p.setNoBs(Integer.valueOf(prochainN2));
	    p.setNoBe(Integer.valueOf(prochainN));
	    p.setBic(Double.valueOf(tauxBic));
	    
	    produitService.create(p);
	    
	    List<Produit> listP = produitService.list();
		model.addAttribute("listP",listP);
	    
	    
	    return ApplicationConstants.PRODUIT_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/variete/create"}, method = RequestMethod.POST)
	public String createNewVariete(Model model, 
			@RequestParam(value = "prod", required = true) String prod, 
			@RequestParam(value = "nom", required = true) String nom,
			@RequestParam(value = "abrege", required = true) String abrege,
			@RequestParam(value = "order", required = true) Integer order){
		
	    VarieteId v = new VarieteId();
	    v.setAbrege(abrege);
	    v.setCodProd(prod);
	    v.setLibVar(nom);
	    v.setOrdre(order);
	   
	    varieteService.create(v);
	    
	    List<VarieteId> listV = varieteService.list();
		model.addAttribute("listV",listV);
	    
	    
	    return ApplicationConstants.VARIETE_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/variete/delete"}, method = RequestMethod.GET)
	public String deleteVariete(Model model, 
			@RequestParam(value = "vid", required = true) Integer vid){
		varieteService.delete(vid);
		List<VarieteId> listV = varieteService.list();
		model.addAttribute("listV",listV);
		return ApplicationConstants.VARIETE_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/zone/create"}, method = RequestMethod.POST)
	public String createZone(Model model, @RequestParam(value = "nom", required = true) String nom){
		ZoneId z = new ZoneId();
		z.setLibZone(nom);
		
		zoneService.create(z);
		model.addAttribute("listZ",zoneService.list());
		
		return ApplicationConstants.ZONE_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/zone/delete"}, method = RequestMethod.GET)
	public String deleteZone(Model model, 
			@RequestParam(value = "zid", required = true) Integer zid){
		
		zoneService.delete(zid);
		model.addAttribute("listZ",zoneService.list());
		
		return ApplicationConstants.ZONE_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/region/create"}, method = RequestMethod.POST)
	public String createRegion(Model model, @RequestParam(value = "nom", required = true) String nom,
			@RequestParam(value = "lati", required = true) double lati,
			@RequestParam(value = "long", required = true) double longi){
		Region reg = new Region();
		reg.setLibRegion(nom);
		reg.setLatiGps(lati);
		reg.setLongGps(longi);
		
		regionService.create(reg);
		model.addAttribute("listR",regionService.list());
		
		return ApplicationConstants.REGION_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/region/delete"}, method = RequestMethod.GET)
	public String deleteRegion(Model model, 
			@RequestParam(value = "rid", required = true) Integer rid){
		
		regionService.delete(rid);
		model.addAttribute("listR",regionService.list());
		
		return ApplicationConstants.REGION_PAGE_NAME;
	}

}
