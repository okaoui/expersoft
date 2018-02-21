package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Produit;

public class ProduitRowMapper implements RowMapper<Produit>{

	public Produit mapRow(ResultSet rs, int arg1) throws SQLException {
		Produit p = new Produit();
		p.setId(rs.getInt("id"));
		p.setCodProd(rs.getString("COD_PROD"));
		p.setLibProd(rs.getString("LIB_PROD"));
		p.setPnobe(rs.getString("PNOBE"));
		p.setNoBe(rs.getInt("NO_BE"));
		p.setNoBs(rs.getInt("NO_BS"));
		p.setPnobs(rs.getString("PNOBS"));
		p.setBic(rs.getDouble("BIC"));
		p.setCptAch(rs.getString("CPT_ACH"));
		p.setCptVte(rs.getString("CPT_VTE"));
		p.setCptBic(rs.getString("CPT_BIC"));
		p.setCodUom(rs.getString("COD_UOM"));
		p.setCodUom2(rs.getString("COD_UOM2"));
		p.setPuFarm(rs.getDouble("PU_FARM"));
		p.setPuFou(rs.getDouble("PU_FOU"));
		
		return p;
	}

}
