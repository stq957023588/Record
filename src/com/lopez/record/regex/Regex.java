package com.lopez.record.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
	public static void main(String[] args) {
		String str="fewfsd5v5w5f";
		String rule="^\\w{12}$";
		Pattern pattern=Pattern.compile(rule);
		Matcher matcher=pattern.matcher(str);
		System.out.println(matcher.find());//print true
		System.out.println(matcher.replaceAll("AAAAAAAA"));//print AAAAAAAA
		/*
		 * \\d	数字字符匹配。等效于 [0-9]。
		 * \\D 	非数字字符匹配。等效于 [^0-9]。
		 * \\n	换行符匹配。
		 * \\s  匹配任何空白字符，包括空格、制表符、换页符等。
		 * \\S	匹配任何非空白字符。
		 * \\t	制表符匹配。(tab?)
		 * \\w	匹配任何字类字符，包括下划线。
		 * \\W	与任何非单词字符匹配。
		 */
	}
}
