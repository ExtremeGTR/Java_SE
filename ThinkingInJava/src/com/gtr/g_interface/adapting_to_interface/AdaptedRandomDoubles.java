package com.gtr.g_interface.adapting_to_interface;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * 再次使用适配器模式, 使得生成的既是RandomDoubles又是Readable的新类
 *   - 可以在任何现有类上添加新的接口, 这意味着让方法接受接口类型,
 *     是一种让任何类都可以对该方法进行适配的方式
 * 
 * @author GT-R
 * @date 2015年4月2日 下午8:21:53
 */
public class AdaptedRandomDoubles extends RandomDoubles 
		implements Readable {
	private int count;
	
	public AdaptedRandomDoubles(int count) {
		this.count = count;
	}
	
	public int read(CharBuffer cb) {
		if (count-- == 0) {
			return -1;
		}
		String result = Double.toString(next()) + " ";
		cb.append(result);
		return result.length();
	}
	
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(new AdaptedRandomDoubles(7));
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
	}
}