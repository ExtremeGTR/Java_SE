package com.gtr.i_container.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * containers print themselves automatically
 * 
 * 打印容器
 *   - 容器默认的打印行为即可生成可读性很好的结果
 *   
 *   - 各种容器的特质
 *     1.ArrayList和LinkedList都是List类型, 这类容器是按照插入的顺序保存元素
 *     2.HashSet和TreeSet以及LinkedHashSet都是Set类型, 每个相同的元素只能被保存一次
 *     3.HashMap和TreeMap以及LinkedHashMap都是Map类型, Map也被称为关联数组, 存储的是键值对
 * 
 * @author GT-R
 * @date 2015年4月19日 下午2:25:31
 */
public class PrintingContainers {
	@SuppressWarnings("rawtypes")
	static Collection fill(Collection<String> collection) {
		collection.add("rat");
		collection.add("cat");
		collection.add("dog");
		collection.add("dog");
		return collection;
	}
	
	@SuppressWarnings("rawtypes")
	static Map fill(Map<String, String> map) {
		map.put("rat", "Fuzzy");
		map.put("cat", "Rags");
		map.put("dog", "Bosco");
		map.put("dog", "Spot");
		return map;
	}
	
	public static void main(String[] args) {
		System.out.println(fill(new ArrayList<String>()));
		System.out.println(fill(new LinkedList<String>()));
		System.out.println(fill(new HashSet<String>()));
		System.out.println(fill(new TreeSet<String>()));
		System.out.println(fill(new LinkedHashSet<String>()));
		System.out.println(fill(new HashMap<String, String>()));
		System.out.println(fill(new TreeMap<String, String>()));
		System.out.println(fill(new LinkedHashMap<String, String>()));
	}
}
