package com.gtr.e_reusing_classes;

/**
 * 组合与继承的选择
 *   - 组合技术通常用于
 *     "在新类中嵌入某个对象, 让其实现所需的功能, 但新类的用户看到的只有新类所定义的接口, 而非所嵌入对象的接口"
 * 
 *   - 继承技术通常用于
 *     "使用某个现有类, 并开发一个它的特殊版本; 这意味着你在使用一个通用类, 并为某种特殊需求而将其特殊化"
 *     
 *   - "is-a"(是一个)的关系用继承来表达, "has-a"(有一个)的关系用组合来表达
 *   
 *   - 根据实际情况, 允许类的用户直接访问新类中的组合成分是极具意义的,
 *     类用户能够了解到你正在组装的部件时, 会使得端口更易于理解
 * 
 * @author GT-R
 * @date 2015年3月23日 上午11:31:26
 */
public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheels = new Wheel[4];
	public Door
	    left = new Door(),
	    right = new Door();
	
	public Car() {
		for (int i = 0; i < wheels.length; i++) {
			wheels[i] = new Wheel();
		}
	}
	
	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheels[0].inflate(72);
	}
}

class Engine {
	public void start() { }
	
	public void rev() { }
	
	public void stop() { }
}

class Wheel {
	public void inflate(int psi) { }
}

class Window {
	public void rollup() { }
	
	public void close() { }
}

class Door {
	public Window window = new Window();
	
	public void open() { }
	
	public void close() { }
}