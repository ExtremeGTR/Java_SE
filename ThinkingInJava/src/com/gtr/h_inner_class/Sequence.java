package com.gtr.h_inner_class;

/**
 * 内部类链接到外部类
 *   - 内部类拥有其外围类的所有元素的访问权,
 *     因此内部类可以直接访问其外围类的方法和字段
 *     
 *   - 当外围类的对象创建了一个内部类的对象时,
 *     此内部类对象必定会秘密地捕获一个指向那个外围类对象的引用,
 *     然后, 在访问此外围类的成员时, 就用那个引用来选择外围类的成员
 * 
 * @author GT-R
 * @date 2015年4月5日 下午2:26:48
 */
public class Sequence {
	private Object[] items;
	private int next = 0;
	
	public Sequence(int size) {
		items = new Object[size];
	}
	
	public void add(Object item) {
		if (next < items.length) {
			items[next++] = item;
		}
	}
	
	// 内部类访问外部类的成员
	private class SequenceSelector implements Selector {
		private int i = 0;
		
		public boolean end() {
			return i == items.length;
		}
		
		public Object current() {
			return items[i];
		}
		
		public void next() {
			if (i < items.length) {
				i++;
			}
		}
	}
	
	public Selector selector() {
		return new SequenceSelector();
	}
	
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for (int i = 0; i < 10; i++) {
			sequence.add(Integer.toString(i));
		}
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}

interface Selector {
	boolean end();
	
	Object current();
	
	void next();
}