package com.gtr.f_polymorphism.shape;

/**
 * 正方形
 * 
 * @author GT-R
 * @date 2015年3月25日 下午3:06:27
 */
public class Square extends Shape {
	public void draw() {
		System.out.println("Square.draw()");
	}
	
	public void erase() {
		System.out.println("Square.erase()");
	}
}
