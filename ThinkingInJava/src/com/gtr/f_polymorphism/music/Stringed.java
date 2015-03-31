package com.gtr.f_polymorphism.music;

import com.gtr.f_polymorphism.Note;

/**
 * 弦乐器
 * 
 * @author GT-R
 * @date 2015年3月25日 下午2:33:51
 */
class Stringed extends Instrument {
	public void play(Note n) {
		System.out.println("Stringed.play() " + n);
	}
}
