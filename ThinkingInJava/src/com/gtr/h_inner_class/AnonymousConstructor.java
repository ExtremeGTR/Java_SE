package com.gtr.h_inner_class;

/**
 * creating a constructor for an anonymous inner class
 * 
 * 匿名类的构造器
 *   - 在类名类中不可能有命名的构造器,
 *     但通过实例初始化块, 就能达到为匿名内部类创建一个构造器的效果
 * 
 * @author GT-R
 * @date 2015年4月6日 下午8:48:11
 */
public class AnonymousConstructor {
	public static Base getBase(int i) {
		return new Base(i) {
			{ System.out.println("Inside instance initializer"); }
			
			@Override
			public void f() {
				System.out.println("In anonymous f()");
			}
		};
	}
	
	public static void main(String[] args) {
		Base base = getBase(47);
		base.f();
	}
}

abstract class Base {
	public Base(int i) {
		System.out.println("Base constructor, i = " + i);
	}
	
	public abstract void f();
}
