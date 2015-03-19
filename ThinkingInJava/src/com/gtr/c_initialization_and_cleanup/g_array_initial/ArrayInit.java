package com.gtr.c_initialization_and_cleanup.g_array_initial;

import java.util.Arrays;

/**
 * 直接用花括号括起来初始化对象数组
 * 
 * @author GT-R
 * @date 2015年3月17日 下午3:17:20
 */
public class ArrayInit {
	public static void main(String[] args) {
		Integer[] a = {
			new Integer(1),
			new Integer(2),
			3 // autoboxing
		};
		// 这种初始化方式更加通用, 
		Integer[] b = new Integer[] {
			new Integer(1),
			new Integer(2),
			3 // autoboxing
		};
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
	}
}
