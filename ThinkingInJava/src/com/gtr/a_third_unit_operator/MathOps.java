package com.gtr.a_third_unit_operator;

import java.util.Random;

/**
 * 算术操作符
 *   - 其中Random类是随机数类, 如果创建该类实例的时候没有传递参数, 
 *     则默认会使用系统当前时间作为随机数生成器的种子
 *     
 * @author GT-R
 * @date 2015年2月25日 上午10:56:34
 */
public class MathOps {
	public static void main(String[] args) {
		Random rand = new Random(47);
		int result, a, b;
		// 随机整数 [1, 100]
		a = rand.nextInt(100) + 1;
		System.out.println("a = " + a);
		b = rand.nextInt(100) + 1;
		System.out.println("b = " + b);
		
		result = a + b;
		System.out.println("a + b = " + result);
		result = a - b;
		System.out.println("a - b = " + result);
		result = a / b;
		System.out.println("a / b = " + result);
		result = a * b;
		System.out.println("a * b = " + result);
		result = a % b;
		System.out.println("a % b = " + result);
		
		// 随机浮点数
		float result2, u, v;
		u = rand.nextFloat();
		System.out.println("u = " + u);
		v = rand.nextFloat();
		System.out.println("v = " + v);
		
		result2 = u + v;
		System.out.println("u + v = " + result2);
		result2 = u - v;
		System.out.println("u - v = " + result2);
		result2 = u / v;
		System.out.println("u / v = " + result2);
		result2 = u * v;
		System.out.println("u * v = " + result2);
		
		u += v;
		System.out.println("u += v = " + u);
		u -= v;
		System.out.println("u -= v = " + u);
		u /= v;
		System.out.println("u /= v = " + u);
	}
}
