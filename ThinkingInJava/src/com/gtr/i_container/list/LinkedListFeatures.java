package com.gtr.i_container.list;

import java.util.LinkedList;

/**
 * 链表特性
 *   - LinkedList也是List的实现
 *   
 *   - LinkedList还有栈, 队列或双端队列的方法
 * 
 * @author GT-R
 * @date 2015年4月27日 上午11:10:06
 */
public class LinkedListFeatures {
	public static void main(String[] args) {
		LinkedList<Integer> iList = new LinkedList<Integer>(ListFeatures.generate(0, 10));
		System.out.println(iList);
		// identical
		System.out.println("iList.getFirst(): " + iList.getFirst());
		System.out.println("iList.element(): " + iList.element());
		// only differs in empty-list behavior
		System.out.println("iList.peek(): " + iList.peek());
		// identical; remove and return the first element
		System.out.println("iList.remove(): " + iList.remove());
		System.out.println("iList.removeFirst(): " + iList.removeFirst());
		// only differs in empty-list behavior
		System.out.println("iList.poll(): " + iList.poll());
		System.out.println(iList);
		iList.addFirst(new Integer(2));
		System.out.println("After addFirst(): " + iList);
		iList.offer(3);
		System.out.println("After offer(): " + iList);
		iList.add(11);
		System.out.println("After add(): " + iList);
		iList.addLast(20);
		System.out.println("After addLast(): " + iList);
		System.out.println("After removeLast(): " + iList.removeLast());
	}
}
