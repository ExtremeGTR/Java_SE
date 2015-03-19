package com.gtr.c_initialization_and_cleanup.a_simple_constructor;

/**
 * 自定义构造器
 *   - 凡是带参数的构造器都是自定义构造器
 * 
 * @author GT-R
 * @date 2015年3月12日 上午12:01:42
 */
public class CustomConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 8; i++) {
			new Rock2(i);
		}
	}
}

class Rock2 {
	public Rock2(int i) {
		System.out.println("Rock " + i + " ");
	}
}
