package com.guige.base.util;



import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 字符串工具类
 * 
 * @author wh
 *
 */
public class StringUtils extends org.apache.commons.lang3.StringUtils{




	/**
	 * 是否包含汉字
	 *
	 * @param str
	 * @return
	 */
	public static boolean isContainChinese(String str) {
		if (StringUtils.isBlank(str)) {
			return false;
		}
		Pattern p = Pattern.compile("[\u4e00-\u9fa5]");
		Matcher m = p.matcher(str);
		if (m.find()) {
			return true;
		}
		return false;
	}


	/**
	 * 匹配是否包含数字
	 *
	 * @param str 可能为中文，也可能是-19162431.1254，不使用BigDecimal的话，变成-1.91624311254E7
	 * @return
	 * @author yutao
	 * @date 2016年11月14日下午7:41:22
	 */
	public static boolean isNumeric(String str) {
		// 该正则表达式可以匹配所有的数字 包括负数
		Pattern pattern = Pattern.compile("-?[0-9]+\\.?[0-9]*");
		String bigStr;
		try {
			str=replaceBlank(str);
			bigStr = new BigDecimal(str).toString();
		} catch (Exception e) {
			return false;//异常 说明包含非数字。
		}

		Matcher isNum = pattern.matcher(bigStr); // matcher是全匹配
		if (!isNum.matches()) {
			return false;
		}
		return true;
	}


	/**
	 * 验证字符串是否为标准日期字符串(YYYY-MM-DD)
	 * 
	 * @param date
	 * @return true:是 false:否
	 */
	public static boolean isDate(String date) {
		if (date == null) {
			return false;
		}
		Pattern pattern = Pattern.compile("[0-9]{4}-[0-9]{2}-[0-9]{2}");
		return pattern.matcher(date).matches();
	}

	/**
	 * 获取唯一标识字符串
	 * 
	 * @return
	 */
	public static String getUUID() {
		return UUID.randomUUID().toString();
	}

	/**
	 * 去除字符串左右空格
	 * 
	 * @return
	 */
	public static String trim(String str) {
		if (str == null) {
			return null;
		}
		return str.trim();
	}


	/**
	 * JAVA判断解析标题中是否包含某字符串元素
	 *
	 * @param substringParam 某字符串
	 * @param sourceStrParam 源isInReg
	 * @return 包含则返回true，否则返回false
	 */
	public static int isInReg(String substringParam, String sourceStrParam) {

		String substring= substringParam;
		String sourceStr= sourceStrParam;
		if (isEmpty(substring) || isEmpty(sourceStr)) {
			return -1;
		}
		if (isBlank(sourceStr)) {
			return -1;
		}
		String[] source = sourceStr.replaceAll(" ", "").replaceAll("\n", "").split(",");
		substring=substring.replaceAll(" ", "").replaceAll("\n", "");
		for (int i = 0; i < source.length; i++) {

			String aSource = source[i];
			if(aSource.equals(substring)){
				return i;
			}
			Pattern pattern = Pattern.compile("\\d*[\\[【(（]?"+aSource+"[\\]】)）]?[(（]?%?[）)]?[:：]?");
			if (pattern.matcher(substring).matches()) {
				return i;
			}
		}
		return -1;
	}


	/**
	 * 去除字符串中的空格、回车、换行符、制表符
	 * @param str
	 * @return
	 */
	public static String replaceBlank(String str) {
		String dest = "";
		if (str!=null) {
			Pattern p = Pattern.compile("\\s*|\t|\r|\n");
			Matcher m = p.matcher(str);
			dest = m.replaceAll("");
		}
		return dest;
	}
	public static void main(String[] args) {
		/*Pattern p = Pattern.compile("[`~!@#$%^&*()+=|{}':;'\\\\[\\\\].<>/?~！@#￥%……&*（）——+|{}【】‘；：”“’。，、？]");
		Matcher m = p.matcher(sourceStr);
		sourceStr = m.replaceAll("").trim();
		Matcher m2 = p.matcher(substring);
		substring = m2.replaceAll("").trim();*/
//		String substring ="haha(折溢价)";
//		String aSource = "溢折价,折溢价";
//
//		System.out.println(isIn(substring,aSource));
		if(isNumeric("1006742462.45 ")){
			System.out.println("sss");
		}else{
			System.out.println("ddd");
		}

	}
	/**
	 * JAVA判断解析标题中是否包含某字符串元素
	 *
	 * @param substring 某字符串
	 * @param sourceStr 源
	 * @return 包含则返回true，否则返回false
	 */
	public static boolean isIn(String substring, String sourceStr) {
		if (isEmpty(substring) || isEmpty(sourceStr)) {
			return false;
		}
		if (isBlank(sourceStr)) {
			return false;
		}
		String[] source = sourceStr.replaceAll(" ", "").replaceAll("\n", "").split(",");
		for (int i = 0; i < source.length; i++) {
			String aSource = source[i];
			if (aSource.equals(substring)) {
				return true;
			}
			if(substring.contains(aSource)){
				return true;
			}
		}
		return false;
	}
	// 处理科学计数法与普通计数法的字符串显示，尽最大努力保持精度
	public static String getRealStringValueOfDouble(Double d) {
		String doubleStr = d.toString();
		boolean b = doubleStr.contains("E");
		int indexOfPoint = doubleStr.indexOf('.');
		if (b) {
			int indexOfE = doubleStr.indexOf('E');
			// 小数部分
			BigInteger xs = new BigInteger(doubleStr.substring(indexOfPoint
					+ BigInteger.ONE.intValue(), indexOfE));
			// 指数
			int pow = Integer.valueOf(doubleStr.substring(indexOfE
					+ BigInteger.ONE.intValue()));
			int xsLen = xs.toByteArray().length;
			int scale = xsLen - pow > 0 ? xsLen - pow : 0;
			doubleStr = String.format("%." + scale + "f", d);
		} else {
			java.util.regex.Pattern p = Pattern.compile(".0$");
			java.util.regex.Matcher m = p.matcher(doubleStr);
			if (m.find()) {
				doubleStr = doubleStr.replace(".0", "");
			}
		}
		return doubleStr;
	}
}
