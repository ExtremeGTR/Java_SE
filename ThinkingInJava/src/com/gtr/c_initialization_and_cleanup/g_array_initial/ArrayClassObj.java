package com.gtr.c_initialization_and_cleanup.g_array_initial;

import java.util.Arrays;
import java.util.Random;

/**
 * 非基本类型数组, 即引用数组
 * 
 * @author GT-R
 * @date 2015年3月17日 下午2:57:29
 */
public class ArrayClassObj {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] a = new Integer[rand.nextInt(20)];
		System.out.println("length of a = " + a.length);
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(500); // autoboxing
		}
		System.out.println(Arrays.toString(a));
	}
}
