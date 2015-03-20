package com.gtr.b_controlling_execution;

/**
 * 逗号操作符
 *   - 与逗号分隔符(分隔函数的参数)不同, 逗号操作符只用在for循环表达中
 * 
 * @author GT-R
 * @date 2015年3月9日 下午3:07:17
 */
public class CommaOperator {
	public static void main(String[] args) {
		for (int i = 1, j = i + 10; i < 5; i++, j = i * 2) {
			System.out.println("i = " + i + ", j = " + j);
		}
	}
}
