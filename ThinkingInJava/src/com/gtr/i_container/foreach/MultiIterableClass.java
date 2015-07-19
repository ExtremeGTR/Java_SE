package com.gtr.i_container.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * 多种适配器方法
 * 
 * @author GT-R
 * @date 2015年7月19日 下午3:19:46
 */
public class MultiIterableClass extends IterableClass {
	public Iterable<String> reversed() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				return new Iterator<String>() {
					int current = words.length - 1;
					
					@Override
					public String next() { return words[current--]; }
					
					@Override
					public boolean hasNext() { return current > -1; }
					
					// not implemented
					@Override
					public void remove() {
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
	
	public Iterable<String> randomlized() {
		return new Iterable<String>() {
			@Override
			public Iterator<String> iterator() {
				List<String> shuffled = 
						new ArrayList<String>(Arrays.asList(words));
				Collections.shuffle(shuffled, new Random(47));
				return shuffled.iterator();
			}
		};
	}
	
	public static void main(String[] args) {
		MultiIterableClass mic = new MultiIterableClass();
		for (String s : mic.reversed()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (String s : mic.randomlized()) {
			System.out.print(s + " ");
		}
		System.out.println();
		
		for (String s : mic) {
			System.out.print(s + " ");
		}
	}
}