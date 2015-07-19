package com.gtr.i_container.generics_and_type_safe;

import java.util.ArrayList;

/**
 * 向上转型也可以作用域泛型
 *   - 此处, ArrayList被指明存放的是Apple类型对象,
 *     因此, 这个容器也可以存放Apple子类型对象 
 * 
 * @author GT-R
 * @date 2015年4月17日 下午3:04:39
 */
public class GenericsAndUpcasting {
	public static void main(String[] args) {
		ArrayList<Apple> apples = new ArrayList<Apple>();
		apples.add(new GrannySmith());
		apples.add(new Gala());
		apples.add(new Fuji());
		apples.add(new Braeburn());
		for (Apple a : apples) {
			System.out.println(a);
		}
	}
}

class GrannySmith extends Apple { }
class Gala extends Apple { }
class Fuji extends Apple { }
class Braeburn extends Apple { }