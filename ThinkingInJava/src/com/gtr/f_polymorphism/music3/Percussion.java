package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 打击乐器
 * 
 * @author GT-R
 * @date 2015年3月27日 上午11:48:03
 */
class Percussion extends Instrument {
	void play(Note n) {
		System.out.println("Percussion.play() " + n);
	}
	
	String what() {
		return "Percussion"; 
	}
	
	void adjust() {
		System.out.println("Adjusting Percussion");
	}
}
