package com.gtr.b_controlling_execution;

/**
 * while循环语句
 *   - 通用格式
 *     while (boolean-expression)
 *       statement
 *   
 *   - Math.random()方法
 *     产生一个区间在[0, 1)的double值随机数
 * 
 * @author GT-R
 * @date 2015年3月9日 下午2:08:39
 */
public class WhileTest {
	public static void main(String[] args) {
		while (condition()) {
			System.out.println("Inside 'while'");
		}
		System.out.println("Exited 'while'");
	}
	
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}
}
