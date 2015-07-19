package com.gtr.i_container.set;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * Set
 *   - Set不保存重复的元素, 如果你试图将相同对象的多个实例添加到Set中,
 *     那么它会阻止这种重复现象
 *     
 *   - 查找是Set中最重要的操作, Set是基于对象的值来确定归属性的
 * 
 * @author GT-R
 * @date 2015年7月15日 下午7:30:11
 */
public class SetOfInteger {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Set<Integer> intSet = new HashSet<Integer>();
		for (int i = 0; i < 10000; i++) {
			intSet.add(rand.nextInt(30));
		}
		System.out.println(intSet);
	}
}
