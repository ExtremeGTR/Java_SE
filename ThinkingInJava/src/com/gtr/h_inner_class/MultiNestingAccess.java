package com.gtr.h_inner_class;

/**
 * nested classes can access all members of all
 * level of the classes they are nested within
 * 
 * 从多重嵌套的内部类访问外部成员
 *   - 一个内部类被嵌套了多少层并不重要,
 *     它能透明地访问所有它所嵌入的外围类的所有成员
 * 
 * @author GT-R
 * @date 2015年4月8日 上午9:46:26
 */
public class MultiNestingAccess {
	public static void main(String[] args) {
		MNA mna = new MNA();
		MNA.A mnaa = mna.new A();
		MNA.A.B mnaab = mnaa.new B();
		mnaab.h();
	}
}

class MNA {
	private void f() { }
	
	class A {
		private void g() { }
		
		public class B {
			void h() {
				g();
				f();
			}
		}
	}
}
