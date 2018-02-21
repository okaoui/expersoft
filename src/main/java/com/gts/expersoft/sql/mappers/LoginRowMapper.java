package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Login;

public class LoginRowMapper implements RowMapper<Login>{

	public Login mapRow(ResultSet rs, int arg1) throws SQLException {
		Login l = new Login();
		l.setLoginDate(rs.getDate("login_date"));
		return l;
	}

}
