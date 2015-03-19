package com.gtr.c_initialization_and_cleanup.c_this;

/**
 * this关键字
 *   - 它只能在类的成员方法内部使用, 表示"调用该方法的对象的引用"
 * 
 * @author GT-R
 * @date 2015年3月12日 下午10:41:45
 */
public class Leaf {
	int i = 0;
	
	Leaf increment() {
		i++;
		return this;
	}
	
	void print() {
		System.out.println("i = " + i);
	}
	
	public static void main(String[] args) {
		Leaf leaf = new Leaf();
		leaf.increment().increment().print();
	}
}
