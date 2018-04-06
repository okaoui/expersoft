package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Farmer;

public class FarmerRowMapper implements RowMapper<Farmer> {

	public Farmer mapRow(ResultSet rs, int arg1) throws SQLException {
		Farmer f = new Farmer();
		f.setAdr(rs.getString("ADR"));
		f.setCodFarm(rs.getString("COD_FARM"));
		f.setCodNat(rs.getString("COD_NAT"));
		f.setDatentre(rs.getString("DATENTRE"));
		f.setDnais(rs.getString("DNAIS"));
		f.setLnais(rs.getString("LNAIS"));
		f.setFax(rs.getString("FAX"));
		f.setTel(rs.getString("TEL"));
		f.setMail(rs.getString("MAIL"));
		f.setNomFarm(rs.getString("NOM_FARM"));
		
		return f;
	}

}
