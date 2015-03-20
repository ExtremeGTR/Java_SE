package com.gtr.a_operator;

/**
 * 浮点数转型的四舍五入
 *   - 使用java.lang.Math中的round()方法才能进行舍入
 * 
 *   - 基本数据类型作算术运算或位运算
 *     1.只要类型比int小, 那这些值在运算前都会自动转换成int
 *     2.表达式中出现的最大的数据类型决定了表达式最终结果的数据类型
 *     
 * @author GT-R
 * @date 2015年3月6日 下午12:33:52
 */
public class RoundingNumbers {
	public static void main(String[] args) {
		double above = 0.7, below = 0.4;
		float fabove = 0.7f, fbelow = 0.4f;
		
		System.out.println("Math.round(above): " + Math.round(above));
		System.out.println("Math.round(below): " + Math.round(below));
		System.out.println("Math.round(fabove): " + Math.round(fabove));
		System.out.println("Math.round(fbelow): " + Math.round(fbelow));
	}
}
