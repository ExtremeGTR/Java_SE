package com.gtr.f_polymorphism.shape;

/**
 * 圆形
 * 
 * @author GT-R
 * @date 2015年3月25日 下午2:58:43
 */
public class Circle extends Shape {
	public void draw() { 
		System.out.println("Circle.draw()");
	}
	
	public void erase() {
		System.out.println("Circle.erase()");
	}
}
