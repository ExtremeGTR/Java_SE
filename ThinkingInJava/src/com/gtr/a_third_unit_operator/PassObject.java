package com.gtr.a_third_unit_operator;

/**
 * Java中所有方法都是按值传递的
 *   - 方法的参数类型为类类型时, 便可以通过该引用修改所指向对象的值
 * 
 * @author GT-R
 * @date 2015年2月24日 下午3:13:40
 */
public class PassObject {
	static void f(Letter letter) {
		letter.c = 'z';
	}
	
	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c = " + x.c);
		f(x);
		System.out.println("2: x.c = " + x.c);
	}
}

class Letter {
	char c;
}
