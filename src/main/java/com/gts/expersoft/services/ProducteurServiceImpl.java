package com.gts.expersoft.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.Nation;
import com.gts.expersoft.models.Village;
import com.gts.expersoft.repositories.ProducteurRepository;

public class ProducteurServiceImpl implements ProducteurService {

	@Autowired
	private ProducteurRepository producteurRepository;
	
	public List<Farmer> list() {
		// TODO Auto-generated method stub
		return producteurRepository.list();
	}

	public Farmer get(String codFarm) {
		// TODO Auto-generated method stub
		return null;
	}

	public void create(Farmer f, List<Farmsurf> fs) {
		producteurRepository.create(f, fs);

	}

	public List<Nation> listNation() {
		
		return producteurRepository.listNation();
	}

	public List<Village> listVillage() {
		// TODO Auto-generated method stub
		return producteurRepository.listVillage();
	}
	
	public ProducteurRepository getProducteurRepository() {
		return producteurRepository;
	}

	public void setProducteurRepository(ProducteurRepository producteurRepository) {
		this.producteurRepository = producteurRepository;
	}

	public void delete(String code) {
		producteurRepository.delete(code);
		
	}

	public List<Farmsurf> listParcelle() {
		
		return producteurRepository.listParcelle();
	}

	
	
	

}
