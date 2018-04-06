package com.gts.expersoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.gts.expersoft.services.StationService;

@Controller
@SessionAttributes({"listSta"})
public class StationController {

	@Autowired
	private StationService stationService;
	
	
	
}
