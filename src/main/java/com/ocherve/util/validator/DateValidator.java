/**
 * 
 */
package com.ocherve.util.validator;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.ocherve.util.format.ExceptionConverter;


/**
 * @author herve_dev
 *
 */
public class DateValidator {
	 
    /**
     * @param dateFormat
     * @param dateStr
     * @return true if dateStr string is a valid date
     */
    public static boolean isValid(String dateFormat, String dateStr) {
        DateFormat sdf = new SimpleDateFormat(dateFormat);
        sdf.setLenient(false);
        try {
            sdf.parse(dateStr);
        } catch (ParseException e) {
        	System.out.println(ExceptionConverter.getReadableStackTrace(e));
            return false;
        }
        return true;
    }

}
