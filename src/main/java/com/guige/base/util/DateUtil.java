package com.guige.base.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

/**
 * 日期操作工具类
 * 
 * @author wh
 *
 */
public class DateUtil {

	public static final String DATE_TIME_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";
	public static final String HOUR_PATTERN = "yyyy-MM-dd HH:mm:ss";
	public static final String DATE_PATTERN = "yyyy-MM-dd";
	public static final String MONTH_PATTERN = "yyyy-MM";
	public static final String YEAR_PATTERN = "yyyy";
	public static final String MINUTE_ONLY_PATTERN = "mm";
	public static final String HOUR_ONLY_PATTERN = "HH";

	/**
	 * 日期相加减天数
	 * 
	 * @param date
	 *            如果为Null，则为当前时间
	 * @param days
	 *            加减天数
	 * @param includeTime
	 *            是否包括时分秒,true表示包含
	 * @return
	 * @throws ParseException
	 */
	public static Date dateAdd(Date date, int days, boolean includeTime)
			throws ParseException {
		if (date == null) {
			date = new Date();
		}
		if (!includeTime) {
			SimpleDateFormat sdf = new SimpleDateFormat(DateUtil.DATE_PATTERN);
			date = sdf.parse(sdf.format(date));
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, days);
		return cal.getTime();
	}

