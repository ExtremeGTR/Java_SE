package com.gtr.a_third_unit_operator;

/**
 * 数字转换的截尾和舍入
 *   - float或double转型为整形值时, 总是对其执行截尾
 * 
 * @author GT-R
 * @date 2015年3月5日 下午2:48:49
 */
public class CastingNumbers {
	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		
		System.out.println("(int) above: " + (int) above);
		System.out.println("(int) below: " + (int) below);
		System.out.println("(int) fabove: " + (int) fabove);
		System.out.println("(int) fbelow: " + (int) fbelow);
	}
}
