/**
 * 
 */
package com.tool.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 * @version 1.0
 * @Since 2017年8月27日 下午5:49:56
 */
public class DateUtil {

	public static Date getDate(String date, String formate) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(formate);
		return sdf.parse(date);
	}
}
