package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gts.expersoft.models.Personel;
import com.gts.expersoft.sql.mappers.PersonnelRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class PersonnelRepositoryImpl implements PersonnelRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(PersonnelRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Personel p) {
		// TODO Auto-generated method stub

	}

	public List<Personel> list() {
		List<Personel> list = new ArrayList<Personel>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_PERSONNEL_LIST, new PersonnelRowMapper());

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
