package com.gts.expersoft.utils;

import org.springframework.jdbc.core.PreparedStatementCreator;

public class SQLQueryConstants {
	
	public static final String GET_USER_ID = "select id,nom,prenom from utilisateur where login=? and password=?";
	public static final String GET_PROFILE_ID = "select profile_id from utilisateur where id=?";
	public static final String GET_PROFILE_LIST = "SELECT * FROM xpersoft.profile";
	public static final String GET_PRODUIT_LIST = "SELECT * FROM xpersoft.produit";
	public static final String GET_PRODUIT_INFO = "SELECT * FROM xpersoft.produit where id = ?";
	public static final String GET_MAX_PRODUIT_ID = "select max(id) as id from xpersoft.produit";
	public static final String GET_UOM_LIST = "SELECT * FROM xpersoft.uom";
	public static final String INSERT_PRODUIT = "INSERT INTO xpersoft.produit(COD_PROD,LIB_PROD,PNOBE,NO_BE,NO_BS,PNOBS,"+
												"BIC,CPT_ACH,CPT_VTE,CPT_BIC,COD_UOM,COD_UOM2,PU_FARM,PU_FOU) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String GET_MAX_VARIETE_ID = "select max(id) as id from xpersoft.variete";
	public static final String GET_VARIETE_LIST = "SELECT * FROM xpersoft.variete";
	public static final String GET_PRODUCT_NAME = "SELECT LIB_PROD FROM xpersoft.produit where COD_PROD = ?";
	public static final String INSERT_VARIETE = "INSERT INTO xpersoft.variete (COD_VAR,LIB_PROD,LIB_VAR,COD_PROD,ABREGE,ORDRE,id) "+
												"VALUES (?,?,?,?,?,?,?)";
	public static final String DELETE_VARIETE = "delete from xpersoft.variete where id=?";
	public static final String GET_MAX_ZONE_ID = "select max(id) as id from xpersoft.zone";
	public static final String DELETE_ZONE = "delete from xpersoft.zone where id=?";
	public static final String GET_ZONE_LIST = "select * from xpersoft.zone";
	public static final String INSERT_ZONE = "INSERT INTO xpersoft.zone (COD_ZONE,LIB_ZONE,id) VALUES (?,?,?)";
	public static final String INSERT_REGION = "INSERT INTO xpersoft.region (id,cod_region,lib_region,lati_gps,long_gps) VALUES (?,?,?,?,?)";
	public static final String GET_REGION_LIST = "select * from xpersoft.region";
	public static final String DELETE_REGION = "delete from xpersoft.region where id=?";
	public static final String GET_MAX_REGION_ID = "select max(id) as id from xpersoft.region";
	public static String REGISTER_LOGIN = "INSERT INTO xpersoft.login (login_date, utilisateur_id) VALUES (?, ?)";
	public static String GET_MENU_LIST = "select m.id, m.nom, m.menu_id, m.level from xpersoft.menus m"+ 
	" inner join xpersoft.profile_has_menus p on m.id = p.menus_id and p.profile_id = ? and m.level=0";
	public static String GET_SOUSMENU_LIST = "SELECT m.id, m.nom, m.menu_id, m.level FROM xpersoft.menus m "
			+ " inner join xpersoft.profile_has_menus p on m.menu_id = p.menus_id where p.profile_id = ? and m.menu_id = ? and m.level=?";
	public static String GET_LAST_LOGIN = "select max(login_date) as login_date from xpersoft.login where utilisateur_id = ?";
	public static String GET_MAX_PROFILE_ID = "select max(id) as id from xpersoft.profile";
	public static String INSERT_NEW_PROFILE = "INSERT INTO xpersoft.profile (code, nom) VALUES (?, ?)";
	public static String INSERT_PROFILE_MENU = "INSERT INTO xpersoft.profile_has_menus (profile_id, menus_id) "
			+ "VALUES (?, ?)";
	public static String GET_PROFILE_NAME = "SELECT nom from xpersoft.profile where id = ?";
	public static String GET_PROFILE_MENUS = "select p.id as pid, p.nom, m.id as mid , m.nom, m.menu_id, m.level "
			+ "from xpersoft.menus m inner join xpersoft.profile_has_menus pm "
			+ "on m.id = pm.menus_id inner join xpersoft.profile p "
			+ "on pm.profile_id = p.id "
			+ "where p.id = ?";
	public static String GET_MENUS_NOT_IN_PROFILE = "select id, nom, menu_id, level from xpersoft.menus where id not in "
			+ "(select menus_id from xpersoft.profile_has_menus where profile_id = ?)";
	
}
