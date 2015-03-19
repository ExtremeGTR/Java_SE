package com.gtr.c_initialization_and_cleanup.h_var_args;

/**
 * 数组式的可变参数列表
 *   - 这种方式是在Java1.5之前所使用的
 *   
 *   - 自定义类, 如果没有重新定义toString(), 打印类对象的信息会是: 类的名字@对象的内存地址
 * 
 * @author GT-R
 * @date 2015年3月17日 下午11:55:46
 */
public class VarArgs {
	static void printArray(Object[] args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		printArray(new Object[] {
			new Integer(47), new Float(3.14), new Double(11.11)
		});
		printArray(new Object[] { "one", "two", "three" });
		printArray(new Object[] { new A(), new A(), new A() });
	}
}

class A {
	
}
