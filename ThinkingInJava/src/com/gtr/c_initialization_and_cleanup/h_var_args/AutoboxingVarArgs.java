package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 自动包装+可变参数
 * 
 * @author GT-R
 * @date 2015年3月18日 下午1:51:42
 */
public class AutoboxingVarArgs {
	public static void f(Integer... args) {
		for (Integer i : args) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		f(new Integer(1), new Integer(2));
		f(4, 5, 6, 7, 8, 9);
		f(10, new Integer(11), 12);
	}
}
