package com.gtr.i_container.basic;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Collection接口概括了序列的概念
 *   - 一个独立元素的序列, 这些元素都服从一条或多条规则
 *   
 *   - 所有的Collection都可以用foreach语法遍历,
 *     List, Queue, Set都是Collection
 *   
 * @author GT-R
 * @date 2015年4月17日 下午3:32:04
 */
public class SimpleCollection {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			collection.add(i);
		}
	}
}
