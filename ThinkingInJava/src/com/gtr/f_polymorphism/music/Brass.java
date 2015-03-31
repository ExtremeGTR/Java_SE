package com.gtr.f_polymorphism.music;

import com.gtr.f_polymorphism.Note;

/**
 * 铜管乐器
 * 
 * @author GT-R
 * @date 2015年3月25日 下午2:35:32
 */
class Brass extends Instrument {
	public void play(Note n) {
		System.out.println("Brass.play() " + n);
	}
}
