package com.gtr.i_container.set;

import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * TreeSet
 *   - TreeSet将元素存储在红黑树中,
 *     如果你想对结果进行排序, 一种方式时使用TreeSet
 * 
 * @author GT-R
 * @date 2015年7月15日 下午8:53:39
 */
public class SortedSetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		SortedSet<Integer> intSet = new TreeSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
	}
}
