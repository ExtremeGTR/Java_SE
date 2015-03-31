package com.gtr.f_polymorphism.constructor_and_polymorphism;

/**
 * constructor and polymorphism
 * 
 * 构造器与多态
 *   - 情景: 在父类构造器的内部调用正在构造的子类对象的某个动态绑定的方法
 *   
 *   - 现象: 父类构造器中所调用的是子类覆盖父类的方法
 *   
 *   - 问题: 这样可能会导致父类使用了未初始化的子类成员, 或者出现一些逻辑问题
 *   
 *   - 解决: 用尽可能简单的方法使对象进入正常的状态, 如果可能, 避免调用其他方法;
 *           并且, 在构造器内唯一能够安全调用的方法只有类本身自带的private或final方法
 * 
 * @author GT-R
 * @date 2015年3月30日 下午1:59:02
 */
public class PloyConstructors {
	public static void main(String[] args) {
		new RoundGlyph(5);
	}
}

class Glyph {
	void draw() {
		System.out.println("Glyph.draw()");
	}
	
	Glyph() {
		System.out.println("Glyph() before draw()");
		draw();
		System.out.println("Glyph() after draw()");
	}
}

class RoundGlyph extends Glyph {
	private int radius = 1;
	
	RoundGlyph(int radius) {
		this.radius = radius;
		System.out.println("RoundGlyph.RoundGlyph(), radius = " + radius);
	}
	
	void draw() {
		System.out.println("RoundGlyph.draw(), radius = " + radius);
	}
}
