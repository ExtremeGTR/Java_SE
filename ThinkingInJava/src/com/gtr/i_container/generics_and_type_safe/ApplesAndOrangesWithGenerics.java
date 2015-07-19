package com.gtr.i_container.generics_and_type_safe;

import java.util.ArrayList;

/**
 * 使用带泛型的容器
 *   - 使用泛型, 就可以在编译期防止将错误类型的对象放置到容器中,
 *     将运行时错误变成编译期错误
 * 
 * @author GT-R
 * @date 2015年4月17日 下午2:10:28
 */
public class ApplesAndOrangesWithGenerics {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		for (int i = 0; i < 3; i++) {
			apples.add(new Apple());
		}
		// compile-time error
		// apples.add(new Orange());
		for (int i = 0; i < apples.size(); i++) {
			System.out.println(apples.get(i).id());
		}
		// using foreach
		for (Apple a : apples) {
			System.out.println(a.id());
		}
	}
}
