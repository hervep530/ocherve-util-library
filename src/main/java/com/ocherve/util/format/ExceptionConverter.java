/**
 * 
 */
package com.ocherve.util.format;

/**
 * @author herve_dev
 *
 */
public class ExceptionConverter {

	/**
	 * @param e
	 * @return stackTrace formated
	 */
	public static String getReadableStackTrace(Exception e) {
		String trace = e.getMessage() + "%n";
		for (int t = 0; t < e.getStackTrace().length; t++) {
			trace += "%n" + e.getStackTrace()[t].toString();
		}
		return String.format(trace);
	}
	
}
