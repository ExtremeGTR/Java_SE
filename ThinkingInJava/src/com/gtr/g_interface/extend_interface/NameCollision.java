package com.gtr.g_interface.extend_interface;

/**
 * 组合接口时的名字冲突
 *   - 如果方法名相同, 但它们的方法形参或返回类型不同, 则会报错
 *     就像下面C5和I4一样
 *     C5继承了C以及实现了I1接口, 它们都有一个方法f(), 但它们之间的返回值不同
 *     I4继承了I1以及I3接口, 它们都有一个方法f(), 但它们之间的返回值也是不同
 *     
 *   - 若一个类C4继承了类C以及实现了接口I3, 类C和I3都有一个相同的方法f(),
 *     即类C中的f()是接口I3中f()的实现形式, 此刻, 若再在C4中重新定义f(),
 *     则创建C4对象调用f()后, 调用的是重新定义的方法f(); 若没定义, 调用的则是类C所实现的f()
 * 
 * @author GT-R
 * @date 2015年4月2日 下午12:10:16
 */
public class NameCollision {
	public static void main(String[] args) {
		C4 c4 = new C4();
		int result = c4.f();
		System.out.println("result = " + result);
	}
}

interface I1 { void f(); }
interface I2 { int f(int i); }
interface I3 { int f(); }

class C { 
	public int f() {
		return 1;
	}
}

class C2 implements I1, I2 {
	public void f() { }
	
	public int f(int i) { return 1; }
}

class C3 extends C implements I2 {
	public int f(int i) { return 1; }
}

class C4 extends C implements I3 {
	// identical, no problem
	// 方法完全相同, 不会有问题
	public int f() { return 4; }
}

// methods differ only by return type
// The return types are incompatible for the inherited methods I1.f(), C.f()
//! class C5 extends C implements I1 { }
// The return types are incompatible for the inherited methods I1.f(), I3.f()
//! interface I4 extends I1, I3 { }
