package com.gtr.utils;

import java.util.LinkedList;

/**
 * making a stack from a LinkedList
 * 
 * 通过LinkedList作为底层创建自定义Stack类型
 * 
 * @author GT-R
 * @date 2015年5月1日 下午10:31:12
 */
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();
	
	public void push(T item) { storage.addFirst(item); }
	public T peek() { return storage.getFirst(); }
	public T pop() { return storage.removeFirst(); }
	public boolean isEmpty() { return storage.isEmpty(); }
	public String toString() { return storage.toString(); }
}
