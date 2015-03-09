package com.gtr.a_third_unit_operator;

/**
 * 三元操作符
 *   - boolean-exp ? valueA : valueB;
 *   - 这种操作符不推荐频繁使用, 因为它很容易产生可读性极差的代码 
 * 
 * @author GT-R
 * @date 2015年3月4日 下午8:39:56
 */
public class TernaryIfElse {
	public static void main(String[] args) {
		System.out.println(ternary(9));
		System.out.println(ternary(10));
	}
	
	static int ternary(int i) {
		return i < 10 ? i * 100 : i * 10;
	}
	
	static int standardIfElse(int i) {
		if (i < 10) {
			return i * 100;
		} else {
			return i * 10;
		}
	}
}
