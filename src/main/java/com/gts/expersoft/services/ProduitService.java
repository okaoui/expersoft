package com.gts.expersoft.services;

import java.util.List;

import com.gts.expersoft.models.Produit;
import com.gts.expersoft.models.Uom;

public interface ProduitService {

	List<Produit> list();
	Produit get(int pid);
	List<Uom> listUom();
	int getMaxProduitId();
	void create(Produit p);
}
