package com.gtr.c_initialization_and_cleanup.f_constructor_initial;


/**
 * 初始化顺序
 *   - 在类内部, 数据成员定义的先后顺序决定了初始化顺序,
 *     即使它们的定义散布于方法定义之间, 它们仍旧会在任何方法(包括构造器)被调用之前得到初始化
 * 
 * @author GT-R
 * @date 2015年3月15日 下午5:33:15
 */
public class OrderOfInitialization {
	public static void main(String[] args) {
		House h = new House();
		h.f();
	}
}

// when the constructor is called to create a
// window object, you'll see a message
class Window {
	Window(int marker) {
		System.out.println("Window(" + marker + ")");
	}
}

class House {
	Window w1 = new Window(1); // before constructor
	
	House() {
		System.out.println("House created");
		w3 = new Window(33); // reinitialize w3
	}
	
	Window w2 = new Window(2); // after constructor
	
	void f() {
		System.out.println("f()");
	}
	
	Window w3 = new Window(3); // at end
}
