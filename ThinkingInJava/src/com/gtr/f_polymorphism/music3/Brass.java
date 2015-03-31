package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 铜管乐器
 * 
 * @author GT-R
 * @date 2015年3月27日 下午12:24:22
 */
class Brass extends Wind {
	void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
	
	String what() {
		return "Brass";
	}
	
	void adjust() {
		System.out.println("Adjusting Brass");
	}
}
