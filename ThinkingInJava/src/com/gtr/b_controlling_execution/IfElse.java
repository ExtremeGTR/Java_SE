package com.gtr.b_controlling_execution;

/**
 * if-else流程控制语句
 *   - 形式1
 *     if (boolean-expression)
 *       statement
 *   
 *   - 形式2
 *     if (boolean-expression)
 *       statement
 *     else
 *     	 statement
 * 
 * @author GT-R
 * @date 2015年3月9日 上午11:39:51
 */
public class IfElse {
	
	public static void main(String[] args) {
		test(10, 5);
		System.out.println(result);
		test(5, 10);
		System.out.println(result);
		test(5, 5);
		System.out.println(result);
	}
	
	static int result = 0;
	
	static void test(int testVal, int target) {
		if (testVal > target) {
			result = +1;
		} else if (testVal < target) {
			result = -1;
		} else {
			result = 0;
		}
	}
}
