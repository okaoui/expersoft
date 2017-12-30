package com.gts.expersoft.utils;

import java.math.BigInteger;
import java.security.SecureRandom;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelperClass {

	public static String convertJavaDateToStringFormat(Date date, String pattern){
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String sDate = sdf.format(date);
		
		return sDate;
	}
	
	public static Date convertStringToJavaDate(String sdate, String pattern) throws ParseException{
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date jdate = format.parse(sdate);
		
		return jdate;
	}
	
	public static String capitalizeFirstLetter(String text){
		return text.substring(0, 1).toUpperCase() + text.substring(1).toLowerCase();
	}
	
	public static String generatePassword(){
		SecureRandom random = new SecureRandom();
		String password = new BigInteger(130, random).toString(32);
		
		return password;
	}
	
	public static String makeUsername(String firstname, String lastname){
		return firstname.concat(lastname);
	}
}
