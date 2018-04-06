package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Station;

public class StationRowMapper implements RowMapper<Station> {

	public Station mapRow(ResultSet rs, int arg1) throws SQLException {
		Station s = new Station();
		s.setCodStat(rs.getString("COD_STAT"));
		s.setCodVil(rs.getString("COD_VIL"));
		s.setLatiGps(rs.getDouble("LATI_GPS"));
		s.setLibStat(rs.getString("LIB_STAT"));
		s.setLibVil(rs.getString("LIB_VIL"));
		s.setLongGps(rs.getDouble("LONG_GPS"));
		return s;
	}

}
