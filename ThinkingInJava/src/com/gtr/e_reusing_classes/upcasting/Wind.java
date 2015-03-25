package com.gtr.e_reusing_classes.upcasting;

/**
 * Wind objects are instruments,
 * because they have the same interface
 * 
 * 向上转型
 *   - "为新的类提供方法" 并不是继承技术中最重要的方面,
 *     其最重要的方面是用来表现子类和父类之间的关系,
 *     即 "子类是父类的一种类型" "能够向父类发送的所有信息同样可以向子类发送"
 *     
 *   - 子类引用转换为父类引用的行为, 称之为向上转型
 * 
 * @author GT-R
 * @date 2015年3月23日 下午2:12:35
 */
public class Wind extends Instrument {
	public static void main(String[] args) {
		Wind flute = new Wind();
		Instrument.tune(flute);
	}
}

class Instrument {
	public void play() { }
	
	static void tune(Instrument i) {
		// ...
		i.play();
	}
}
