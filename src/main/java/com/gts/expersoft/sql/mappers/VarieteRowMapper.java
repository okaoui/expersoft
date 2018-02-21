package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.VarieteId;

public class VarieteRowMapper implements RowMapper<VarieteId> {

	public VarieteId mapRow(ResultSet rs, int arg1) throws SQLException {
		
		VarieteId v = new VarieteId();
		v.setAbrege(rs.getString("ABREGE"));
		v.setCodVar(rs.getString("COD_VAR"));
		v.setCodProd(rs.getString("COD_PROD"));
		v.setLibProd(rs.getString("LIB_PROD"));
		v.setOrdre(rs.getInt("ORDRE"));
		v.setId(rs.getInt("id"));
		v.setLibVar(rs.getString("LIB_VAR"));
		
		return v;
	}

}
