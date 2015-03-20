package com.gtr.a_operator;

/**
 * 字符串操作符+和+=
 *   
 * @author GT-R
 * @date 2015年3月5日 上午11:41:41
 */
public class StringOperators {
	public static void main(String[] args) {
		int x = 0, y = 1, z = 2;
		String s = "x, y, z ";
		System.out.println(s + x + y + z);
		System.out.println(x + " " + s); // converts x to a String
		s += "(summed) = "; // Concatenation operator
		System.out.println(s + (x + y + z));
		System.out.println("" + x); // shorthand for Integer.toString()
	}
}
