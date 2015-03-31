package com.gtr.f_polymorphism.shape;

import java.util.Random;

/**
 * 随机图形生成器
 *   = 这里利用了向上转型而形成的一种"工厂"(factory)
 * 
 * @author GT-R
 * @date 2015年3月25日 下午3:18:35
 */
public class RandomShapeGenerator {
	private Random rand = new Random(47);
	
	public Shape next() {
		switch (rand.nextInt(3)) {
			default:
			case 0:
				return new Circle();
			case 1:
				return new Square();
			case 2:
				return new Triangle();
		}
	}
}
