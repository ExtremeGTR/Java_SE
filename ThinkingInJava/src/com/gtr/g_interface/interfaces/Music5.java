package com.gtr.g_interface.interfaces;

import com.gtr.f_polymorphism.Note;

/**
 * interface关键字
 *   - abstract关键字允许我们在类中创建一个或多个没有任何定义的方法,
 *     提供了接口部分, 但没有提供任何具体实现, 实现由类的继承者创建;
 *     而interface关键字则表示这个类完全抽象, 它不会提供任何具体实现
 *     
 *   - 接口是用来建立类与类之间的协议
 *   
 *   - 1.接口内的数据成员是隐式被static和final修饰
 *     2.接口内的方法只有声明而没有方法体, 并且隐式被public修饰
 * 
 * @author GT-R
 * @date 2015年4月1日 上午11:55:04
 */
public class Music5 {
	// doesn't care about type, so new types
	// added to the system still work right
	static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}
	
	static void tuneAll(Instrument[] iArr) {
		for (Instrument i : iArr) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		// upcasting during addition to the array
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		
		tuneAll(orchestra);
	}
}

interface Instrument {
	// compile-time constant
	int VALUE = 5; // static & final
	
	// can't have method definitions
	void play(Note n); // automatically public
	
	void adjust();
}

class Wind implements Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	public String toString() {
		return "Wind";
	}
}

class Percussion implements Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	public String toString() {
		return "Percussion";
	}
}

class Stringed implements Instrument {
	public void play(Note n) {
		System.out.println(this + ".play() " + n);
	}

	public void adjust() {
		System.out.println(this + ".adjust()");
	}
	
	public String toString() {
		return "Stringed";
	}
}

class Brass extends Wind {
	public String toString() {
		return "Brass";
	}
}

class Woodwind extends Wind {
	public String toString() {
		return "Woodwind";
	}
}