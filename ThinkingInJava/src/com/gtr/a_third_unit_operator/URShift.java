package com.gtr.a_third_unit_operator;

/**
 * 无符号右移操作符
 *   -这个操作符结合赋值操作符, 可能会出现问题
 *    如果对byte或short进行这样的移位运算, 得到的可能不是正确的结果
 * 
 * @author GT-R
 * @date 2015年3月2日 下午12:25:41
 */
public class URShift {
	public static void main(String[] args) {
		int i = -1;
		System.out.println(Integer.toBinaryString(i));
		i >>>= 10;
		System.out.println(Integer.toBinaryString(i));
		
		long l = -1;
		System.out.println(Long.toBinaryString(l));
		l >>>= 10;
		System.out.println(Long.toBinaryString(l));
		
		short s = -1; 
		System.out.println(Integer.toBinaryString(s));
		s >>>= 10;
		System.out.println(Integer.toBinaryString(s));

		byte b = -1;
		System.out.println(Integer.toBinaryString(b));
		b >>>= 10;
		System.out.println(Integer.toBinaryString(b));
		b = -1;
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(b >>> 10));
	}
}
