package com.gtr.utils;

import java.io.PrintStream;

/**
 * 打印消息工具类
 * 
 * @author GT-R
 * @date 2015年3月19日 下午2:25:03
 */
public class Print {
	// print with a newline
	public static void print(Object object) {
		System.out.println(object);
	}
	
	// print a newline by itself
	public static void print() {
		System.out.println();
	}
	
	// print with no line break
	public static void printnb(Object object) {
		System.out.print(object);
	}
	
	// the new Java SE5 printf() (from C)
	public static PrintStream printf(String format, Object... args) {
		return System.out.printf(format, args);
	}
}
