/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lopez.julz.aihr.helpers;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 *
 * @author Julio Lopez
 */
public class IDGenerator {
    public static String getCurrentTimestamp() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            return sdf.format(new Date());
        } catch (Exception e) {
            return null;
        }
    }
    
    public static Date parseTimestamp(String time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            return sdf.parse(time);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String addMinutes(String time, int minutes) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(time);
            Calendar cal = Calendar.getInstance();
            cal.setTime(d);
            cal.add(Calendar.MINUTE, minutes);
            return sdf.format(cal.getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String validateSqlTime(String time) {
        try {
            String splt[] = time.split(".");
//            if (splt[0] != null) {
//                return splt[0];
//            } else {
//                return null;
//            }
            return splt.length + "";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String parseDate(String time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            return sdf.format(sdf.parse(time));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String parseTime(String time) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            return sdf.format(sdf.parse(time));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String getSqlDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

            return sdf.format(new Date());
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String getDayDate() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd");

            return sdf.format(new Date());
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String getMonth() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMM");

            return sdf.format(new Date());
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String getYear() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy");

            return sdf.format(new Date());
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String getSqlTime() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

            return sdf.format(new Date());
        } catch (Exception e) {
            return null;
        }
    }
    
    public static String getCurrentDateDisplay() {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("EEE, yyyy/MM/dd hh:mm:ss a");

            return sdf.format(new Date());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String roundTwo(String doubleX) {
        try {
            Double num = Double.valueOf(doubleX);
            DecimalFormat df = new DecimalFormat("#,###,###.00");
            return df.format(num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String roundTwoNoComma(String doubleX) {
        try {
            Double num = Double.valueOf(doubleX);
            DecimalFormat df = new DecimalFormat("#######.00");
            return df.format(num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String roundTwoNoComma(Double doubleX) {
        try {
            DecimalFormat df = new DecimalFormat("#######.00");
            return df.format(doubleX);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static double roundTwoNoCommaDouble(Double doubleX) {
        try {
            DecimalFormat df = new DecimalFormat("#######.00");
            return Double.valueOf(df.format(doubleX));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public static String roundFourNoComma(String doubleX) {
        try {
            Double num = Double.valueOf(doubleX);
            DecimalFormat df = new DecimalFormat("#######.0000");
            return df.format(num);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static double roundFourNoComma(Double doubleX) {
        try {
            DecimalFormat df = new DecimalFormat("#######.0000");
            return Double.valueOf(df.format(doubleX));
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
    
    public static String getTotals(Double... values) {
        try {
            double total = 0;
            for (int i=0; i<values.length; i++) {
                total += values[i];
            }
            return roundTwoNoComma(total) + "";
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }
    
    public static String generateRandomString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 18) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }

    public static String getTimeInMillis() {
        try {
            return new Date().getTime() + "";
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static String generateIDandRandString() {
        return getTimeInMillis() + "-" + generateRandomString();
    }
    
    public static String validateNullNumbers(String regex) {
        if (regex != null) {
            return regex;
        } else {
            return "0";
        }
    }
    
    public static String[] getPreviousMonths(int numberOfMonths) {
        try {
            String[] months = new String[numberOfMonths];

            for (int i=0; i<months.length; i++) {
                Calendar c = Calendar.getInstance();
                c.setTime(new Date());
                c.add(Calendar.MONTH, -i);

                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

                months[i] =  sdf.format(c.getTime()) + "-01";
            }

            return months;
        } catch (Exception e) {
            return new String[]{};
        }
    }
    
    public static String formatReadableDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("MMM yyyy");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String formatSqlDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMM d, yyyy");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String formatSqlDateToboso(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MM dd, yy");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String formatSqlDateddMMyyyy(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String formatSqlDateMMMddyyyy(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("yyyy-MM-dd");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String formatORPrintDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("hh:mm:ss a MM/dd/yyyy");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
    
    public static String formatSlashedDate(String date) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date d = sdf.parse(date);
            sdf = new SimpleDateFormat("MM/dd/yyyy");
            return sdf.format(d);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
