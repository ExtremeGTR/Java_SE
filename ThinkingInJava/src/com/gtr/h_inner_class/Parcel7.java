package com.gtr.h_inner_class;

/**
 * returning an instance of an anonymous inner class
 * 
 * 匿名内部类
 *   - 通过new表示大返回的引用被自动向上转型为对Contents的引用,
 *     表示创建一个实现了Contents匿名类的对象
 * 
 * @author GT-R
 * @date 2015年4月6日 上午10:42:50
 */
public class Parcel7 {
	public Contents contents() {
		return new Contents() { // insert a class definition
			private int i = 11;
			
			@Override
			public int value() { return i; }
		}; // semicolon required in this case
	}
	
	public static void main(String[] args) {
		Parcel7 p = new Parcel7();
		Contents c = p.contents();
		System.out.println(c.value());
	}
}
