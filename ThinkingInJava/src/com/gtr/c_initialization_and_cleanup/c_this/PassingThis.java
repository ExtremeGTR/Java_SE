package com.gtr.c_initialization_and_cleanup.c_this;

/**
 * 使用this关键字将当前对象传递给其他方法
 * 
 * @author GT-R
 * @date 2015年3月13日 上午12:26:19
 */
public class PassingThis {
	public static void main(String[] args) {
		new Person().eat(new Apple());
	}
}

class Person {
	public void eat(Apple apple) {
		Apple peeled = apple.getPeeled();
		System.out.println("Yummy->eat" + peeled);
	}
}

class Peeler {
	static Apple peel(Apple apple) {
		return apple; // peeled
	}
}

class Apple {
	Apple getPeeled() {
		return Peeler.peel(this);
	}
}
