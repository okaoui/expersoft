package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Profile;

public class ProfileRowMapper implements RowMapper<Profile> {

	public Profile mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Profile p = new Profile();
		p.setId(rs.getInt("id"));
		p.setCode(rs.getString("code"));
		p.setNom(rs.getString("nom"));
		
		return p;
	}

}
