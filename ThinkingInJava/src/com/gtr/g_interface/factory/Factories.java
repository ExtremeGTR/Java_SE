package com.gtr.g_interface.factory;

/**
 * 接口与工厂
 *   - 生成遵循某个接口的对象的典型方式就是工厂方法设计模式,
 *     通过调用工厂的创建方法, 来生成接口的某个实现的对象,
 *     这种代码能够完全将接口的实现分离, 使得我们可以透明地将某个实现替换为另一个实现
 * 
 * @author GT-R
 * @date 2015年4月4日 上午11:55:25
 */
public class Factories {
	public static void serviceConsumer(ServiceFactory factory) {
		Service s = factory.getService();
		s.method1();
		s.method2();
	}
	
	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		// implementations are completely interchangeable
		serviceConsumer(new Implementational2Factory());
	}
}

interface Service {
	void method1();
	void method2();
}

interface ServiceFactory {
	Service getService();
}

class Implementation1 implements Service {
	Implementation1() { } // package access
	
	public void method1() { 
		System.out.println("Implementation1 method1");
	}
	
	public void method2() {
		System.out.println("Implementation1 method2");
	}
}

class Implementation1Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation1();
	}
}

class Implementation2 implements Service {
	Implementation2() { }
	
	public void method1() {
		System.out.println("Implementational2 method1");
	}
	
	public void method2() {
		System.out.println("Implementational2 method2");
	}
}

class Implementational2Factory implements ServiceFactory {
	public Service getService() {
		return new Implementation2();
	}
}