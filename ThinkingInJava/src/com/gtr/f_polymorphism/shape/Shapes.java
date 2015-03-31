package com.gtr.f_polymorphism.shape;

/**
 * 方法的动态绑定
 *   - 动态绑定也叫后期绑定或运行时绑定, 它的含义就是在运行时根据对象的类型进行绑定
 *     (Java中除了static方法和final方法和private方法之外, 其他方法都是动态绑定)
 * 
 * @author GT-R
 * @date 2015年3月25日 下午8:38:22
 */
public class Shapes {
	private static RandomShapeGenerator generator = new RandomShapeGenerator();
	
	public static void main(String[] args) {
		Shape[] shapes = new Shape[9];
		// fill up the array with shapes
		for (int i = 0; i < shapes.length; i++) {
			shapes[i] = generator.next();
		}
		for (Shape shape : shapes) {
			shape.draw();
		}
	}
}
