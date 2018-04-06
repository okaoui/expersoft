package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Calibre;

public class CalibreRowMapper implements RowMapper<Calibre> {

	public Calibre mapRow(ResultSet rs, int arg1) throws SQLException {
		Calibre c = new Calibre();
		
		c.setLibCali(rs.getString("LIB_CALI"));
		c.setCodCali(rs.getString("COD_CALI"));
		return c;
	}

}
