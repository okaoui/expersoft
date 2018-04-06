package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gts.expersoft.models.Farmer;
import com.gts.expersoft.models.Farmsurf;
import com.gts.expersoft.models.Nation;
import com.gts.expersoft.models.Region;
import com.gts.expersoft.models.Uom;
import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.models.Village;
import com.gts.expersoft.sql.mappers.FarmerRowMapper;
import com.gts.expersoft.sql.mappers.FarmerSurfRowMapper;
import com.gts.expersoft.sql.mappers.FarmsurfRowMapper;
import com.gts.expersoft.sql.mappers.NationRowMapper;
import com.gts.expersoft.sql.mappers.RegionRowMapper;
import com.gts.expersoft.sql.mappers.VarieteRowMapper;
import com.gts.expersoft.sql.mappers.VillageRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class ProducteurRepositoryImpl implements ProducteurRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(ProducteurRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	public void create(Farmer f, List<Farmsurf> fs) {
		int count = getCount();
		String codFarm = "A00000000".concat(String.valueOf(count + 1));
		jdbcTemplate.update(
			    SQLQueryConstants.INSERT_FARMER,
			    codFarm,f.getNomFarm(),f.getAdr(),f.getTel(),f.getFax(),f.getCodNat(),f.getDnais(),
			    f.getLnais(),f.getDatentre(),f.getSexe(),f.getNopiece(),f.getMail());
		
		for(Farmsurf fa : fs){
			jdbcTemplate.update(
				    SQLQueryConstants.INSERT_FARMSURF,
				    fa.getCodParcel(),fa.getLibProd(),fa.getLibVar(),fa.getQteBp(),fa.getQteFp(),fa.getQteBr(),fa.getQteFr(),
				    fa.getCodVil(),codFarm,fa.getCodProd(),fa.getCodVar());
		}

	}

	public List<Farmer> list() {
		List<Farmer> list = new ArrayList<Farmer>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_FARMER_LIST, new FarmerRowMapper());
			
			if(list != null && !list.isEmpty()){
				for(Farmer f : list){
					List<Farmsurf> listFS = getJdbcTemplate().query(SQLQueryConstants.GET_FARMERSURF_LIST,
							new FarmerSurfRowMapper(),f.getCodFarm());
					
					f.setList(listFS);
				}
			}

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public int getCount() {
		int count = 0;
		try{
			count = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_FARMER_COUNT, Integer.class);
		}catch(Exception e){
			return count;
		}
	
		return count;	
	}

	public void delete(String codFarm) {
		getJdbcTemplate().update(SQLQueryConstants.DELETE_FARMER, codFarm);
		getJdbcTemplate().update(SQLQueryConstants.DELETE_FARMSURF, codFarm);

	}
	
	public List<Nation> listNation() {
		List<Nation> list = new ArrayList<Nation>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_NATION_LIST, new NationRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}
	
	public List<Village> listVillage() {
		List<Village> list = new ArrayList<Village>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_VILLAGE_LIST, new VillageRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	public static void main(String[] args){
		AbstractApplicationContext appContext =
		    	  new FileSystemXmlApplicationContext("src/main/webapp/WEB-INF/spring-config.xml");
	  ProducteurRepositoryImpl pri = (ProducteurRepositoryImpl) appContext.getBean("producteurRepository");

      
      //System.out.println(pri.getMaxProfileId());
      
      //uri.registerLogin(1);
      
     
      List<Farmsurf> list = pri.listParcelle();
      
      for(Farmsurf f : list){
    	  System.out.println(f.getCodFarm());
    	  
      }
      //System.out.println(uri.getUserInfo("admin", "123").getLogins().get(0).getLoginDate());
      
      appContext.close();
      
	}

	public List<Farmsurf> listParcelle() {
		List<Farmsurf> list = new ArrayList<Farmsurf>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_PARCEL_LIST, new FarmsurfRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}
	
	

}
