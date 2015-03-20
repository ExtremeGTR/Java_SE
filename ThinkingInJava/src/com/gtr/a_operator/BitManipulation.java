package com.gtr.a_operator;

import java.util.Random;

/**
 * 位操作符
 * 
 * @author GT-R
 * @date 2015年3月2日 下午2:15:30
 */
public class BitManipulation {
	public static void main(String[] args) {
		printBinaryInt("-1", -1);
		printBinaryInt("+1", +1);
		
		int maxpos = 2147483647;
		printBinaryInt("maxpos", maxpos);
		int maxneg = -2147483647;
		printBinaryInt("maxneg", maxneg);
		
		Random rand = new Random(47);
		int i = rand.nextInt();
		int j = rand.nextInt();
		printBinaryInt("i", i);
		printBinaryInt("~i", ~i);
		printBinaryInt("-i", -i);
		printBinaryInt("j", j);
		printBinaryInt("i & j", i & j);
		printBinaryInt("i | j", i | j);
		printBinaryInt("i ^ j", i ^ j);
		printBinaryInt("i << 5", i << 5);
		printBinaryInt("i >> 5", i >> 5);
		printBinaryInt("(~i) >> 5", (~i) >> 5);
		printBinaryInt("i >>> 5", i >>> 5);
		printBinaryInt("(~i) >>> 5", (~i) >>> 5);
		
		printBinaryLong("-1L", -1L);
		printBinaryLong("+1L", +1L);
		long maxLong = 9223372036854775807L;
		printBinaryLong("maxLong", maxLong);
		long maxLong2 = -9223372036854775808L;
		printBinaryLong("maxLong2", maxLong2);
		
		long u = rand.nextLong();
		long v = rand.nextLong();
		printBinaryLong("u", u);
		printBinaryLong("~u", ~u);
		printBinaryLong("-u", -u);
		printBinaryLong("v", v);
		printBinaryLong("u & v", u & v);
		printBinaryLong("u | v", u | v);
		printBinaryLong("u ^ v", u ^ v);
		printBinaryLong("u << 5", u << 5);
		printBinaryLong("u >> 5", u >> 5);
		printBinaryLong("(~u) >> 5", (~u) >> 5);
		printBinaryLong("u >>> 5", u >>> 5);
		printBinaryLong("(~u) >>> 5", (~u) >>> 5);
	}
	
	static void printBinaryInt(String strExp, int i) {
		System.out.println(strExp + ", int: " + i + ", binary:\n   " +
				Integer.toBinaryString(i));
	}
	
	static void printBinaryLong(String strExp, long l) {
		System.out.println(strExp + ", long: " + l + ", binary:\n  " +
				Long.toBinaryString(l));
	}
}
