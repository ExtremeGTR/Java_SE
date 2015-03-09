package com.gtr.a_third_unit_operator;

/**
 * 指数计数法
 *   -1.39e-43的含义就是1.39*10^43
 *   -Java中浮点数默认的类型是double
 * 
 * @author GT-R
 * @date 2015年3月2日 上午10:57:56
 */
public class Exponents {
	public static void main(String[] args) {
		// Uppercase and lowercase 'e' are the same
		float expFloat = 1.39e-43f;
		expFloat = 1.39E-43f;
		System.out.println("expFloat = " + expFloat);
		double expDouble = 47e47d; // 'd' is optional
		double expDouble2 = 47e47; // automatically double
		System.out.println("expDouble = " + expDouble);
		System.out.println("expDouble2 = " + expDouble2);
	}
}
