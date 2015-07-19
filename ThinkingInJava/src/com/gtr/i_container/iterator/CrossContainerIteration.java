package com.gtr.i_container.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

import com.gtr.i_container.list.ListFeatures;

/**
 * 跨容器使用迭代器进行遍历
 *   - 迭代器能够将遍历序列的操作与序列底层的结构分离
 * 
 * @author GT-R
 * @date 2015年4月23日 下午2:50:18
 */
public class CrossContainerIteration {
	public static void display(Iterator<Integer> it) {
		while (it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> iList = (ArrayList<Integer>) ListFeatures.generate(0, 10);
		LinkedList<Integer> iList2 = new LinkedList<Integer>(iList);
		HashSet<Integer> iHS = new HashSet<Integer>(iList);
		TreeSet<Integer> iTS = new TreeSet<Integer>(iList);
		
		display(iList.iterator());
		display(iList2.iterator());
		display(iHS.iterator());
		display(iTS.iterator());
	}
}
