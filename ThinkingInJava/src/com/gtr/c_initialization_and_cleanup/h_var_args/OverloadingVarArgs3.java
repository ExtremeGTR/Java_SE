package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 给所有方法都添加一个非可变参数, 二义性问题才会解决
 *   - 建议: 总是在重载方法的一个版本上使用可变参数列表, 或者就不用它
 * 
 * @author GT-R
 * @date 2015年3月18日 下午3:56:26
 */
public class OverloadingVarArgs3 {
	static void f(float i, Character... args) {
		System.out.println("first");
	}
	
	static void f(char c, Character... args) {
		System.out.println("second");
	}
	
	public static void main(String[] args) {
		f(1, 'a');
		f('a', 'b');
	}
}
