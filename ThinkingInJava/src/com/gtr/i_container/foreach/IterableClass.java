package com.gtr.i_container.foreach;

import java.util.Iterator;

/**
 * anything Iterable works with foreach
 * 
 * 任何实现Iterable接口的类, 都能把它用在foreach中
 * 
 * @author GT-R
 * @date 2015年7月19日 下午2:09:14
 */
public class IterableClass implements Iterable<String> {
	protected String[] words = ("And that is how " +
			"we know the Earth to be banana-shaped.").split(" ");
	
	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;
			
			@Override
			public String next() {
				return words[index++];
			}
			
			@Override
			public boolean hasNext() {
				return index < words.length;
			}

			// not implemented
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for (String s : new IterableClass()) {
			System.out.print(s + " ");
		}
	}
}
