package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 乐器
 * 
 * @author GT-R
 * @date 2015年3月27日 上午11:36:17
 */
class Instrument {
	void play(Note n) {
		System.out.println("Instrument.play() " + n);
	}
	
	String what() {
		return "Instrument";
	}
	
	void adjust() {
		System.out.println("Adjusting Instrument");
	}
}
