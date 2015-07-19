package com.gtr.i_container.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * adding groups of elements to Collection object
 * 
 * 给Collection添加一组元素
 *   - 3种方法, 最方便的是方法3, 同时配合Arrays.asList()一起使用会更加灵活
 *       1.Collection构造器接受另一个Collection对象
 *       2.Collection.addAll()方法, 这种方法运行起来更快
 *       3.创建一个不包含任何元素的Collection, 再调用Collections.addAll()
 *   
 *   - Arrays.asList()方法生成的List, 其底层表示的是数组,
 *     因此, 不能改变该方法所生成List的尺寸,
 *     如果使用add()或delete()等改变列表尺寸的操作, 则会抛出UnsupportedOperationException
 * 
 * @author GT-R
 * @date 2015年4月18日 上午10:28:46
 */
public class AddingGroups {
	public static void main(String[] args) {
		Collection<Integer> collection =
			new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		
		// runs significantly faster, but you can't
		// construct a Collection this way
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		
		// produces a list "backed by" an array
		List<Integer> iList = Arrays.asList(16, 17, 18, 19, 20);
		// ok -- modify an element
		iList.set(1, 99); 
		// runtime error because the underlying array can't be resized
		//! iList.add(21);    
	}
}