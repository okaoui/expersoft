package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Equipe;

public class EquipeRowMapper implements RowMapper<Equipe> {

	public Equipe mapRow(ResultSet rs, int arg1) throws SQLException {
		Equipe e = new Equipe();
		e.setCodEquip(rs.getString("COD_EQUIP"));
		e.setLibEquip(rs.getString("LIB_EQUIP"));
		e.setMatPers(rs.getString("MAT_PERS"));
		e.setNomPers(rs.getString("NOM_PERS"));
		
		return e;
	}

}
