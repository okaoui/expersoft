package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Farmsurf;

public class FarmerSurfRowMapper implements RowMapper<Farmsurf> {

	public Farmsurf mapRow(ResultSet rs, int arg1) throws SQLException {
		Farmsurf fs = new Farmsurf();
		fs.setCodFarm(rs.getString("COD_FARM"));
		fs.setCodParcel(rs.getString("COD_PARCEL"));
		fs.setCodProd(rs.getString("COD_PROD"));
		fs.setCodVar(rs.getString("COD_VAR"));
		fs.setCodVil(rs.getString("COD_VIL"));
		fs.setQteBp(rs.getString("QTE_BP"));
		fs.setQteBr(rs.getString("QTE_BR"));
		fs.setQteFp(rs.getString("QTE_FP"));
		fs.setQteFr(rs.getString("QTE_FR"));
		
		return fs;
	}

}
