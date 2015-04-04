package com.gtr.g_interface.adapting_to_interface;

import java.util.Random;

/**
 * 一个未实现Readable的类
 * 
 * @author GT-R
 * @date 2015年4月2日 下午7:02:24
 */
public class RandomDoubles {
	private static Random rand = new Random(47);
	
	public double next() { return rand.nextDouble(); }
	
	public static void main(String[] args) {
		RandomDoubles rd = new RandomDoubles();
		for (int i = 0; i < 7; i++) {
			System.out.println(rd.next());
		}
	}
}