package com.gtr.a_operator;

/**
 * 类型转换操作符
 *   - 窄化转换(narrowing conversion)
 *     将能够容纳更多信息的数据类型转换成无法容纳那么多信息的类型,
 *     可能面临信息丢失的危险
 *   
 *   - 扩展转换(widening conversion)
 *     不必显式地进行类型转换, 新类型肯定能够容纳原来类型的信息,
 *     不会造成任何信息的丢失
 *   
 * @author GT-R
 * @date 2015年3月5日 下午2:20:00
 */
public class Casting {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int i = 200;
		long lng = (long) i; 
		lng = i;
		long lng2 = (long) 200;
		lng2 = 200;
		// a narrowing conversion
		i = (int) lng2; // cast required
	}
}
