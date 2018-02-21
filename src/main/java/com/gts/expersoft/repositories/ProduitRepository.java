package com.gts.expersoft.repositories;

import java.util.List;

import com.gts.expersoft.models.Produit;
import com.gts.expersoft.models.Uom;

public interface ProduitRepository {

	List<Produit> list();
	Produit get(int pid);
	List<Uom> listUom();
	int getMaxProduitId();
	void create(Produit p);
	String getProductNameByCode(String code);
	
}
