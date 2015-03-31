package com.gtr.f_polymorphism.music3;

import com.gtr.f_polymorphism.Note;

/**
 * 多态
 *   - 其中tune和tuneAll方法就是运用多态特性,
 *     多态是一项让程序员"将改变的事物和未变的事物分离开来"的重要技术
 * 
 * @author GT-R
 * @date 2015年3月27日 下午1:25:09
 */
public class Music3 {
	public static void tune(Instrument i) {
		// ...
		i.play(Note.MIDDLE_C);
	}
	
	public static void tuneAll(Instrument[] iArr) {
		for (Instrument i : iArr) {
			tune(i);
		}
	}
	
	public static void main(String[] args) {
		Instrument[] orchestra = {
			new Wind(),
			new Percussion(),
			new Stringed(),
			new Brass(),
			new Woodwind()
		};
		
		tuneAll(orchestra);
	}
}
