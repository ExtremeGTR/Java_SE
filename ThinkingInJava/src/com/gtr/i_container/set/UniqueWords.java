package com.gtr.i_container.set;

import java.util.Set;
import java.util.TreeSet;

import com.gtr.utils.TextFile;

/**
 * @author GT-R
 * @date 2015年7月16日 下午4:38:36
 */
public class UniqueWords {
	public static void main(String[] args) {
		Set<String> words = new TreeSet<String>(
				new TextFile("SetOperations.java", "\\W+"));
		System.out.println(words);
	}
}
