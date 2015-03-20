package com.gtr.c_initialization_and_cleanup.f_constructor_initial;


/**
 * 初始化顺序
 *   - 在类内部, 数据成员定义的先后顺序决定了初始化顺序,
 *     即使它们的定义散布于方法定义之间, 它们仍旧会在任何方法(包括构造器)被调用之前得到初始化
 *     
 * 对象的创建过程
 *   假设有个名为MyClass的类
 *   1.首次创建类型为MyClass的对象时(构造方法也是静态方法), 或者它的静态方法/数据成员首次被访问时,
 *     Java解释器必须查找类路径, 以定位MyClass.class文件
 *     
 *   2.载入MyClass.class, 有关静态初始化的所有动作都会执行;
 *     因此, 静态初始化只在Class对象首次加载的时候执行一次
 *   
 *   3.当用 new MyClass()创建对象的时候, 首先将在堆上为MyClass对象分配足够的存储空间
 *   
 *   4.这块存储空间会被清零, 这就自动将MyClass对象中的所有基本数据类型数据都设置成默认值, 引用则被设置成null
 *   
 *   5.执行所有出现于字段定义处的初始化动作
 *   
 *   6.执行构造器
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
