package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Uom;

public class UomRowMapper implements RowMapper<Uom>{

	public Uom mapRow(ResultSet rs, int arg1) throws SQLException {
		Uom u = new Uom();
		u.setId(rs.getInt("id"));
		u.setCodUom(rs.getString("cod_uom"));
		u.setLibUom(rs.getString("lib_uom"));
		u.setQtePackin(rs.getDouble("qte_packin"));
		
		return u;
	}

}
