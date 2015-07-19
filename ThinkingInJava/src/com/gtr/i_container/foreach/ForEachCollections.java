package com.gtr.i_container.foreach;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * all collection work with foreach
 * 
 * foreach语法是可以应用于任何Collection对象
 * 
 * @author GT-R
 * @date 2015年7月19日 下午1:53:22
 */
public class ForEachCollections {
	public static void main(String[] args) {
		Collection<String> cs = new LinkedList<String>();
		Collections.addAll(cs, "Take the long way home".split(" "));
		for (String s : cs) {
			System.out.print("'" + s + "' ");
		}
	}
}
