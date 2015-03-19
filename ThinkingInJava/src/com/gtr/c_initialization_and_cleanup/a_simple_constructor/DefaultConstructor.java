package com.gtr.c_initialization_and_cleanup.a_simple_constructor;

/**
 * 构造器
 *   - 构造器的名称与类名一致
 *   
 *   - 使用构造器就能创建对应类的实例, 它会为对象分配内存空间
 *   
 *   - 没有参数的构造器, 一般称为默认构造器或无参构造器
 *   
 * @author GT-R
 * @date 2015年3月11日 下午11:26:04
 */
public class DefaultConstructor {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			new Rock();
		}
	}
}

class Rock {
	// this is the constructor
	public Rock() {
		System.out.println("Rock ");
	}
}
