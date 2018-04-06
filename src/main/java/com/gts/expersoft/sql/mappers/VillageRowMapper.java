package com.gts.expersoft.sql.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.gts.expersoft.models.Village;

public class VillageRowMapper implements RowMapper<Village> {

	public Village mapRow(ResultSet rs, int arg1) throws SQLException {
		
		Village v = new Village();
		
		v.setCodVil(rs.getString("COD_VIL"));
		v.setLibVil(rs.getString("LIB_VIL"));
		v.setLibSpref(rs.getString("LIB_SPREF"));
		
		return v;
	}
	

}
