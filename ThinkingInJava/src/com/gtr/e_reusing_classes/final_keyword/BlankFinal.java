package com.gtr.e_reusing_classes.final_keyword;

/**
 * 空白final
 *   - 这指的是声明为final但又未给定初始值的数据成员
 *   
 *   - 空白final数据成员如果没有在定义处进行初始化, 那样必须在构造器中对它进行赋值
 *     不然编译器会在构造器处报错: The blank final field xxx may not have been initialized
 *     
 *   - 由此我们可以知道final数据成员只能在2处地方给定值: 1.定义处, 2.构造器
 *   
 * @author GT-R
 * @date 2015年3月24日 下午2:25:51
 */
public class BlankFinal {
	private final int i = 0; // initialized final
	private final int j; // blank final
	private final Poppet p; // blank final reference
	
	public BlankFinal() {
		j = 1; // intialize blank final
		p = new Poppet(1); // initialized blank final reference
	}
	
	public BlankFinal(int x) {
		j = x; // initialize blank final
		p = new Poppet(x); // initialize blank final reference
	}
	
	public String toString() {
		return "i = " + i + ", j = " + j + ", p = " + p;
	}
	
	
	public static void main(String[] args) {
		BlankFinal bf1 = new BlankFinal();
		BlankFinal bf2 = new BlankFinal(47);
		System.out.println(bf1);
		System.out.println(bf2);
	}
}

class Poppet {
	private int i;
	
	public Poppet(int i) {
		this.i = i;
	}
	
	public String toString() {
		return "" + i;
	}
}
