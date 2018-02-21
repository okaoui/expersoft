package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.ZoneId;

public class ZoneRowMapper implements RowMapper<ZoneId> {

	public ZoneId mapRow(ResultSet rs, int arg1) throws SQLException {
		ZoneId z = new ZoneId();
		
		z.setId(rs.getInt("id"));
		z.setCodZone(rs.getString("COD_ZONE"));
		z.setLibZone(rs.getString("LIB_ZONE"));
		
		return z;
	}

}
