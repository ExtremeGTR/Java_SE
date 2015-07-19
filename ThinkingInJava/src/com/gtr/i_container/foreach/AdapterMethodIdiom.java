package com.gtr.i_container.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * the "Adapter Method" idiom allows you to use foreach
 * with addtional kinds of Iterables
 * 
 * 需求:
 *   - 你希望在默认的向前迭代器的基础上, 添加产生反向迭代器的能力
 * 
 * 问题:
 *   - 不能覆盖iterator()方法
 *   
 * 解决:
 *   - 添加一个能够产生Iterable对象的方法, 该对象可以用于foreach语句
 * 
 * @author GT-R
 * @date 2015年7月19日 下午2:56:42
 */
public class AdapterMethodIdiom {
	public static void main(String[] args) {
		ReversiableArrayList<String> ral =
				new ReversiableArrayList<String>(
						Arrays.asList("To be or not to be".split(" ")));
		
		// grabs the ordinary iterator via iterator()
		for (String s : ral) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		// hand it the Iterable of your choice
		for (String s : ral.reversed()) {
			System.out.print(s + " ");
		}
	}
}

class ReversiableArrayList<T> extends ArrayList<T> {
	private static final long serialVersionUID = 3657179677557417352L;
	
	public ReversiableArrayList(Collection<T> c) {
		super(c);
	}
	
	// core
	public Iterable<T> reversed() {
		return new Iterable<T>() {
			@Override
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;
					
					@Override
					public boolean hasNext() { return current > -1; }

					@Override
					public T next() { return get(current--); }
					
					// not implemented
					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}