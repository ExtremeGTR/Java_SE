package com.gtr.utils;

/**
 * @author GT-R
 * @date 2015年3月19日 下午2:36:20
 */
public class Range {
	// produce a sequence [0..n)
	public static int[] range(int n) {
		int[] result = new int[n];
		for (int i = 0; i < n; i++) {
			result[i] = i;
		}
		return result;
	}
	
	// produce a sequence [start..end)
	public static int[] range(int start, int end) {
		int size = end - start;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = start + i;
		}
		return result;
	}
	
	// produce a sequence [start..end) incrementing by step
	public static int[] range(int start, int end, int step) {
		int size = (end - start) / step;
		int[] result = new int[size];
		for (int i = 0; i < size; i++) {
			result[i] = start + (i * step);
		}
		return result;
	}
}
