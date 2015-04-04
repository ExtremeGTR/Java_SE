package com.gtr.g_interface.nested_interface;

/**
 * 嵌套接口
 *   - 接口嵌套在类中private接口, 它只能被实现为private内部类, 或者实现为public内部类;
 *     并且不能在定义它的类之外被实现
 *   
 *   - 当实现某个接口时, 并不需要实现嵌套在其内部的任何接口
 * 
 * @author GT-R
 * @date 2015年4月3日 下午12:32:03
 */
public class NestingInterfaces {
	public class BImp implements A.B {
		public void f() { }
	}
	
	class CImp implements A.C {
		public void f() { }
	}
	
	// can't implements a private interface except
	// within that interface's defining class
	//! class DImp implements A.D {
	//! 	public void f() { }
	//! }
	
	class EImp implements E {
		public void g() { };
	}
	
	class EGImp implements E.G {
		public void f() { }		
	}
	
	class EImp2 implements E {
		public void g() { }
		
		class EG implements E.G {
			public void f() { }
		}
	}
	
	public static void main(String[] args) {
		A a = new A();
		
		// can't access A.D
		//! A.D ad = a.getD();
		
		// doesn't return anything but A.D
		//! A.DImp2 di2 = a.getD();
		
		// can't access a mmber of the interface
		//! a.getD().f();
		
		// only another A can do anything with getD()
		A a2 = new A();
		a2.receiveD(a.getD());
	}
}

class A {
	interface B {
		void f();
	}
	
	public class BImp implements B {
		public void f() { }
	}
	
	@SuppressWarnings("unused")
	private class BImp2 implements B {
		public void f() { }
	}
	
	public interface C {
		void f();
	}
	
	class CImp implements C {
		public void f() { }
	}
	
	@SuppressWarnings("unused")
	private class CImp2 implements C {
		public void f() { }
	}
	
	private interface D {
		void f();
	}
	
	@SuppressWarnings("unused")
	private class DImp implements D {
		public void f() { }
	}
	
	public class DImp2 implements D {
		public void f() { }
	}
	
	public D getD() { return new DImp2(); }
	
	private D dRef;
	
	public void receiveD(D d) {
		dRef = d;
		dRef.f();
	}
}

interface E {
	interface G {
		void f();
	}
	
	// redundant "public"
	public interface H {
		void f();
	}
	
	void g();
	
	// can't be private within an interface
	//! private interface I { }
}