package com.gts.expersoft.controllers;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.services.ProducteurService;
import com.gts.expersoft.utils.ApplicationConstants;
import com.gts.expersoft.utils.DateFormatPatterns;
import com.gts.expersoft.utils.FormattingUtilitiy;
import com.gts.expersoft.utils.XPLogger;

@Controller
@SessionAttributes({"listFarm"})
public class FarmerController {

	private static final Class<FarmerController> CLASSNAME = FarmerController.class;

	@Autowired
	private ProducteurService producteurService;
	
	@RequestMapping(value = {"/farmer/create"}, method = RequestMethod.POST)
	public String createNewFarmer(Model model, 
			@RequestParam(value = "date_entre", required = true) String date_entre,
			@RequestParam(value = "nom", required = true) String nom,
			@RequestParam(value = "adr_fou", required = true) String adr_fou,
			@RequestParam(value = "tel_fou", required = true) String tel_fou,
			@RequestParam(value = "fax_fou", required = true) String fax_fou,
			@RequestParam(value = "mail_fou", required = true) String mail_fou,
			@RequestParam(value = "date_nais", required = true) String date_nais,
			@RequestParam(value = "lieu", required = true) String lieu,
			@RequestParam(value = "nation", required = true) String nation,
			@RequestParam(value = "sexe", required = true) String sexe,
			@RequestParam(value = "ref_piece", required = true) String ref_piece,
			@RequestParam(value = "prodRe", required = true) String[] prodRe,
			@RequestParam(value = "estim", required = true) String[] estim,
			@RequestParam(value = "surf2", required = true) String[] surf2,
			@RequestParam(value = "surf", required = true) String[] surf,
			@RequestParam(value = "var", required = true) String[] var,
			@RequestParam(value = "prod", required = true) String[] prod,
			@RequestParam(value = "loc", required = true) String[] loc,
			@RequestParam(value = "numParc", required = true) String[] numParc){
		Farmer f = new Farmer();
		f.setAdr(adr_fou);
		f.setNomFarm(nom);
		f.setCodNat(nation);
		f.setDatentre(date_entre);
		f.setDnais(date_nais);
		f.setFax(fax_fou);
		f.setLnais(lieu);
		f.setMail(mail_fou);
		f.setNopiece(ref_piece);
		f.setTel(tel_fou);
		f.setSexe((sexe.equalsIgnoreCase(ApplicationConstants.FEMME)?0:1));
		
		List<Farmsurf> list = new ArrayList<Farmsurf>();
		for(int i = 0; i < 6; i++){
			if(numParc[i] != null && !numParc[i].isEmpty()){
				Farmsurf fs = new Farmsurf();
				fs.setCodParcel(numParc[i]);
				fs.setCodProd(prod[i]);
				fs.setCodVar(var[i]);
				fs.setCodVil(loc[i]);
				fs.setQteBp(surf[i]);
				fs.setQteBr(surf2[i]);
				fs.setQteFp(estim[i]);
				fs.setQteFr(prodRe[i]);
				
				list.add(fs);
			}
		}
		
		try{
			producteurService.create(f, list);
			model.addAttribute("listFarm",producteurService.list());
		}catch(Exception e){
			XPLogger.error(CLASSNAME,"createNewFarmer",e);
		}
		
		
		
		return ApplicationConstants.PRODUCTEUR_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/farmer/delete"}, method = RequestMethod.GET)
	public String deleteFarmer(Model model, 
			@RequestParam(value = "code", required = true) String code){
		
		try{
			producteurService.delete(code);
			List<Farmer> listV = producteurService.list();
			model.addAttribute("listFarm",listV);
		}catch(Exception e){
			XPLogger.error(CLASSNAME,"deleteFarmer",e);
		}
		
		
		return ApplicationConstants.PRODUCTEUR_PAGE_NAME;
	}
}
