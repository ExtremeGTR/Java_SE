package com.gtr.a_third_unit_operator;

/**
 * 优先级
 * 
 * @author GT-R
 * @date 2015年2月24日 下午2:07:00
 */
public class Precedence {
	public static void main(String[] args) {
		int x = 1, y = 2, z = 3;
		int a = x + y - 2 / 2 + z;
		int b = x + (y - 2) / (2 + z);
		System.out.println("a = " + a + " b = " + b);
	}
}
