package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import com.gts.expersoft.models.Produit;
import com.gts.expersoft.models.Uom;
import com.gts.expersoft.sql.mappers.ProduitRowMapper;
import com.gts.expersoft.sql.mappers.UomRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class ProduitRepositoryImpl implements ProduitRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(UserRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Produit> list() {
		
		List<Produit> list = new ArrayList<Produit>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_PRODUIT_LIST, new ProduitRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public Produit get(int pid) {
		Produit p = null;
		try{
			p = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_PRODUIT_INFO, new Object[] {pid}, 
					new ProduitRowMapper());
			
			
		}catch(EmptyResultDataAccessException e){
			return p;
		}
	
		return p;	
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}


	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public List<Uom> listUom() {
		List<Uom> list = new ArrayList<Uom>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_UOM_LIST, new UomRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public int getMaxProduitId() {
		int id = 0;
		try{
			id = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_MAX_PRODUIT_ID, Integer.class);
		}catch(Exception e){
			return id;
		}
	
		return id;	
	}
	
	public void create(Produit p) {
		String codProd = "PR00".concat(String.valueOf(getMaxProduitId()+1));
		jdbcTemplate.update(
			    SQLQueryConstants.INSERT_PRODUIT,
			    codProd,p.getLibProd(),p.getPnobe(),p.getNoBe(),p.getNoBs(),p.getPnobs(),p.getBic(),p.getCptAch(),
			    p.getCptVte(),p.getCptBic(),p.getCodUom(),p.getCodUom2(),p.getPuFarm(),p.getPuFou());
	}
	
	public static void main(String[] args){
		AbstractApplicationContext appContext =
		    	  new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
	  ProduitRepositoryImpl pri = (ProduitRepositoryImpl) appContext.getBean("produitRepository");

      
      //System.out.println(pri.getMaxProfileId());
      
      //uri.registerLogin(1);
      
     
      List<Uom> list = pri.listUom();
      for(Uom m : list){
    	  System.out.println(m.toString());
      }
      //System.out.println(uri.getUserInfo("admin", "123").getLogins().get(0).getLoginDate());
      
      appContext.close();
      
	}

	public String getProductNameByCode(String code) {
		String pName = (String) jdbcTemplate.queryForObject(
	            SQLQueryConstants.GET_PRODUCT_NAME, new Object[] { code }, String.class);
		return pName;
	}

	


}
