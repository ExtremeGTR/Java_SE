package com.gtr.h_inner_class;

/**
 * OuterClassName.this
 *   - 如果需要在内部类生成对外部类对象的引用, 则可以使用.this语法;
 *     这样产生的引用自动具有正确的类型, 并且在编译期会受到检查, 没有运行时开销
 * 
 * @author GT-R
 * @date 2015年4月5日 下午3:22:44
 */
public class DotThis {
	void f() {
		System.out.println("DotThis.f()");
	}
	
	public class Inner {
		public DotThis outer() {
			// a plain "this" would be Inner's "this"
			return DotThis.this;
		}
	}
	
	public Inner inner() {
		return new Inner();
	}
	
	public static void main(String[] args) {
		DotThis dt = new DotThis();
		DotThis.Inner dti = dt.inner();
		dti.outer().f();
	}
}
