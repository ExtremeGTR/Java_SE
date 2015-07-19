package com.gtr.i_container.set;

import java.util.Set;
import java.util.TreeSet;

import com.gtr.utils.TextFile;

/**
 * 
 *  - 如果你想要按照字母排序的, 那么可以向TreeSet传入String.CASE_INSENTIVE_ORDER
 * 
 * @author GT-R
 * @date 2015年7月17日 上午1:11:09
 */
public class UniqueWordsAlphabetic {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(
				String.CASE_INSENSITIVE_ORDER);
		words.addAll(new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}
