package com.gtr.a_third_unit_operator;

/**
 * 数值溢出
 * 
 * @author GT-R
 * @date 2015年3月9日 上午11:21:38
 */
public class Overflow {
	public static void main(String[] args) {
		int big = Integer.MAX_VALUE;
		System.out.println("big = " + big);
		int bigger = big * 4;
		System.out.println("bigger = " + bigger);
	}
}
