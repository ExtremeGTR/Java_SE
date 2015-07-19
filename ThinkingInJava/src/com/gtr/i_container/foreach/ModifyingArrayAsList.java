package com.gtr.i_container.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * 使用List容器构造器重新给Arrays.asList()生成的结果创建一个副本,
 * 那样在操作副本时就不会影响到原来的数组, 反之就会修改底层的数组顺序
 * 
 * @author GT-R
 * @date 2015年7月19日 下午3:34:42
 */
public class ModifyingArrayAsList {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Integer[] iArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		List<Integer> iList1 = new ArrayList<Integer>(Arrays.asList(iArr));
		
		System.out.println("before shuffling: " + iList1);
		Collections.shuffle(iList1, rand);
		System.out.println("after shuffling: " + iList1);
		System.out.println("array: " + Arrays.toString(iArr));
		
		List<Integer> iList2 = Arrays.asList(iArr);
		System.out.println("before shuffling: " + iList2);
		Collections.shuffle(iList2, rand);
		System.out.println("after shuffling: " + iList2);
		System.out.println("array: " + Arrays.toString(iArr));
	}
}
