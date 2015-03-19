package com.gtr.c_initialization_and_cleanup.c_this;

/**
 * 使用this在构造器中调用其他构造器
 *   - 只能在构造器中使用this调用构造器, 在其他方法不能这样做
 *   
 *   - 方法参数名和数据成员名一样的时候, 同样可以使用this区分
 * 
 * @author GT-R
 * @date 2015年3月13日 上午10:42:08
 */
public class Flower {
	int petalCount = 0;
	String s = "initial value";
	
	Flower(int petals) {
		petalCount = petals;
		System.out.println("Constructor w/ int arg only, petalCount = "
				+ petalCount);
	}
	
	Flower(String ss) {
		System.out.println("Constructor w/ String arg only, s = " + ss);
		s = ss;
	}
	
	Flower(String s, int petalCount) {
		this(petalCount);
		//! this(s); // can't call two
		this.s = s;
		System.out.println("String & int args");
	}
	
	Flower() {
		this("hi", 47);
		System.out.println("default constructor (no args)");
	}
	
	void printPetalCount() {
		//! this(11) // not inside non-constructor
		System.out.println("petalCount = " + petalCount + " s = " + s);
	}
	
	public static void main(String[] args) {
		Flower flower = new Flower();
		flower.printPetalCount();
	}
}
