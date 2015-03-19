package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 可变参数列表真正的类型
 *   - 可变参数列表会被编译器转化为数组
 *   
 *   - 如果可变参数列表没有任何元素, 则也会转化为长度为0的数组
 *   
 *   - getClass()方法是属于Object类的一部分
 *   
 *   - 输出的信息'['表示这是一个后面紧随类型的数组类型
 * 
 * @author GT-R
 * @date 2015年3月18日 下午1:23:29
 */
public class VarArgType {
	static void f(Character... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}
	
	static void g(int... args) {
		System.out.print(args.getClass());
		System.out.println(" length " + args.length);
	}
	
	public static void main(String[] args) {
		f('a');
		f();
		g(1);
		g();
		System.out.println("int[]: " + new int[0].getClass());
	}
}
