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
	public static final String GET_FARMER_COUNT = "select count(COD_FARM) from xpersoft.farmer";
	public static final String INSERT_FARMER = "INSERT INTO xpersoft.farmer(COD_FARM,"
			+ "NOM_FARM,ADR,TEL,FAX,COD_NAT,DNAIS,LNAIS,DATENTRE,SEXE,NOPIECE,MAIL) VALUES(?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String INSERT_FARMSURF = "INSERT INTO xpersoft.farmsurf (COD_PARCEL,LIB_PROD,LIB_VAR,"
			+ "QTE_BP,QTE_FP,QTE_BR,QTE_FR,COD_VIL,COD_FARM,COD_PROD,COD_VAR) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
	public static final String GET_NATION_LIST = "select * from nation";
	public static final String GET_VILLAGE_LIST = "select * from village";
	public static final String GET_FARMER_LIST = "select * from farmer";
	public static final String GET_FARMERSURF_LIST = "select * from farmsurf where COD_FARM = ?";
	public static final String DELETE_FARMER = "delete from farmer where COD_FARM = ?";
	public static final String DELETE_FARMSURF = "delete from farmsurf where COD_FARM = ?";
	public static final String GET_STATION_LIST = "select * from station";
	public static final String GET_TRANSP_LIST = "select * from transp";
	public static final String GET_PERSONNEL_LIST = "select MAT_PERS,NOM_PERS,LIB_DEP from personel";
	public static final String GET_EQUIPE_LIST = "select * from equipe";
	public static final String GET_PARCEL_LIST = "select fs.COD_FARM,COD_PARCEL,COD_PROD,"
			+ "COD_VAR,COD_VIL,DATPARC,NUM,LIB_PROD,LIB_VAR,LIB_VIL,NOM_FARM from farmsurf fs "
			+ "inner join farmer f on fs.COD_FARM=f.COD_FARM";
	public static final String GET_FOURN_LIST = "select COD_FOU,CPT_FOU,RAISON_FOU from fourn";
	public static final String GET_MARQUE_LIST = "select * from marque";
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
	public static String GET_CALIBRE_LIST = "select COD_CALI, LIB_CALI from calibre where COD_PROD = ?";
	
}
