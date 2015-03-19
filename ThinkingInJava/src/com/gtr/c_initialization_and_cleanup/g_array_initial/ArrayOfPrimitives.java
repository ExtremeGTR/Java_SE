package com.gtr.c_initialization_and_cleanup.g_array_initial;

/**
 * 数组初始化
 *   - 使用int[] a1 = { 1, 2, 3, 4, 5 }这种数组的初始化方式,
 *     存储空间的分配等价于使用new
 *     
 *   - java中数组的名称是一个引用
 *   
 *   - 数组有一个length成员, 它表示数组的长度,
 *     所以数组可访问的边界是[0, length-1], 超出边界就会抛出异常
 * 
 * @author GT-R
 * @date 2015年3月17日 下午12:11:34
 */
public class ArrayOfPrimitives {
	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3, 4, 5 };
		int[] a2;
		a2 = a1;
		for (int i = 0; i < a2.length; i++) {
			a2[i] = a2[i] + 1;
		}
		for (int i = 0; i < a1.length; i++) {
			System.out.println("a1[" + i + "] = " + a1[i]);
		}
	}
}
