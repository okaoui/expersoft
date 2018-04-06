package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.Nation;
import com.gts.expersoft.models.Village;


public interface ProducteurRepository {

	void create(Farmer f, List<Farmsurf> fs);
	List<Farmer> list();
	int getCount();
	void delete(String codFarm);
	List<Nation> listNation();
	List<Village> listVillage();
	List<Farmsurf> listParcelle();
}
