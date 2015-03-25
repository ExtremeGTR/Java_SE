package com.gtr.e_reusing_classes.final_keyword;

/**
 * final参数
 *   - final修饰的参数表示该参数是只读参数,
 *     这一特性主要用来向匿名内部类传递数据
 * 
 * 
 * @author GT-R
 * @date 2015年3月24日 下午4:16:03
 */
public class FinalArguments {
	void with(final Gizmo g) {
		//! g = new Gizmo(); // illegal -- g is final
	}
	
	void without(Gizmo g) {
		g = new Gizmo(); // ok -- g not final
		g.spin();
	}
	
	void f(final int i) {
		//! i++; // can't change
	}
	
	int g(final int i) {
		return i + 1;
	}
	
	public static void main(String[] args) {
		FinalArguments f = new FinalArguments();
		f.without(null);
		f.with(null);
	}
}

class Gizmo {
	public void spin() { }
}