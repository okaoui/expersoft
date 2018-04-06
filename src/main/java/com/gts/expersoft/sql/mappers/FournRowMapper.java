package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Fourn;

public class FournRowMapper implements RowMapper<Fourn> {

	public Fourn mapRow(ResultSet rs, int arg1) throws SQLException {
		Fourn f = new Fourn();
		f.setCodFou(rs.getString("COD_FOU"));
		f.setCptFou(rs.getString("CPT_FOU"));
		f.setRaisonFou(rs.getString("RAISON_FOU"));
		return f;
	}

}
