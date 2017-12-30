package com.gts.expersoft.utils;

public class SQLQueryConstants {
	
	public static final String FIND_USER_BY_USERNAME_AND_PASSWORD_QUERY = "select username,password,non_tech, first_name, last_name from users where username=?";
	public static final String FIND_USER_BY_FULLNAME = "select username,password,non_tech, first_name, last_name from users where first_name=? and last_name=?";
	public static final String INSERT_USER_RECORD = "INSERT INTO users " +
			"(username, password, non_tech, first_name, last_name, email, mobile, gender, occupation, birthday) VALUES (?,?,?,?,?,?,?,?,?,?)";

}
