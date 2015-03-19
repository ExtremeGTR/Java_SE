package com.gtr.c_initialization_and_cleanup.b_overload;

/**
 * 区分重载方法
 *   - 每个重载的方法都必须有唯一的形参列表(参数个数和参数类型)
 * 
 * @author GT-R
 * @date 2015年3月12日 上午11:22:37
 */
public class OverloadingOrder {
	public static void main(String[] args) {
		f("String first", 11);
		f(99, "int first");
	}
	
	static void f(int i, String s) {
		System.out.println("int: " + i + ", String: " + s);
	}
	
	static void f(String s, int i) {
		System.out.println("String: " + s + ", int: " + i);
	}
}
