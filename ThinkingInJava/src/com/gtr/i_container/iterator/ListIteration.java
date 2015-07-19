package com.gtr.i_container.iterator;

import java.util.List;
import java.util.ListIterator;

import com.gtr.i_container.list.ListFeatures;

/**
 * ListIterator
 *   - 这个迭代器是Iterator的子类型, 只能作用于List类型,
 *     并且它可以双向移动
 * 
 * @author GT-R
 * @date 2015年4月25日 下午2:09:21
 */
public class ListIteration {
	public static void main(String[] args) {
		List<Integer> iList = ListFeatures.generate(0, 10);
		ListIterator<Integer> it = iList.listIterator();
		while (it.hasNext()) {
			System.out.print(it.next() + ", " + it.nextIndex() +
				", " + it.previousIndex() + "; ");
		}
		System.out.println();
		
		// backwards
		while (it.hasPrevious()) {
			System.out.print(it.previous() + " ");
		}
		System.out.println();
		System.out.println(iList);
		
		it = iList.listIterator(3);
		while (it.hasNext()) {
			it.next();
			it.set(17);
		}
		System.out.println(iList);
	}
}
