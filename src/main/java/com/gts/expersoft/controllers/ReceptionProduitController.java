package com.gts.expersoft.controllers;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.gts.expersoft.models.Be;
import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.Produit;
import com.gts.expersoft.utils.ApplicationConstants;

@Controller
public class ReceptionProduitController {

	@RequestMapping(value = {"/recepprod/create"}, method = RequestMethod.POST)
	public String newRecepProd(HttpServletRequest request, Model model, 
			@RequestParam(value = "prod", required = true) String prodCode,
			@RequestParam(value = "parcel", required = true) String parcel,
			@RequestParam(value = "numRecep", required = true) String numRecep,
			@RequestParam(value = "dateRecep", required = true) String dateRecep,
			@RequestParam(value = "contrat") String contrat,
			@RequestParam(value = "period") String period,
			@RequestParam(value = "au") String au,
			@RequestParam(value = "station", required = true) String station,
			@RequestParam(value = "fourn", required = true) String fourn,
			@RequestParam(value = "equipe") String equipe,
			@RequestParam(value = "codVil") String codVil,
			@RequestParam(value = "libVil") String libVil,
			@RequestParam(value = "codFarm") String codFarm,
			@RequestParam(value = "nomFarm") String nomFarm,
			@RequestParam(value = "codVar") String codVar,
			@RequestParam(value = "libVar") String libVar,
			@RequestParam(value = "qty") String qty,
			@RequestParam(value = "pu") String pu,
			//@RequestParam(value = "total") Object total
			@RequestParam(value = "numBonRec", required = true) String numBonRec,
			@RequestParam(value = "numBonCond", required = true) String numBonCond,
			@RequestParam(value = "dateRecol", required = true) String dateRecol,
			@RequestParam(value = "dateCond", required = true) String dateCond,
			@RequestParam(value = "marque", required = true) String marque,
			@RequestParam(value = "transp") String transp,
			@RequestParam(value = "chauff") String chauff,
			@RequestParam(value = "camion") String camion,
			@RequestParam(value = "remorque") String remorque,
			@RequestParam(value = "decision") String decision
			//@RequestParam(value = "calibre") String[] calibre
			/*@RequestParam(value = "qtyBat") String[] qtyBat,
			@RequestParam(value = "qtyAvi") String[] qtyAvi,
			@RequestParam(value = "qtyExt") String[] qtyExt,
			@RequestParam(value = "qtyTotal") String[] qtyTotal*/){
	    
		System.out.println("here");
		System.out.println(qty);
		System.out.println(pu);
		System.out.println(numBonRec);
		System.out.println(marque);
		System.out.println(numBonCond);
		System.out.println(dateCond);
		System.out.println(dateRecol);
		//System.out.println(calibre.length);
		//System.out.println(qtyBat.length);
		
		Be draft = new Be();
		//draft.set
	    //List<Produit> list = (List<Produit>) request.getSession().getAttribute("listP");
	    List<Farmsurf> listParc = (List<Farmsurf>)request.getSession().getAttribute("listParc");
	    List<Farmer> listFarm = (List<Farmer>)request.getSession().getAttribute("listFarm");
	    
	    //Produit target = null;
	    Farmsurf parcTarget = null;
	    /*if(list != null){
	    	for(Produit p : list){
		    	if(p.getCodProd().equalsIgnoreCase(prodCode)){
		    		target = p;
		    		break;
		    	}
		    }
	    }*/
	    
	    if(listParc != null){
	    	for(Farmsurf fs : listParc){
	    		if(fs.getCodParcel().equalsIgnoreCase(parcel)){
	    			parcTarget = fs;
	    			break;
	    		}
	    	}
	    }
	    
	    if(parcTarget != null){
	    	for(Farmer fr : listFarm){
	    		if(parcTarget.getCodFarm().equalsIgnoreCase(fr.getCodFarm())){
	    			parcTarget.setNameFarm(fr.getNomFarm());
	    		}
	    	}
	    }
	    
	    
	    //model.addAttribute("calibres", target);
	    model.addAttribute("parcTarget", parcTarget);
	    
	    return ApplicationConstants.RECEPPROD_PAGE_NAME;
	}
	
	@RequestMapping(value = {"/recepprod/calibres"}, method = RequestMethod.POST)
	public String getCalibres(HttpServletRequest request, Model model, 
			@RequestParam(value = "prod") String prod){
		
		System.out.println(prod);
		List<Produit> list = (List<Produit>) request.getSession().getAttribute("listP");
		
		Produit target = null;
		
	    if(list != null){
	    	for(Produit p : list){
		    	if(p.getCodProd().equalsIgnoreCase(prod)){
		    		target = p;
		    		break;
		    	}
		    }
	    }
	    
	    model.addAttribute("calibres", target);

		return ApplicationConstants.RECEPPROD_PAGE_NAME;
	}
	
}
