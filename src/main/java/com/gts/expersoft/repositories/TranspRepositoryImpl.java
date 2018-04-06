package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.gts.expersoft.models.Transp;
import com.gts.expersoft.sql.mappers.TranspRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class TranspRepositoryImpl implements TranspRepository {
	private static Logger LOGGER = LoggerFactory.getLogger(TranspRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Transp trans) {
		// TODO Auto-generated method stub

	}

	public List<Transp> list() {
		List<Transp> list = new ArrayList<Transp>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_TRANSP_LIST, new TranspRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public void delete(String code) {
		// TODO Auto-generated method stub

	}

	public int getMaxId() {
		// TODO Auto-generated method stub
		return 0;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	

}
