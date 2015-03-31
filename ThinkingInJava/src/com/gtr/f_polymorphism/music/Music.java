package com.gtr.f_polymorphism.music;

import com.gtr.f_polymorphism.Note;

/**
 * 向上转型特性
 *   - 把子类对象的引用视为父类类型的引用
 * 
 * @author GT-R
 * @date 2015年3月25日 下午2:29:38
 */
public class Music {
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		tune(flute);
	}
}
