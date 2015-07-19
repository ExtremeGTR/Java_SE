package com.gtr.i_container.generics_and_type_safe;

import java.util.ArrayList;

/**
 * simple container example(produces compileer warning)
 * 
 * 不使用泛型的容器
 *   - 容器没有使用泛型都会有编译器警告,
 *     此时, 使用SuppressWarnings注解以及其参数消除警告
 *     
 *   - 在运行时, 试图将Orange对象转换为Apple时，那就会得到一个类型转换异常ClassCastingException
 * 
 * @author GT-R
 * @date 2015年4月17日 上午10:54:34
 */
public class ApplesAndOrangesWithoutGenerics {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		ArrayList apples = new ArrayList();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		// not prevented from adding an Orange to apples
		apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			((Apple) apples.get(i)).id();
			// Orange is detected only at run time
		}
	}
}

class Apple {
	private static long counter;
	private final long id = counter++;
	
	public long id() { return id; }
}

class Orange { }