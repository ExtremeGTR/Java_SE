package com.gtr.e_reusing_classes.inheritance;

/**
 * 继承
 *   - 继承语法: sub-class extends base-class
 *   
 *   = 继承中, 一般的规则是将所有的数据成员指定为private,
 *     将有所的方法都指定为public或protected, 然后根据自身需求再作出调整
 *     
 *   - Java中super关键字表示超类的意思, 当前类就是从超类继承来的  
 *     
 *   - 可以为每个类都创建一个main方法, 这种技术可以使得每个类的单元测试都变得简便易行,
 *     并且完成测试后也无需删除, 可以将其留待下次测试
 * 
 * @author GT-R
 * @date 2015年3月21日 下午2:09:18
 */
public class Detergent extends Cleanser {
	// change a method
	public void scrub() {
		append(" Detergent.scrub()");
		super.scrub(); // call base-class version
	}
	
	// add methods to the interface
	public void foam() { append(" foam()"); }
	
	public static void main(String[] args) {
		Detergent x = new Detergent();
		x.dilute();
		x.apply();
		x.scrub();
		x.foam();
		System.out.println(x);
		System.out.println("testing base class: ");
		Cleanser.main(args);
	}
}

class Cleanser {
	private String s = "Cleanser";
	
	public void append(String msg) { s += msg; }
	
	public void dilute() { append(" dilute()"); };
	
	public void apply() { append(" apply()"); }
	
	public void scrub() { append(" scrub()"); }
	
	public String toString() { return s; }
	
	public static void main(String[] args) {
		Cleanser x = new Cleanser();
		x.dilute();
		x.apply();
		x.scrub();
		System.out.println(x);
	}
	
	void h() { }
}