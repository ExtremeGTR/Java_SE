package com.gtr.e_reusing_classes.protected_keyword;

/**
 * 关键字protected
 *   - 它指明 "就类用户而言, 这就是private的,
 *     但对于任何继承于此类的子类而言或其他任何位于同一个包内的类来说, 它却可以访问的"
 * 
 * @author GT-R
 * @date 2015年3月23日 下午1:43:27
 */
public class Orc extends Villain {
	private int orcNumber;
	
	public Orc(String name, int orcNumber) {
		super(name);
		this.orcNumber = orcNumber;
	}
	
	public void change(String name, int orcNumber) {
		set(name); // available because it's protected
		this.orcNumber = orcNumber;
	}
	
	public String toString() {
		return "Orc " + orcNumber + ": " + super.toString();
	}
	
	public static void main(String[] args) {
		Orc orc = new Orc("Limburger", 12);
		System.out.println(orc);
		orc.change("Bob", 19);
		System.out.println(orc);
	}
}

class Villain {
	private String name;
	
	protected void set(String name) {
		this.name = name;
	}
	
	public Villain(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "I'm a Villain and my name is " + name;
	}
}