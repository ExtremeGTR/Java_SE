package com.gtr.h_inner_class;

/**
 * proper inheritance of an inner class
 * 
 * 覆盖内部类2
 * 
 * No enclosing instance of type E is accessible to invoke the super constructor.
 * Must define a constructor and explicitly qualify its super constructor invocation with an instance of E 
 * (e.g. x.super() where x is an instance of E).
 * 
 * @author GT-R
 * @date 2015年4月10日 上午10:59:25
 */
public class BigEgg2 extends Egg2 {
	public class Yolk extends Egg2.Yolk {
		public Yolk() {
			System.out.println("BigEgg2.Yolk()");
		}
		
		public void f() { System.out.println("BigEgg2.Yolk().f()"); }
	}
	
	public BigEgg2() { insertYolk(new Yolk()); }
	
	public static void main(String[] args) {
		Egg2 egg2 = new BigEgg2();
		egg2.g();
	}
}

class Egg2 {
	protected class Yolk {
		public Yolk() {
			System.out.println("Egg2.Yolk()");
		}
		
		public void f() {
			System.out.println("Egg2.Yolk.f()");
		}
	}
	
	private Yolk y = new Yolk();
	
	public Egg2() { System.out.println("new Egg2()"); }
	
	public void insertYolk(Yolk y) { this.y = y; }
	
	public void g() { y.f(); }
}