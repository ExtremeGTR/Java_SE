package com.gtr.i_container.foreach;

import java.util.Arrays;

/**
 * foreach可以用于数组或其他任何实现Iterable接口的类,
 * 但这并不意味着数组就是Iterable, 不存在数组到Iterable的自动转换, 你必须手工执行这种转换
 * 
 * @author GT-R
 * @date 2015年7月19日 下午2:39:50
 */
public class ArrayIsNotIterable {
	static <T> void test(Iterable<T> ib) {
		for (T t : ib) {
			System.out.print(t + " ");
		}
	}
	
	public static void main(String[] args) {
		test(Arrays.asList(1, 2 , 3));
		
		String[] strings = {"A", "B", "C"};
		// an array works in foreach, but it's not Iterable
		//! test(strings);
		// you must explicitly convert it to an Iterable
		test(Arrays.asList(strings));
	}
}
