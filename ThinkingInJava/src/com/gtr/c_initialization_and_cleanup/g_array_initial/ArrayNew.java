package com.gtr.c_initialization_and_cleanup.g_array_initial;

import java.util.Arrays;
import java.util.Random;

/**
 * 使用new给数据分配内存空间
 *   - Ramdom.nextInt()返回0到输入参数之间的一直整形值
 *   
 *   - Arrays.toString()属于java.util包, 它将产生一维数组的可打印版本
 * 
 * @author GT-R
 * @date 2015年3月17日 下午2:04:47
 */
public class ArrayNew {
	public static void main(String[] args) {
		int a[];
		Random rand = new Random(47);
		a = new int[rand.nextInt(20)];
		System.out.println("length of a = " + a.length);
		System.out.println(Arrays.toString(a));
	}
}
