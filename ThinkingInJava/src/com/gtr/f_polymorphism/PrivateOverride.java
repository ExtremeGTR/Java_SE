package com.gtr.f_polymorphism;

/**
 * "覆盖"私有方法
 *   - private方法被自动认为是final方法, 而且对导出类是屏蔽的,
 *     所以, 置于非private方法才可以被覆盖
 * 
 * @author GT-R
 * @date 2015年3月27日 下午2:36:31
 */
public class PrivateOverride {
	private void f() {
		System.out.println("private f()");
	}
	
	public static void main(String[] args) {
		PrivateOverride po = new Derived();
		po.f();
	}
}

class Derived extends PrivateOverride {
	public void f() {
		System.out.println("public f()");
	}
}
