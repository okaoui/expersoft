package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gts.expersoft.models.Marque;
import com.gts.expersoft.sql.mappers.FournRowMapper;
import com.gts.expersoft.sql.mappers.MarqueRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class MarqueRepositoryImpl implements MarqueRepository{

	private static Logger LOGGER = LoggerFactory.getLogger(MarqueRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Marque m) {
		// TODO Auto-generated method stub
		
	}

	public List<Marque> list() {
		List<Marque> list = new ArrayList<Marque>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_MARQUE_LIST, new MarqueRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public int getCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void delete(String code) {
		// TODO Auto-generated method stub
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	
	
	

}
