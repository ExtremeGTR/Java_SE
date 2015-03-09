package com.gtr.a_third_unit_operator;

import java.util.Random;

/**
 * 逻辑操作符
 * 
 * @author GT-R
 * @date 2015年2月28日 下午2:31:20
 */
public class Boolean {
	public static void main(String[] args) {
		Random rand = new Random();
		int i = rand.nextInt(100);
		int j = rand.nextInt(100);
		
		System.out.println("i = " + i);
		System.out.println("j = " + j);
		System.out.println("i > j is " + (i > j));
		System.out.println("i < j is " + (i < j));
		System.out.println("i >= j is " + (i >= j));
		System.out.println("i <= j is " + (i <= j));
		System.out.println("i == j is " + (i == j));
		System.out.println("i != j is " + (i != j));
		
		// Java中不能像C/C++那样做
		//! System.out.println("i && j is " + (i && j));
		//! System.out.println("i || j is " + (i || j));
		//! System.out.println("!i is " + !i);
		
		System.out.println("(i < 10) && (j < 10) is " 
				+ ((i < 10) && (j < 10)));
		System.out.println("(i < 10) || (j < 10) is " 
				+ ((i < 10) || (j < 10)));
	}
}
