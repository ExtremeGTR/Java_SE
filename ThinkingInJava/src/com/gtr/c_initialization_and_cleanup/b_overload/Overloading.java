package com.gtr.c_initialization_and_cleanup.b_overload;

/**
 * 方法重载(overload)
 * 
 * @author GT-R
 * @date 2015年3月12日 上午11:06:01
 */
public class Overloading {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			Tree t = new Tree(i);
			t.info();
			t.info("overloading method");
		}
		new Tree();
	}
}

class Tree {
	int height;
	
	Tree() {
		System.out.println("Planting a seeding");
		height = 0;
	}
	
	Tree(int initialHeight) {
		height = initialHeight;
		System.out.println("Creating new Tree that is " + 
				height + " feet tall");
	}
	
	void info() {
		System.out.println("Tree is " + height + "feet tall");
	}
	
	void info(String s) {
		System.out.println(s + ": Tree is " + height + " feet tall");
	}
}