package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gts.expersoft.models.Equipe;
import com.gts.expersoft.sql.mappers.EquipeRowMapper;
import com.gts.expersoft.sql.mappers.PersonnelRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class EquipeRepositoryImpl implements EquipeRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(EquipeRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Equipe e) {
		
	}

	public List<Equipe> list() {
		List<Equipe> list = new ArrayList<Equipe>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_EQUIPE_LIST, new EquipeRowMapper());

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
