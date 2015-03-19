package com.gtr.c_initialization_and_cleanup.f_constructor_initial;

/**
 * 静态数据成员的初始化
 *   - 静态数据只占一份存储区域
 *   
 *   - static关键字只能用于类数据成员和方法
 *   
 *   - 初始化的顺序是先静态对象, 而后是非静态对象
 * 
 * @author GT-R
 * @date 2015年3月16日 上午12:20:13
 */
public class StaticInitialization {
	static Table table = new Table();
	static Cupboard cupboard = new Cupboard();
	
	public static void main(String[] args) {
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		System.out.println("Creating new Cupboard() in main");
		new Cupboard();
		table.f2(1);
		cupboard.f3(1);
	}
}

// 碗
class Bowl {
	Bowl(int marker) {
		System.out.println("Bowl(" + marker + ")");
	}
	
	void f1(int marker) {
		System.out.println("f1(" + marker + ")");
	}
}

// 桌子
class Table {
	static Bowl bowl1 = new Bowl(1);
	
	public Table() {
		System.out.println("Table()");
		bowl2.f1(1);
	}
	
	void f2(int marker) {
		System.out.println("f2(" + marker + ")");
	}
	
	static Bowl bowl2 = new Bowl(2);
}

// 橱柜
class Cupboard {
	Bowl bowl3 = new Bowl(3);
	static Bowl bowl4 = new Bowl(4);
	
	Cupboard() {
		System.out.println("Cupboard()");
		bowl4.f1(2);
	}
	
	void f3(int marker) {
		System.out.println("f3(" + marker + ")");
	}
	
	static Bowl bowl5 = new Bowl(5);
}
