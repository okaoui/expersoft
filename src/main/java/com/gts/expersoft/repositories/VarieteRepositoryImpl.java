package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gts.expersoft.models.VarieteId;
import com.gts.expersoft.sql.mappers.VarieteRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class VarieteRepositoryImpl implements VarieteRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(VarieteRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ProduitRepository produitRepository;
	
	public void create(VarieteId v) {
		int maxId = getMaxId();
		String prodLib = produitRepository.getProductNameByCode(v.getCodProd());
		String codVar = "VA00".concat(String.valueOf(maxId + 1));
		jdbcTemplate.update(
			    SQLQueryConstants.INSERT_VARIETE,
			    codVar,prodLib,v.getLibVar(),v.getCodProd(),v.getAbrege(),v.getOrdre(),maxId+1);
		
	}

	public List<VarieteId> list() {
		List<VarieteId> list = new ArrayList<VarieteId>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_VARIETE_LIST, new VarieteRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public int getMaxId() {
		int id = 0;
		try{
			id = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_MAX_VARIETE_ID, Integer.class);
		}catch(Exception e){
			return id;
		}
	
		return id;	
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
	  VarieteRepositoryImpl vri = (VarieteRepositoryImpl) appContext.getBean("varieteRepository");

      
      //System.out.println(pri.getMaxProfileId());
      
      //uri.registerLogin(1);
      
     
      List<VarieteId> list = vri.list();
      System.out.println(list.size());
      //System.out.println(uri.getUserInfo("admin", "123").getLogins().get(0).getLoginDate());
      
      appContext.close();
      
	}

	public void delete(int vid) {
		getJdbcTemplate().update(SQLQueryConstants.DELETE_VARIETE, vid);
	}



}
