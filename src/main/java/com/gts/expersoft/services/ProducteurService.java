package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.Nation;
import com.gts.expersoft.models.Village;


public interface ProducteurService {

	List<Farmer> list();
	Farmer get(String codFarm);
	void create(Farmer f, List<Farmsurf> fs);
	List<Nation> listNation();
	List<Village> listVillage();
	void delete(String code);
	List<Farmsurf> listParcelle();
}
