package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 木管乐器
 * 
 * @author GT-R
 * @date 2015年3月27日 下午12:35:21
 */
class Woodwind extends Wind {
	void play(Note n) {
		System.out.println("Woodwind.play() " + n);
	}
	
	String what() {
		return "Woodwind";
	}
}
