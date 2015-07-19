package com.gtr.i_container.foreach;

import java.util.Map;

/**
 * 打印操作系统所有的环境变量
 *   - Map不可以在foreach中使用,
 *     但是它有一个方法entrySet()产生一个由Map.Entry元素构成的Set,
 *     而Set是一个Iterable, 所以它可以用于foreach循环
 * 
 * @author GT-R
 * @date 2015年7月19日 下午2:14:33
 */
public class EnvironmentVariables {
	public static void main(String[] args) {
		for (Map.Entry<String, String> entry : System.getenv().entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}
	}
}
