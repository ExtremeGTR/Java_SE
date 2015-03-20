package com.gtr.a_operator;

/**
 * 自增自减
 *   - 前缀式: 先执行运算, 再生成值
 *     后缀式: 先生成值, 再执行运算
 *      
 * @author GT-R
 * @date 2015年2月27日 下午2:24:09
 */
public class AutoInc {
	public static void main(String[] args) {
		int i = 1;
		System.out.println("i = " + i);
		System.out.println("++i = " + ++i); // 前缀自增(Pre-increment)
		System.out.println("i++ = " + i++); // 后缀自增(Post-increment)
		System.out.println("i = " + i);
		System.out.println("--i = " + --i); // 前缀自减(Pre-decrement)
		System.out.println("i-- = " + i--); // 后缀自减(Post-decrement)
		System.out.println("i = " + i);
	}
}
