package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.gts.expersoft.models.Station;
import com.gts.expersoft.sql.mappers.StationRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class StationRepositoryImpl implements StationRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(StationRepositoryImpl.class);

	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Station stat) {
		// TODO Auto-generated method stub

	}

	public List<Station> list() {
		List<Station> list = new ArrayList<Station>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_STATION_LIST, new StationRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public void delete(int sid) {
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
