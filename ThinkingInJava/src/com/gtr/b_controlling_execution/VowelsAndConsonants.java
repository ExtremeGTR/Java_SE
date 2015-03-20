package com.gtr.b_controlling_execution;

import java.util.Random;

/**
 * switch语句
 *   - 通用格式
 *     switch (integral-selector) {
 *       case intergral-value: statement; break;
 *       case intergral-value: statement; break;
 *       //...
 *       default: statement;
 *     }
 *   
 *   - switch语句是实现多路选择的一种方式, 但它必须使用一个选择因子
 *   
 * 判断随机生成字母是元音字母还是辅音字母
 * 
 * @author GT-R
 * @date 2015年3月11日 下午2:50:52
 */
public class VowelsAndConsonants {
	public static void main(String[] args) {
		Random rand = new Random(47);
		for (int i = 0; i < 100; i++) {
			int c = rand.nextInt(26) + 'a';
			System.out.print((char) c + ", " + c + ": ");
			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					System.out.println("vowel");
					break;
				case 'y':
				case 'w':
					System.out.println("sometimes a vowel");
					break;
				default:
					System.out.println("consonant");
					break;
			}
		}
	}
}
