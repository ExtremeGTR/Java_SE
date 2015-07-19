package com.gtr.h_inner_class;

/**
 * with concrete or abstract classes,
 * inner classes are the only way to produce the effect
 * of "multiple implementation" inheritance
 * 
 * 如果拥有的是抽象类或具体类, 那只有使用内部类才能实现多重继承
 * 
 * 使用内部类, 可以获得的一些特性
 *   1.内部类可以有多个实例, 每个实例都有自己的状态信息, 并且与其外围类对象的信息相互独立
 *   
 *   2.在单个外围类中, 可以让多个内部类以不同的方式实现同一个接口, 或继承同一个类
 *   
 *   3.创建内部类对象的时刻并不依赖于外围类对象的创建
 *   
 *   4.内部类并没有令人迷惑的"is-a"关系, 它是一个独立的实体
 * 
 * @author GT-R
 * @date 2015年4月8日 下午12:10:05
 */
public class MultiImplementation {
	static void takesD(D d) { }
	static void takesE(E d) { }
	
	public static void main(String[] args) {
		Z z = new Z();
		takesD(z);
		takesE(z.makeE());
	}
}

class D { }

abstract class E { }

class Z extends D {
	E makeE() { return new E() { }; }
}
