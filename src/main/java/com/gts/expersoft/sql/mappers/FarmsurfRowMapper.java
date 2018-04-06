package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Farmsurf;

public class FarmsurfRowMapper implements RowMapper<Farmsurf> {

	public Farmsurf mapRow(ResultSet rs, int arg1) throws SQLException {
		Farmsurf fs = new Farmsurf();
		fs.setCodFarm(rs.getString("COD_FARM"));
		fs.setCodParcel(rs.getString("COD_PARCEL"));
		fs.setCodProd(rs.getString("COD_PROD"));
		fs.setCodVar(rs.getString("COD_VAR"));
		fs.setCodVil(rs.getString("COD_VIL"));
		fs.setDatparc(rs.getString("DATPARC"));
		fs.setLibProd(rs.getString("LIB_PROD"));
		fs.setLibVar(rs.getString("LIB_VAR"));
		fs.setLibVil(rs.getString("LIB_VIL"));
		fs.setNameFarm(rs.getString("NOM_FARM"));
		fs.setNum(rs.getString("NUM"));
		return fs;
	}

}
