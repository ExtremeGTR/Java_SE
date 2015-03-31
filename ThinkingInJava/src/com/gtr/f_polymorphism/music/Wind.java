package com.gtr.f_polymorphism.music;

import com.gtr.f_polymorphism.Note;

/**
 * Wind objects are instruments,
 * because they have the same interface
 * 
 * 管乐器
 * 
 * @author GT-R
 * @date 2015年3月25日 下午2:25:07
 */
public class Wind extends Instrument {
	// redefine interface method
	public void play(Note n) {
		System.out.println("Wind.play() " + n);
	}
}
