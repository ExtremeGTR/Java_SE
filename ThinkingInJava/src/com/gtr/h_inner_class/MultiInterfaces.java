package com.gtr.h_inner_class;

/**
 * two ways that a class can implement multiple interfaces
 * 
 * 在一个类中以某种方式实现两个接口
 *   1.使用单一类同时实现两个接口
 *   2.外部类实现其中一个接口, 内部类实现另一个接口
 * 
 * @author GT-R
 * @date 2015年4月8日 上午10:13:04
 */
public class MultiInterfaces {
	static void takesA(A a) { }
	static void takesB(B b) { }
	
	public static void main(String[] args) {
		X x = new X();
		Y y = new Y();
		takesA(x);
		takesA(y);
		takesB(x);
		takesB(y.makeB());
	}
}

interface A { }
interface B { }

class X implements A, B { }

class Y implements A {
	B makeB() {
		// anonymous inner class
		return new B() { };
	}
}