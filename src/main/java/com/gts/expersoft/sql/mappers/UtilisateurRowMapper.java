package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Utilisateur;

public class UtilisateurRowMapper implements RowMapper<Utilisateur>{

	public Utilisateur mapRow(ResultSet rs, int arg1) throws SQLException {
		Utilisateur u = new Utilisateur();
		u.setId(rs.getInt("id"));
		u.setNom(rs.getString("nom"));
		u.setPrenom(rs.getString("prenom"));
		return u;
	}
	
	

}
