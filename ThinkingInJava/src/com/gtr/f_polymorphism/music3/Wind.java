package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 管乐器
 * 
 * @author GT-R
 * @date 2015年3月27日 上午11:42:17
 */
class Wind extends Instrument {
	void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
	
	String what() {
		return "Wind";
	}
	
	void adjust() {
		System.out.println("Adjusting Wind");
	}
}
