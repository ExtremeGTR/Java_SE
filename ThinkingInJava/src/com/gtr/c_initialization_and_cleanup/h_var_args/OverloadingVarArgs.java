package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 重载带可变参数列表的方法
 *   - 可变参数使得方法重载变得复杂,
 *     传递实参时, 就会调用最明确匹配的方法,
 *     但传递实参时, 编译器就无法确定应该调用哪一个方法, 产生二义性
 *     
 * @author GT-R
 * @date 2015年3月18日 下午2:36:08
 */
public class OverloadingVarArgs {
	static void f(Character... args) {
		System.out.print("first");
		for (Character c : args) {
			System.out.print(" " + c);
		}
		System.out.println();
	}
	
	static void f(Integer... args) {
		System.out.print("second");
		for (Integer i : args) {
			System.out.print(" " + i);
		}
		System.out.println();
	}
	
	static void f(Long... args) {
		System.out.print("third");
		for (Long l : args) {
			System.out.print(" " + l);
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		f('a', 'b', 'c');
		f(1);
		f(2, 1);
		f(0);
		f(0L);
		//! f(); // won't compile -- ambiguous
	}
}
