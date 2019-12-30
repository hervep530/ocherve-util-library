/**
 * 
 */
package com.ocherve.util.format;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;

/**
 * @author herve_dev
 *
 */
public class DateConverter {
	

	/**
	 * Getting setence showing elapsed time as String
	 * 
	 * @param timestamp
	 * @return elapsedTime
	 */
	public static String getElapsedTime(Timestamp timestamp) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Getting elapsed time as Date
	 * 
	 * @param date
	 * @return elapsedTime
	 */
	public static String getElapsedTime(Date date) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * Converting Date only  value
	 * 
	 * @param dateFormat
	 * @param dateStr
	 * @return sql Date
	 */
	public static Date stringToSqlDate(String dateFormat, String dateStr) {
		// java util Date variable and simple Format 
        java.util.Date utilDate = null;
        DateFormat inputFormat = new SimpleDateFormat(dateFormat);
        inputFormat.setLenient(false);
        // Conversion
        try {
        	utilDate = inputFormat.parse(dateStr);
        } catch (Exception e) { 
        	return null;
        }
        return utilDateToSqlDate(utilDate);
	}
	
	/**
	 * Converting java.util.Date to java.sql.Date
	 * 
	 * @param utilDate
	 * @return sqlDate
	 */
	public static Date utilDateToSqlDate(java.util.Date utilDate) {
        DateFormat sqlDateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date sqlDate = null;
		try {
			String strDate = sqlDateFormat.format(utilDate);
			sqlDate = Date.valueOf(strDate);
		} catch (Exception ignore) { }
		return sqlDate;
	}
	
	/**
	 * Converting java.util.Date to string with using custom format
	 * 
	 * @param utilDate
	 * @param format
	 * @return date as string with custom format
	 */
	public static String utilDateToString(java.util.Date utilDate, String format) {
        DateFormat customFormat = new SimpleDateFormat(format);
        String strDate = "";
		try {
			strDate = customFormat.format(utilDate);
		} catch (Exception ignore) { }
		return strDate;
	}
	
	/**
	 * Converting sqlDate to String with custom format
	 * 
	 * @param sqlDate
	 * @param format
	 * @return date as String with custom format
	 */
	public static String sqlDateToString(Date sqlDate, String format) {
        DateFormat inFormat = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date utilDate = null;
		try {
			utilDate = inFormat.parse(sqlDate.toString());			
		} catch (Exception ignore) { return ""; }
		return utilDateToString(utilDate, format);
	}
	
	/**
	 * Getting now as util date
	 * 
	 * @return now in util date format
	 */
	public static java.util.Date utilNow() {
		return java.util.Date.from(Instant.now());
	}
	
	/**
	 * Getting now as sql date
	 * 
	 * @return now in sql date format
	 */
	public static Date sqlNow() {
		return utilDateToSqlDate(java.util.Date.from(Instant.now()));
	}


}
