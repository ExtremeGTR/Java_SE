package com.gtr.b_controlling_execution;

/**
 * foreach遍历整形数组
 *   - generate()方法直接用在foreach中,
 *     可以当家可读性, 但它的效率会稍微降低
 * 
 * @author GT-R
 * @date 2015年3月10日 下午12:00:39
 */
public class ForEachInt {
	public static void main(String[] args) {
		for (int i : generate(10)) { // 0..9
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : generate(5, 10)) { // 5..9
			System.out.print(i + " ");
		}
		System.out.println();
		for (int i : generate(5, 20, 3)) { // 5..20 step 3
			System.out.print(i + " ");
		}
	}
	
	static int[] generate(int size) {
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = i;
		}
		return arr;
	}
	
	static int[] generate(int start, int end) {
		int size = end - start;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++) {
			arr[i] = start + i;
		}
		return arr;
	}
	
	static int[] generate(int start, int end, int step) {
		int size = (end - start) / step;
		int[] arr = new int[size];
		for (int i = 0; i < size; i++, start += step) {
			arr[i] = start;
		}
		return arr;
	}
}
