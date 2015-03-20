package com.gtr.a_operator;

/**
 * 等于操作符
 * 
 * @author GT-R
 * @date 2015年2月27日 下午3:59:30
 */
public class Equivalence {
	public static void main(String[] args) {
		Integer n1 = new Integer(47);
		Integer n2 = new Integer(47);
		
		// 此处对比的是对象的引用值(内存地址)
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
	}
}
