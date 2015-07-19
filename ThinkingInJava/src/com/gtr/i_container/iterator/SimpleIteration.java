package com.gtr.i_container.iterator;

import java.util.Iterator;
import java.util.List;

import com.gtr.i_container.list.ListFeatures;

/**
 * 迭代器
 *   - 迭代器是一个对象, 它的主要工作就是遍历并选择序列中的对象,
 *     而客户端程序员无需关心该序列的底层结构; 并且它是一种设计模式
 *     
 *   - 方法简介
 *     1.iterator(), 要求容器返回一个Iterator
 *     2.next(), 获取序列中的下一个元素
 *     3.hasNext(), 检查序列中是否还有下一个元素
 *     4.remove(), 将当前迭代器所指向的元素删除
 *   
 * @author GT-R
 * @date 2015年4月23日 下午2:39:16
 */
public class SimpleIteration {
	public static void main(String[] args) {
		List<Integer> iList = ListFeatures.generate(0, 10);
		Iterator<Integer> it = iList.iterator();
		while (it.hasNext()) {
			Integer iVal = it.next();
			System.out.print(iVal + " ");
		}
		System.out.println();
		
		// a simpler approach, when possible
		for (Integer i : iList) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		// an iterator can also remove elements
		it = iList.iterator();
		for (int i = 0; i < 6; i++) {
			it.next();
			it.remove();
		}
		System.out.println(iList);
	}
}
