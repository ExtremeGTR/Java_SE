package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 只给其中一个方法增加一个非可变参数还是会有二义性问题
 * 
 * @author GT-R
 * @date 2015年3月18日 下午2:57:49
 */
public class OverloadingVarArgs2 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	
	static void f(Character... args) {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		f(1, 'a');
		//! f('a', 'b'); // ambiguous
		f();
	}
}
