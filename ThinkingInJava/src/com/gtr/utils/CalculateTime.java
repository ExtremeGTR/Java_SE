package com.gtr.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 计算当前时间+X小时Y分钟后的时间
 * 
 * @author GT-R
 * @date 2015年4月24日 上午10:50:30
 */
public class CalculateTime {
	public static void main(String[] args) {
		
	}
	
	public static void test1() {
		Date date = new Date();
		long minutes = date.getTime() / 1000 / 60;
		long afterMinutes = minutes + 21 * 60 + 19;
		long afterMilliseconds = afterMinutes * 60 * 1000;  
		DateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		System.out.println(format.format(new Date(afterMilliseconds)));
	}
	
	public static void test2() {
		
	}
}
