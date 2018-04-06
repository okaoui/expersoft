package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Transp;

public class TranspRowMapper implements RowMapper<Transp> {

	public Transp mapRow(ResultSet rs, int arg1) throws SQLException {
		Transp tr = new Transp();
		tr.setCodTrans(rs.getString("COD_TRANS"));
		tr.setLibTrans(rs.getString("LIB_TRANS"));
		return tr;
	}

}
