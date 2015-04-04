package com.gtr.g_interface.adapting_to_interface;

import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

/**
 * implementing an interface to conform to a method
 * 
 * 接口的一种常见用法就是策略设计模式
 *   - 编写一个执行某些操作的方法, 而该方法将接受一个同样是自己指定的接口;
 *     此时, 等同于自己向使用者声明:
 *     "你可以用任何你想要的对象来调用我的方法, 只要你的对象遵循我的接口";
 *     这使得自己的方法更加灵活, 通用, 并更具复用性
 *   
 *   - Scanner类的构造器接受Readable接口类型的参数, 自己所创建的类要作用于Scanner, 那就让它成为Readable
 *     Readable接口只要求实现read()方法, 在read()内部, 将输入内容添加到CharBuffer参数中, 没有输入的时候返回-1
 * 
 * @author GT-R
 * @date 2015年4月2日 下午12:50:32
 */
public class RandomWords implements Readable {
	private static final char[] CAPITALS =
		"ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
	private static final char[] LOWERS =
		"abcdefghijklmnopqrstuvwxyz".toCharArray();
	private static final char[] VOWELS =
		"aeiou".toCharArray();
	
	private static Random rand = new Random(47);

	private int count;
	
	public RandomWords(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1; // indicates end of input
		}
		cb.append(CAPITALS[rand.nextInt(CAPITALS.length)]);
		for (int i = 0; i < 4; i++) {
			cb.append(VOWELS[rand.nextInt(VOWELS.length)]);
			cb.append(LOWERS[rand.nextInt(LOWERS.length)]);
		}
		cb.append(" ");
		return 10; // number of characters appended
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new RandomWords(10));
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}
