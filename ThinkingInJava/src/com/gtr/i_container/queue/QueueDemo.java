package com.gtr.i_container.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

/**
 * 队列
 *   - 队列是一个典型的先进先出(FIFO)容器,
 *     从容器的一端放入事物, 从另一端取出,
 *     并且事物放入容器的顺序与取出的顺序是相同的
 *     
 *   - 队列在并发编程中特别重要
 *     
 *   - LinkedList是Queue的一种实现, 因此它可以作为队列使用
 *   
 *   - offer()是将一个元素插入到队尾
 *     
 *   - peek()和element()都在不移除元素的情况下返回队头元素,
 *     但是在队列为空时, peek()会返回null, 而element()会抛出NoSuchElementException异常
 *       
 *   - poll()和remove()都是移除并返回队头,
 *     但是在队列为空时, poll()会返回null, 而remove()会抛出NoSuchElementException异常
 * 
 * @author GT-R
 * @date 2015年7月17日 下午4:36:48
 */
public class QueueDemo {
	@SuppressWarnings("rawtypes")
	public static void printQueue(Queue queue) {
		while (queue.peek() != null) {
			System.out.print(queue.remove() + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++) {
			queue.offer(rand.nextInt(i + 10));
		}
		printQueue(queue);
		
		Queue<Character> qc = new LinkedList<Character>();
		for (char c : "Brontosaurus".toCharArray()) {
			qc.offer(c);
		}
		printQueue(qc);
	}
}