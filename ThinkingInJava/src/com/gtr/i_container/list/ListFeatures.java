package com.gtr.i_container.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * List特性
 *   - ArrayList, 擅长随机访问其中的元素, 但在其中间插入或移除元素时较慢
 *   
 *   - LinkedList, 在其中间进行插入或删除的动作是比较快的, 但随机访问相对较慢, 特性比ArrayList多
 *   
 *   - 每当需要确定一个元素是否被某个List包含,
 *     获取一个元素在某个List中的所以,
 *     以及从某个List中移除一个元素,
 *     这3种情况都会用到equals()方法
 * 
 * @author GT-R
 * @date 2015年4月19日 下午10:34:31
 */
public class ListFeatures {
	@SuppressWarnings(value="all")
	public static void main(String[] args) {
		Random rand = new Random(47);
		
		List<Integer> iList = generate(0, 6);
		System.out.println("1: " + iList);
		
		iList.add(7); // automatically resizes
		System.out.println("2: " + iList);
		
		System.out.println("3: " + iList.contains(2));
		
		iList.remove(2); // remove by object
		
		Integer target = iList.get(2);
		System.out.println("4: " + target + " " + iList.indexOf(target));
		
		Integer iVal = new Integer(3);
		System.out.println("5: " + iList.indexOf(iVal));
		System.out.println("6: " + iList.remove(iVal));
		
		// must be the exact object
		System.out.println("7: " + iList.remove(target));
		System.out.println("8: " + iList);
		
		iList.add(3, 10); // insert at an index
		System.out.println("9: " + iList);
		
		List<Integer> subList = iList.subList(1, 4);
		System.out.println("subList: " + subList);
		
		System.out.println("10: " + iList.containsAll(subList));
		
		Collections.sort(subList); // in-place sort
		System.out.println("sort subList: " + subList);
		
		// order is not important in containsAll()
		iList.containsAll(subList);
		System.out.println("11: " + iList.containsAll(subList));
		
		Collections.shuffle(subList, rand); // mix it up
		System.out.println("shuffled subList: " + subList);
		System.out.println("12: " + iList.containsAll(subList));
		
		List<Integer> copyList = new ArrayList<Integer>(iList);
		subList = Arrays.asList(iList.get(1), iList.get(4));
		System.out.println("subList: " + subList);
		
		copyList.retainAll(subList);
		System.out.println("13: " + copyList);
		
		copyList = new ArrayList<Integer>(iList); // get a fresh copy
		copyList.remove(2); // remove by index
		System.out.println("14: " + copyList);
		
		copyList.removeAll(subList); // only removes exact objects
		System.out.println("15: " + copyList);
		
		copyList.set(1, new Integer(47)); // replace an element
		System.out.println("16: " + copyList);
		
		copyList.addAll(2, subList); // insert a list in the middle
		System.out.println("17: " + copyList);
		
		System.out.println("18: " + iList.isEmpty());
		
		iList.clear(); // remove all elements
		System.out.println("19: " + iList);
		System.out.println("20: " + iList.isEmpty());
		
		iList.addAll(generate(3, 4));
		System.out.println("21: " + iList);
		
		Object[] oArr = iList.toArray();
		System.out.println("22: " + oArr[3]);
		
		Integer[] iArr = iList.toArray(new Integer[0]);
		System.out.println("23: " + iArr[3]);
	}
	
	public static List<Integer> generate(int initialValue, int size) {
		ArrayList<Integer> iList = new ArrayList<Integer>();
		for (int i = 0; i < size; i++) {
			iList.add(initialValue + i);
		}
		return iList;
	}
}