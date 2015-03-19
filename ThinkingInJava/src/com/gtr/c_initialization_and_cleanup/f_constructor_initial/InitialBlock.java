package com.gtr.c_initialization_and_cleanup.f_constructor_initial;

/**
 * 实例初始化
 *   - 和静态初始化一样, 只是少了static关键字,
 *     无论调用哪个构造器, 在之前都会执行一遍实例初始化块中的代码
 *     
 * @author GT-R
 * @date 2015年3月16日 下午5:21:15
 */
public class InitialBlock {
	Mug mug1;
	Mug mug2;
	
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
		System.out.println("mug1 & mug2 initialized");
	}
	
	InitialBlock() {
		System.out.println("InitialBlock()");
	}
	
	InitialBlock(int i) {
		System.out.println("initialBlock(int)");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main()");
		new InitialBlock();
		System.out.println("new InitialBlock() completed");
		new InitialBlock(1);
		System.out.println("new InitialBlock(1) completed");
	}
}

// 马克杯
class Mug {
	Mug(int marker) {
		System.out.println("Mug(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}