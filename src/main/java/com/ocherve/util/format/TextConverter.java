/**
 * 
 */
package com.ocherve.util.format;

import java.text.Normalizer;

/**
 * @author herve_dev
 *
 */
public class TextConverter {

	/**
	 * @param text
	 * @return camel String
	 */
	public static String getCamel(String text) {
		String[] splitText = text.toLowerCase().replaceAll("[\\W]{1,}", "_").split("_");
		String camel = splitText[0];
		for (int i = 1 ; i < splitText.length; i++) {
			camel += splitText[i].substring(0, 1).toUpperCase() + splitText[i].substring(1);
		} 
		return camel;
	}
	
	/**
	 * Convert text to text formated as slug (only word characters and _ as separator)
	 * 
	 * @param text
	 * @return slug
	 */
	public static String convertToSlug(String text) {
		String slug = Normalizer.normalize(text, Normalizer.Form.NFD).replaceAll("[\u0300-\u036F]", "");
		slug = slug.replaceAll("\\W", "_").replaceAll("_{1,}","_").toLowerCase();
		return slug;
	}

}
