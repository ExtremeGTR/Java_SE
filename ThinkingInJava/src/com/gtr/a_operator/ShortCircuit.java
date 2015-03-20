package com.gtr.a_operator;

/**
 * 短路
 *   - 一旦能够明确无误地确定整个表达式的值, 表达式剩余的部分就不会再进行计算
 *   - 逻辑表达式短路现象的应用
 *     一般情况(范围大) && 特殊情况(范围小, 更危险)
 *   
 * @author GT-R
 * @date 2015年3月1日 下午1:57:16
 */
public class ShortCircuit {
	public static void main(String[] args) {
		boolean b = test1(0) && test2(2) && test3(2);
		System.out.println("expression is " + b);
	}
	
	static boolean test1(int val) {
		System.out.println("test1(" + val + ")");
		System.out.println("result: " + (val < 1));
		return val < 1;
	}
	
	static boolean test2(int val) {
		System.out.println("test2(" + val + ")");
		System.out.println("result: " + (val < 2));
		return val < 2;
	}
	
	static boolean test3(int val) {
		System.out.println("test3(" + val + ")");
		System.out.println("result: " + (val < 3));
		return val < 3;
	}
}
