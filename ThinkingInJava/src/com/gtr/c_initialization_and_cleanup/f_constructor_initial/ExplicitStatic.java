package com.gtr.c_initialization_and_cleanup.f_constructor_initial;

/**
 * 显式的静态初始化
 *   - 使用static代码块显式对static数据成员进行初始化,
 *     这个代码块的语句仅执行一次, 以下两种情况都会触发static块执行
 *       1.首次创建该类的对象
 *       2.首次访问该类的静态数据成员
 *   
 * @author GT-R
 * @date 2015年3月16日 下午2:29:49
 */
public class ExplicitStatic {
	static Cups cups1 = new Cups();
	static Cups cups2 = new Cups();
	
	
	public static void main(String[] args) {
		System.out.println("Inside main()");
		Cups.cup1.f(99);
	}
}

// 杯
class Cup {
	public Cup(int marker) {
		System.out.println("Cup(" + marker + ")");
	}
	
	void f(int marker) {
		System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	
	static {
		System.out.println("static block begin");
		cup1 = new Cup(1);
		cup2 = new Cup(2);
		System.out.println("static block end");
	}
	
	public Cups() {
		System.out.println("Cups()");
	}
}
