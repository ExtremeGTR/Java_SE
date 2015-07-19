package com.gtr.h_inner_class;

/**
 * using inner class for callbacks
 * 
 * 闭包(closure)
 *   - 它是一个可调用的对象, 它记录了一些信息, 这些信息来自于创建它的作用域;
 *     通过回调, 对象能够携带一些信息, 这些信息允许它在稍后的某个时刻调用初始的对象
 * 
 *   - 回调的价值在于它的灵活性 -- 可以再运行时动态地决定调用什么方法
 *   
 * 这个例子进一步展示了使用普通方式实现一个接口与内部类方式实现接口的区别
 *   - 当创建一个内部类时, 并没有修改外围类的接口
 * 
 * @author GT-R
 * @date 2015年4月8日 下午1:30:37
 */
public class Callbacks {
	public static void main(String[] args) {
		Callee1 c1 = new Callee1();
		Callee2 c2 = new Callee2();
		MyIncrement.f(c2);
		
		Caller caller1 = new Caller(c1);
		Caller caller2 = new Caller(c2.getCallbackReference());
		caller1.go();
		caller1.go();
		caller2.go();
		caller2.go();
	}
}

interface Incrementable {
	void increment();
}

// very simple to just implement the interface
class Callee1 implements Incrementable {
	private int i = 0;
	
	public void increment() {
		i++;
		System.out.println(i);
	}
}

class MyIncrement {
	public void increment() {
		System.out.println("Other operation");
	}
	
	static void f(MyIncrement mi) { mi.increment(); }
}


// if your class must implement increment() in
// some other way. you must use an inner class
class Callee2 extends MyIncrement {
	private int i = 0;
	
	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}
	
	private class Closure implements Incrementable {
		public void increment() {
			// specify outer-class method,
			// otherwise you'd get an infinite recursion
			Callee2.this.increment();
		}
	}
	
	Incrementable getCallbackReference() {
		return new Closure();
	}
}

class Caller {
	private Incrementable callbackReference;
	
	Caller(Incrementable cbh) { callbackReference = cbh; }
	
	void go() { callbackReference.increment(); }
}