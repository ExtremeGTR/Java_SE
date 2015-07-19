package com.gtr.i_container.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * simple demonstration of HashMap
 * 
 * 将对象映射到其他对象的能力是一种解决编程问题的杀手锏
 * 
 * 此处是通过Map统计Random产生的随机数
 *   - 如果键不在容器中, get方法将返回null
 * 
 * @author GT-R
 * @date 2015年7月17日 上午2:01:25
 */
public class Statistics {
	public static void main(String[] args) {
		Random rand = new Random(47);
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < 10000; i++) {
			// produce a number between 0 and 20
			int number = rand.nextInt(20);
			Integer frequence = map.get(number);
			map.put(number, frequence == null ? 1 : frequence + 1);
		}
		System.out.println(map);
	}
}
