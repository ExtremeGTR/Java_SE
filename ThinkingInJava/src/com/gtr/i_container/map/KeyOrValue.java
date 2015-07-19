package com.gtr.i_container.map;

import java.util.HashMap;
import java.util.Map;

/**
 * Map的键值对
 *   - containsKey()和containsValue()查看一个Map是否包含某个键或某个值
 *   
 *   - keySet()返回Map中所有键组成的Set, values()返回Map中所有值组成的Collection
 * 
 * @author GT-R
 * @date 2015年7月17日 上午11:58:51
 */
public class KeyOrValue {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		System.out.println(map);
		
		Integer number = map.get("three");
		System.out.println(number);
		boolean containsKey = map.containsKey("two");
		boolean containsValue = map.containsValue(4);
		System.out.println(containsKey);
		System.out.println(containsValue);
		
		System.out.println("--------------------");
		
		System.out.println("keySet: " + map.keySet());
		System.out.println("values: " + map.values());
		
		for (String key : map.keySet()) {
			System.out.println("key = " + key + ", value = " + map.get(key));
		}
	}
}
