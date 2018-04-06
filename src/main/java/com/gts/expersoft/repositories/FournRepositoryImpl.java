package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gts.expersoft.models.Fourn;
import com.gts.expersoft.sql.mappers.FournRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

@Repository
public class FournRepositoryImpl implements FournRepository {
	
	private static Logger LOGGER = LoggerFactory.getLogger(FournRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Fourn f) {
		// TODO Auto-generated method stub

	}

	public List<Fourn> list() {
		List<Fourn> list = new ArrayList<Fourn>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_FOURN_LIST, new FournRowMapper());

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