	/**
	 * 时间格式化成字符串
	 * 
	 * @param date
	 *            Date
	 * @param pattern
	 *            StrUtils.DATE_TIME_PATTERN || StrUtils.DATE_PATTERN，
	 *            如果为空，则为yyyy-MM-dd
	 * @return
	 * @throws ParseException
	 */
	public static String dateFormat(Date date, String pattern)
			throws ParseException {
		if (StringUtils.isBlank(pattern)) {
			pattern = DateUtil.DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.format(date);
	}

	/**
	 * 字符串解析成时间对象
	 * 
	 * @param dateTimeString
	 *            String
	 * @param pattern
	 *            StrUtils.DATE_TIME_PATTERN ||
	 *            StrUtils.DATE_PATTERN，如果为空，则为yyyy-MM-dd
	 * @return
	 * @throws ParseException
	 */
	public static Date dateParse(String dateTimeString, String pattern)
			throws ParseException {
		if (StringUtils.isBlank(pattern)) {
			pattern = DateUtil.DATE_PATTERN;
		}
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		return sdf.parse(dateTimeString);
	}
	public static Date dateParse(String dateStr) throws ParseException {

		HashMap<String, String> dateRegFormat = new HashMap<String, String>();
		dateRegFormat.put(
				"^\\d{4}\\D+\\d{1,2}\\D+\\d{1,2}\\D+\\d{1,2}\\D+\\d{1,2}\\D+\\d{1,2}\\D*$",
				"yyyy-MM-dd-HH-mm-ss");//2014年3月12日 13时5分34秒，2014-03-12 12:05:34，2014/3/12 12:5:34
		dateRegFormat.put("^\\d{4}\\D+\\d{2}\\D+\\d{2}\\D+\\d{2}\\D+\\d{2}$",
				"yyyy-MM-dd-HH-mm");//2014-03-12 12:05
		dateRegFormat.put("^\\d{4}\\D+\\d{2}\\D+\\d{2}\\D+\\d{2}$",
				"yyyy-MM-dd-HH");//2014-03-12 12
		dateRegFormat.put("^\\d{4}\\D+\\d{2}\\D+\\d{2}$", "yyyy-MM-dd");//2014-03-12
	//	dateRegFormat.put("^\\d{4}\\D+\\d{2}$", "yyyy-MM");//2014-03
		//dateRegFormat.put("^\\d{4}$", "yyyy");//2014
		dateRegFormat.put("^\\d{14}$", "yyyyMMddHHmmss");//20140312120534
		dateRegFormat.put("^\\d{12}$", "yyyyMMddHHmm");//201403121205
		dateRegFormat.put("^\\d{10}$", "yyyyMMddHH");//2014031212
		dateRegFormat.put("^\\d{8}$", "yyyyMMdd");//20140312
		dateRegFormat.put("^\\d{6}$", "yyyyMM");//201403
		dateRegFormat.put("^\\d{2}\\s*:\\s*\\d{2}\\s*:\\s*\\d{2}$",
				"yyyy-MM-dd-HH-mm-ss");//13:05:34 拼接当前日期
		dateRegFormat.put("^\\d{2}\\s*:\\s*\\d{2}$", "yyyy-MM-dd-HH-mm");//13:05 拼接当前日期
		dateRegFormat.put("^\\d{2}\\D+\\d{1,2}\\D+\\d{1,2}$", "yy-MM-dd");//14.10.18(年.月.日)
		dateRegFormat.put("^\\d{1,2}\\D+\\d{1,2}$", "yyyy-dd-MM");//30.12(日.月) 拼接当前年份
		dateRegFormat.put("^\\d{1,2}\\D+\\d{1,2}\\D+\\d{4}$", "dd-MM-yyyy");//12.21.2013(日.月.年)

		String curDate =new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		DateFormat formatter1 =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		DateFormat formatter2;
		String dateReplace;
		Date date = null;

			for (String key : dateRegFormat.keySet()) {
				if (Pattern.compile(key).matcher(dateStr).matches()) {
					formatter2 = new SimpleDateFormat(dateRegFormat.get(key));
					if (key.equals("^\\d{2}\\s*:\\s*\\d{2}\\s*:\\s*\\d{2}$")
							|| key.equals("^\\d{2}\\s*:\\s*\\d{2}$")) {//13:05:34 或 13:05 拼接当前日期
						dateStr = curDate + "-" + dateStr;
					} else if (key.equals("^\\d{1,2}\\D+\\d{1,2}$")) {//21.1 (日.月) 拼接当前年份
						dateStr = curDate.substring(0, 4) + "-" + dateStr;
					}
					dateReplace = dateStr.replaceAll("\\D+", "-");

					date = formatter2.parse(dateReplace);

					break;
				}
			}

		return date;
	}
	public static String dateFilterReplace(String oldString) {

		Matcher m = Pattern.compile("20\\d{2}[-/年]{1}[0-1][0-9][-/月]{1}[0-3][0-9][日]?").matcher(oldString);
		if (m.find()) {
			String date = oldString.substring(m.start(), m.end());
			String noSepDate = date.replaceAll("[-日]", "").replaceAll("[-/年月]", "");
			return noSepDate.substring(0, 4) + "-" + noSepDate.substring(4, 6) + "-" + noSepDate.substring(6);
		}
		 m = Pattern.compile("20\\d{2}[-/年]?[0-1][0-9][-/月]?[0-3][0-9][日]?").matcher(oldString);

		if (m.find()) {
			String date = oldString.substring(m.start(), m.end());
			String noSepDate = date.replaceAll("[-日]", "").replaceAll("[-/年月]", "");
			return noSepDate.substring(0, 4) + "-" + noSepDate.substring(4, 6) + "-" + noSepDate.substring(6);
		}
		return oldString;
	}


	/**
	 * 将日期时间格式成只有日期的字符串（可以直接使用dateFormat，Pattern为Null进行格式化）
	 * 
	 * @param dateTime
	 *            Date
	 * @return
	 * @throws ParseException
	 */
	public static String dateTimeToDateString(Date dateTime)
			throws ParseException {
		String dateTimeString = DateUtil.dateFormat(dateTime,
				DateUtil.DATE_TIME_PATTERN);
		return dateTimeString.substring(0, 10);
	}

	/**
	 * 当时、分、秒为00:00:00时，将日期时间格式成只有日期的字符串， 当时、分、秒不为00:00:00时，直接返回
	 * 
	 * @param dateTime
	 *            Date
	 * @return
	 * @throws ParseException
	 */
	public static String dateTimeToDateStringIfTimeEndZero(Date dateTime)
			throws ParseException {
		String dateTimeString = DateUtil.dateFormat(dateTime,
				DateUtil.DATE_TIME_PATTERN);
		if (dateTimeString.endsWith("00:00:00")) {
			return dateTimeString.substring(0, 10);
		} else {
			return dateTimeString;
		}
	}

	/**
	 * 将日期时间格式成日期对象，和dateParse互用
	 * 
	 * @param dateTime
	 *            Date
	 * @return Date
	 * @throws ParseException
	 */
	public static Date dateTimeToDate(Date dateTime) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateTime);
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		return cal.getTime();
	}

	/**
	 * 时间加减小时
	 * 
	 * @param startDate
	 *            要处理的时间，Null则为当前时间
	 * @param hours
	 *            加减的小时
	 * @return Date
	 */
	public static Date dateAddHours(Date startDate, int hours) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.set(Calendar.HOUR, c.get(Calendar.HOUR) + hours);
		return c.getTime();
	}

	/**
	 * 时间加减分钟
	 * 
	 * @param startDate
	 *            要处理的时间，Null则为当前时间
	 * @param minutes
	 *            加减的分钟
	 * @return
	 */
	public static Date dateAddMinutes(Date startDate, int minutes) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.set(Calendar.MINUTE, c.get(Calendar.MINUTE) + minutes);
		return c.getTime();
	}

	/**
	 * 时间加减秒数
	 * 
	 * @param startDate
	 *            要处理的时间，Null则为当前时间
	 * @param seconds
	 *            加减的秒数
	 * @return
	 */
	public static Date dateAddSeconds(Date startDate, int seconds) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.set(Calendar.SECOND, c.get(Calendar.SECOND) + seconds);
		return c.getTime();
	}

	/**
	 * 时间加减天数
	 * 
	 * @param startDate
	 *            要处理的时间，Null则为当前时间
	 * @param days
	 *            加减的天数
	 * @return Date
	 */
	public static Date dateAddDays(Date startDate, int days) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.set(Calendar.DATE, c.get(Calendar.DATE) + days);
		return c.getTime();
	}

	/**
	 * 时间加减月数
	 * 
	 * @param startDate
	 *            要处理的时间，Null则为当前时间
	 * @param months
	 *            加减的月数
	 * @return Date
	 */
	public static Date dateAddMonths(Date startDate, int months) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.set(Calendar.MONTH, c.get(Calendar.MONTH) + months);
		return c.getTime();
	}

	/**
	 * 时间加减年数
	 * 
	 * @param startDate
	 *            要处理的时间，Null则为当前时间
	 * @param years
	 *            加减的年数
	 * @return Date
	 */
	public static Date dateAddYears(Date startDate, int years) {
		if (startDate == null) {
			startDate = new Date();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(startDate);
		c.set(Calendar.YEAR, c.get(Calendar.YEAR) + years);
		return c.getTime();
	}

	/**
	 * 时间比较（如果myDate>compareDate返回1，<返回-1，相等返回0）
	 * 
	 * @param myDate
	 *            时间
	 * @param compareDate
	 *            要比较的时间
	 * @return int
	 */
	public static int dateCompare(Date myDate, Date compareDate) {
		Calendar myCal = Calendar.getInstance();
		Calendar compareCal = Calendar.getInstance();
		myCal.setTime(myDate);
		compareCal.setTime(compareDate);
		return myCal.compareTo(compareCal);
	}

	/**
	 * 获取两个时间中最小的一个时间
	 * 
	 * @param date
	 * @param compareDate
	 * @return
	 */
	public static Date dateMin(Date date, Date compareDate) {
		if (date == null) {
			return compareDate;
		}
		if (compareDate == null) {
			return date;
		}
		if (1 == dateCompare(date, compareDate)) {
			return compareDate;
		} else if (-1 == dateCompare(date, compareDate)) {
			return date;
		}
		return date;
	}

	/**
	 * 获取两个时间中最大的一个时间
	 * 
	 * @param date
	 * @param compareDate
	 * @return
	 */
	public static Date dateMax(Date date, Date compareDate) {
		if (date == null) {
			return compareDate;
		}
		if (compareDate == null) {
			return date;
		}
		if (1 == dateCompare(date, compareDate)) {
			return date;
		} else if (-1 == dateCompare(date, compareDate)) {
			return compareDate;
		}
		return date;
	}

	/**
	 * 获取两个日期（不含时分秒）相差的天数，不包含今天
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws ParseException
	 */
	public static int dateBetween(Date startDate, Date endDate)
			throws ParseException {
		Date dateStart = dateParse(dateFormat(startDate, DATE_PATTERN),
				DATE_PATTERN);
		Date dateEnd = dateParse(dateFormat(endDate, DATE_PATTERN),
				DATE_PATTERN);
		return (int) ((dateEnd.getTime() - dateStart.getTime()) / 1000 / 60 / 60 / 24);
	}

	/**
	 * 获取两个日期（不含时分秒）相差的天数，包含今天
	 * 
	 * @param startDate
	 * @param endDate
	 * @return
	 * @throws ParseException
	 */
	public static int dateBetweenIncludeToday(Date startDate, Date endDate)
			throws ParseException {
		return dateBetween(startDate, endDate) + 1;
	}

	/**
	 * 获取日期时间的年份，如2017-02-13，返回2017
	 * 
	 * @param date
	 * @return
	 */
	public static int getYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.YEAR);
	}

	/**
	 * 获取日期时间的月份，如2017年2月13日，返回2
	 * 
	 * @param date
	 * @return
	 */
	public static int getMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.MONTH) + 1;
	}

	/**
	 * 获取日期时间的第几天（即返回日期的dd），如2017-02-13，返回13
	 * 
	 * @param date
	 * @return
	 */
	public static int getDate(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.get(Calendar.DATE);
	}

	/**
	 * 获取日期时间当月的总天数，如2017-02-13，返回28
	 * 
	 * @param date
	 * @return
	 */
	public static int getDaysOfMonth(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.getActualMaximum(Calendar.DATE);
	}

	/**
	 * 获取日期时间当年的总天数，如2017-02-13，返回2017年的总天数
	 * 
	 * @param date
	 * @return
	 */
	public static int getDaysOfYear(Date date) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return cal.getActualMaximum(Calendar.DAY_OF_YEAR);
	}

	/**
	 * 根据时间获取当月最大的日期 <li>2017-02-13，返回2017-02-28</li> <li>
	 * 2016-02-13，返回2016-02-29</li> <li>2016-01-11，返回2016-01-31</li>
	 * 
	 * @param date
	 *            Date
	 * @return
	 * @throws Exception
	 */
	public static Date maxDateOfMonth(Date date) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int value = cal.getActualMaximum(Calendar.DATE);
		return dateParse(dateFormat(date, MONTH_PATTERN) + "-" + value, null);
	}

	/**
	 * 根据时间获取当月最小的日期，也就是返回当月的1号日期对象
	 * 
	 * @param date
	 *            Date
	 * @return
	 * @throws Exception
	 */
	public static Date minDateOfMonth(Date date) throws Exception {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		int value = cal.getActualMinimum(Calendar.DATE);
		return dateParse(dateFormat(date, MONTH_PATTERN) + "-" + value, null);
	}

}
