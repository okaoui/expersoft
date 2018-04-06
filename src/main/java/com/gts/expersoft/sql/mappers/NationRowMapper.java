package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Nation;

public class NationRowMapper implements RowMapper<Nation> {

	public Nation mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Nation n = new Nation();
		n.setCodNat(rs.getString("COD_NAT"));
		n.setLibNat(rs.getString("LIB_NAT"));
		n.setId(rs.getInt("ID"));
		return n;
	}

}
