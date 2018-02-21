package com.gts.expersoft.utils;


import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by oussamakaoui on 11/12/17.
 */

public class FormattingUtilitiy {

    private static final String CLASSNAME = FormattingUtilitiy.class.getName();
    
    public static String longFormattedDate(long milis, String pattern){
        Date date=new Date(milis);
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String dateText = sdf.format(date);

        return dateText;
    }

    public static Date stringFormattedDate(String date, String pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        Date utilDate = null;
        try {
            utilDate = sdf.parse(date);
        } catch (ParseException e) {
            System.err.println("Invalid date!");
        }

        return utilDate;
    }

    public static String getFormattedNumber(double number){
        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat)nf;
        df.applyPattern("###,###.##");
        return  df.format(number);
    }

    public static double getRawNumber(String number){

        NumberFormat nf = NumberFormat.getNumberInstance(Locale.US);
        DecimalFormat df = (DecimalFormat)nf;
        df.applyPattern("###,###.##");
        if(number.contains(",")){
            df.applyPattern("###,###.##");
        }else{
            return Double.valueOf(number);
        }

        try {
            return  df.parse(number).doubleValue();
        } catch (ParseException e) {
            e.printStackTrace();
            return 0.0;
        }
    }




}
