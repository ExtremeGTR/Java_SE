package com.gtr.f_polymorphism;

/**
 * 多态与静态方法
 *   - 静态方法也不具有多态的特性
 *     
 *     
 *   -代码中还会出现一个警告
 *    The static method staticGet() from the type StaticSuper should be accessed in a static way
 *    
 * @author GT-R
 * @date 2015年3月27日 下午2:59:11
 */
public class StaticPolymorphism {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		StaticSuper sup = new StaticSub(); // upcast
		System.out.println(sup.staticGet());
		System.out.println(sup.dynamicGet());
	}
}

class StaticSuper {
	public static String staticGet() {
		return "Base staticGet()";
	}
	
	public String dynamicGet() {
		return "Base dynamicGet()";
	}
}

class StaticSub extends StaticSuper {
	public static String staticGet() {
		return "Derived staticGet()";
	}
	
	public String dynamicGet() {
		return "Derived dynamicGet()";
	}
}
