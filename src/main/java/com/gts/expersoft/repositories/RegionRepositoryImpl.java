package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.gts.expersoft.models.Region;
import com.gts.expersoft.sql.mappers.RegionRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class RegionRepositoryImpl implements RegionRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(RegionRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(Region reg) {
		int maxId = getMaxId();
		String codReg = "RG00".concat(String.valueOf(maxId + 1));
		jdbcTemplate.update(SQLQueryConstants.INSERT_REGION,maxId+1,codReg,reg.getLibRegion(),
				reg.getLatiGps(),reg.getLongGps());
	}

	public List<Region> list() {
		List<Region> list = new ArrayList<Region>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_REGION_LIST, new RegionRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public void delete(int rid) {
		getJdbcTemplate().update(SQLQueryConstants.DELETE_REGION, rid);
	}

	public int getMaxId() {
		int id = 0;
		try{
			id = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_MAX_REGION_ID, Integer.class);
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

	
}
