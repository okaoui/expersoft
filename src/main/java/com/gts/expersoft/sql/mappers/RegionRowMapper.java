package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Region;

public class RegionRowMapper implements RowMapper<Region> {

	public Region mapRow(ResultSet rs, int arg1) throws SQLException {
		Region reg = new Region();
		reg.setId(rs.getInt("id"));
		reg.setCodRegion(rs.getString("cod_region"));
		reg.setLibRegion(rs.getString("lib_region"));
		reg.setLatiGps(rs.getDouble("lati_gps"));
		reg.setLongGps(rs.getDouble("long_gps"));
		
		return reg;
	}

}
