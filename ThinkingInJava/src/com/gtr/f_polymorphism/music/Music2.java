package com.gtr.f_polymorphism.music;

import com.gtr.f_polymorphism.Note;

/**
 * 不使用向上转型
 *   - 让tune方法接受更具体的乐器类型似乎会更加直观,
 *     但这样会引发一个问题: "如果这样做, 这就需要为系统内的每种子类型都编写一个新的tune方法"
 *     
 *   - 这意味着开始时就需要做更多的编程, 这也意味着添加新类型时需要做更多的工作;
 *     此外, 如果忘记重载某个方法, 编译器不会返回任何错误信息,
 *     这样关于类型的整个处理过程就变得难以操纵, 每增加一种类型都要投入更多额外的精力去管理
 * 
 * @author GT-R
 * @date 2015年3月25日 下午2:39:24
 */
public class Music2 {
	public static void tune(Wind i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Stringed i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void tune(Brass i) {
		i.play(Note.MIDDLE_C);
	}
	
	public static void main(String[] args) {
		Wind flute = new Wind();
		Stringed violin = new Stringed();
		Brass frenchHorn = new Brass();
		tune(flute);
		tune(violin);
		tune(frenchHorn);
	}
}










