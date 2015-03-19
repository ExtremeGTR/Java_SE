package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 可选的尾随可变参数
 * 
 * @author GT-R
 * @date 2015年3月18日 上午1:00:36
 */
public class OptionalTrailingArguments {
	static void f(int required, String... trailing) {
		System.out.print("required: " + required + " ");
		for (String s : trailing) {
			System.out.print(s + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		f(1, "one");
		f(2, "two", "three");
		f(0);
	}
}
