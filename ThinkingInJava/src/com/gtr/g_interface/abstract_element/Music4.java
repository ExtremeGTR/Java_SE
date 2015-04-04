package com.gtr.g_interface.abstract_element;

import com.gtr.f_polymorphism.Note;

/**
 * abstract class and method
 * 
 * 抽象类和抽象方法
 *   - 抽象类通常用于建立一个通用的接口, 并以不同的子类用不同的方式表示此接口
 *   
 *   - 抽象方法是仅有方法声明而没有方法体的方法
 *   
 *   - 如果一个类包含一个或多个抽象方法, 该类必须被限定为抽象的;
 *     而且, 就算类中没有抽象方法, 该类也可以限定为抽象的
 * 
 * @author GT-R
 * @date 2015年3月31日 下午3:35:13
 */
public class Music4 {
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

abstract class Instrument {
	@SuppressWarnings("unused")
	private int i; // storage allocated for each
	
	public abstract void play(Note n);
	
	public String what() { return "Instrument"; }
	
	public abstract void adjust();
}

class Wind extends Instrument {
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	
	public String what() { return "Wind"; }
	
	public void adjust() { }
}

class Percussion extends Instrument {
	public void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	
	public String what() { return "Percussion"; }
	
	public void adjust() { }
}

class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	
	public String what() { return "Stringed"; }
	
	public void adjust() { }
}

class Brass extends Wind {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	
	public void adjust() {
		System.out.println("Brass.adjust()");
	}
}

class Woodwind extends Wind {
	public void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	
	public String what() { return "Woodwind"; }
}