package com.gtr.f_polymorphism.shape;

/**
 * 三角形
 * 
 * @author GT-R
 * @date 2015年3月25日 下午3:11:36
 */
public class Triangle extends Shape {
	public void draw() {
		System.out.println("Triangle.draw()");
	}
	
	public void erase() {
		System.out.println("Triangle.erase()");
	}
}
