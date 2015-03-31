package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 弦乐器
 * 
 * @author GT-R
 * @date 2015年3月27日 下午12:04:37
 */
class Stringed extends Instrument {
	void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
	
	String what() {
		return "Stringed";
	}
	
	void adjust() {
		System.out.println("Adjusting Stringed");
	}
}
