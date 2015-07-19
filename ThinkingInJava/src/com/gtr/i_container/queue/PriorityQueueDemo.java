package com.gtr.i_container.queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

/**
 * 优先级队列(PriorityQueue)
 *   - 优先级队列声明下一个弹出元素是最需要的元素(即具有最高优先级)
 *   
 *   - 在PriorityQueue插入一个对象时, 这个对象会在队列中被排序,
 *     默认使用对象在队列中的自然排序, 或者通过提供自己的Comparator来修改排序规则
 * 
 * @author GT-R
 * @date 2015年7月17日 下午10:14:27
 */
public class PriorityQueueDemo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue =
				new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			priorityQueue.offer(rand.nextInt(i + 10));
		}
		QueueDemo.printQueue(priorityQueue);
		
		List<Integer> iList = Arrays.asList(25, 22, 20, 18, 14,
				9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(iList);
		QueueDemo.printQueue(priorityQueue);
		
		priorityQueue = new PriorityQueue<Integer>(
				iList.size(), Collections.reverseOrder());
		priorityQueue.addAll(iList);
		QueueDemo.printQueue(priorityQueue);
		
		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strList = Arrays.asList(fact.split(""));
		PriorityQueue<String> strPQ = new PriorityQueue<String>(strList);
		QueueDemo.printQueue(strPQ);
		
		strPQ = new PriorityQueue<String>(
				strList.size(), Collections.reverseOrder());
		strPQ.addAll(strList);
		QueueDemo.printQueue(strPQ);
		
		Set<Character> charSet = new HashSet<Character>();
		for (char c : fact.toCharArray()) {
			charSet.add(c); // autoboxing
		}
		PriorityQueue<Character> charPQ =
				new PriorityQueue<Character>(charSet);
		QueueDemo.printQueue(charPQ);
	}
}
