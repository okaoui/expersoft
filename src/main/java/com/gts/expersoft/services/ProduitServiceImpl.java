package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Produit;
import com.gts.expersoft.models.Uom;
import com.gts.expersoft.repositories.ProduitRepositoryImpl;

public class ProduitServiceImpl implements ProduitService {

	@Autowired
	private ProduitRepositoryImpl produitRepository;
	public List<Produit> list() {
		
		return produitRepository.list();
	}

	public Produit get(int pid) {
		// TODO Auto-generated method stub
		return produitRepository.get(pid);
	}

	public List<Uom> listUom() {
		// TODO Auto-generated method stub
		return produitRepository.listUom();
	}

	public int getMaxProduitId() {
		// TODO Auto-generated method stub
		return produitRepository.getMaxProduitId();
	}

	public ProduitRepositoryImpl getProduitRepository() {
		return produitRepository;
	}

	public void setProduitRepository(ProduitRepositoryImpl produitRepository) {
		this.produitRepository = produitRepository;
	}

	public void create(Produit p) {
		produitRepository.create(p);
		
	}

	
	

}
