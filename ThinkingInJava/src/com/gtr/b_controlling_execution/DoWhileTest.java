package com.gtr.b_controlling_execution;

/**
 * do-while循环语句
 *   - 与while相比, do-while中的语句至少会执行一次
 * 
 * @author GT-R
 * @date 2015年3月9日 下午2:23:03
 */
public class DoWhileTest {
	public static void main(String[] args) {
		do {
			System.out.println("Inside 'do-while'");
		} while (condition());
		System.out.println("Exited 'do-while'");
	}
	
	static boolean condition() {
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}
}
