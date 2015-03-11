package com.gtr.b_fourth_unit_controlling_execution;

/**
 * return关键字
 *   - return有两个用途
 *     1.指定一个方法返回什么值
 *     2.导致当前的方法退出, 并返回那个值
 * 
 * @author GT-R
 * @date 2015年3月10日 下午2:57:07
 */
public class IfElse2 {
	public static void main(String[] args) {
		System.out.println(test(10, 5));
		System.out.println(test(5, 10));
		System.out.println(test(5, 5));
	}
	
	static int test(int testVal, int target) {
		if (testVal > target) {
			return +1;
		} else if (testVal < target) {
			return -1;
		} else {
			return 0;
		}
	}
}
