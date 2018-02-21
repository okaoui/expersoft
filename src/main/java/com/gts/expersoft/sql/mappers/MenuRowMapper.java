package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import com.gts.expersoft.models.Menus;


public class MenuRowMapper implements RowMapper<Menus> {

	public Menus mapRow(ResultSet rs, int rowNum) throws SQLException {
		Menus m = new Menus();
		m.setId(rs.getInt("id"));
		m.setNom(rs.getString("nom"));
		m.setMenuId(rs.getInt("menu_id"));
		m.setLevel(rs.getInt("level"));
		
		return m;
	}

}
