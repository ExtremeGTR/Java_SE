package com.gtr.h_inner_class;

/**
 * putting test code in a nested class
 * 
 * 使用内部类main方法进行测试
 *   - 在每个类中都写一个main()方法, 用来测试这个类,
 *     这样做有一个缺点, 那就是必须带着那些已编译过的额外代码
 * 
 * @author GT-R
 * @date 2015年4月8日 上午9:39:42
 */
public class TestBed {
	public void f() {
		System.out.println("f()");
	}
	
	public static class Tester {
		public static void main(String[] args) {
			TestBed t = new TestBed();
			t.f();
		}
	}
}
