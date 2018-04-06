package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Personel;

public class PersonnelRowMapper implements RowMapper<Personel> {

	public Personel mapRow(ResultSet rs, int arg1) throws SQLException {
		Personel p = new Personel();
		p.setMatPers(rs.getString("MAT_PERS"));
		p.setNomPers(rs.getString("NOM_PERS"));
		p.setLibDep(rs.getString("LIB_DEP"));
		
		return p;
	}

}
