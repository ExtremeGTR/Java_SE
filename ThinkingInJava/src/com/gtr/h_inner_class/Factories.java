package com.gtr.h_inner_class;

/**
 * 匿名内部类与工厂
 *   - 通常只需要单一的工厂对象, 因此在这里工厂对象呗创建为Service实现中的一个static域
 * 
 * @author GT-R
 * @date 2015年4月7日 下午12:26:52
 */
public class Factories {
	public static void serviceConsumer(ServiceFactory factory) {
		Service service = factory.getService();
		service.method1();
		service.method2();
	}
	
	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		
		// implementations are completely interchangeable
		serviceConsumer(Implementation2.factory);
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
	private Implementation1() { }

	@Override
	public void method1() { System.out.println("Implementation1.method1"); }

	@Override
	public void method2() {	System.out.println("Implementation1.method2"); }
	
	public static ServiceFactory factory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation1();
		}
	};
}

class Implementation2 implements Service {
	private Implementation2() { }
	
	@Override
	public void method1() { System.out.println("Implementation2.method1"); }

	@Override
	public void method2() {	System.out.println("Implementation2.method2"); }
	
	public static ServiceFactory factory = new ServiceFactory() {
		@Override
		public Service getService() {
			return new Implementation2();
		}
	};
}