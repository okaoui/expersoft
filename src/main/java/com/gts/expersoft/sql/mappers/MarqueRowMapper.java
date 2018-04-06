package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Marque;

public class MarqueRowMapper implements RowMapper<Marque> {

	public Marque mapRow(ResultSet rs, int arg1) throws SQLException {
		Marque m = new Marque();
		m.setCodMarq(rs.getString("COD_MARQ"));
		m.setCodProd(rs.getString("COD_PROD"));
		m.setLibProd(rs.getString("LIB_PROD"));
		m.setLibMarq(rs.getString("LIB_MARQ"));
		m.setOrdre(rs.getInt("ORDRE"));
		return m;
	}

}
