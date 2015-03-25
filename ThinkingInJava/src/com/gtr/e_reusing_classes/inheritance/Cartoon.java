package com.gtr.e_reusing_classes.inheritance;

/**
 * 继承中类的构造顺序
 *   - 构建过程都是从父类"向外"扩展的,
 *     父类在子类构造器可以访问它之前, 就已经确保父类已经构造完成了
 *   
 * 
 * @author GT-R
 * @date 2015年3月21日 下午4:05:04
 */
public class Cartoon extends Drawing {
	public Cartoon() {
		System.out.println("Cartoon constructor");
	}
	
	public static void main(String[] args) {
		Cartoon cartoon = new Cartoon();
		System.out.println(cartoon);
	}
}

class Art {
	Art() {
		System.out.println("Art constructor");
	}
}

class Drawing extends Art {
	Drawing() {
		System.out.println("Drawing constructor");
	}
}