package com.gts.expersoft.repositories;

import java.util.ArrayList;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import com.gts.expersoft.models.ZoneId;
import com.gts.expersoft.sql.mappers.ZoneRowMapper;
import com.gts.expersoft.utils.SQLQueryConstants;

public class ZoneRepositoryImpl implements ZoneRepository {

	private static Logger LOGGER = LoggerFactory.getLogger(ZoneRepositoryImpl.class);

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void create(ZoneId z) {
		int maxId = getMaxId();
		String codZone = "ZO00".concat(String.valueOf(maxId + 1));
		jdbcTemplate.update(
			    SQLQueryConstants.INSERT_ZONE, codZone,z.getLibZone(),maxId+1);
	}

	public List<ZoneId> list() {
		List<ZoneId> list = new ArrayList<ZoneId>();

		try{
			list = getJdbcTemplate().query(SQLQueryConstants.GET_ZONE_LIST, new ZoneRowMapper());

		}catch(Exception e){
			LOGGER.debug(e.getMessage());
		}
		return list;
	}

	public void delete(int zid) {
		getJdbcTemplate().update(SQLQueryConstants.DELETE_ZONE, zid);
	}

	public int getMaxId() {
		int id = 0;
		try{
			id = getJdbcTemplate().queryForObject(
					SQLQueryConstants.GET_MAX_ZONE_ID, Integer.class);
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
