package com.gtr.h_inner_class;

/**
 * calling the base-class constructor
 * 
 * 匿名内部类构造函数带参数的情况
 *   - 只需要简单地传递合适的参数给父类的构造器即可
 *   
 *   - 匿名内部类末尾的分号并不是用来标记内部类的结束,
 *     实际上是标记的是表达式的结束, 因此这与别的地方使用的分号是一致的
 *   
 * @author GT-R
 * @date 2015年4月6日 下午1:52:01
 */
public class Parcel8 {
	public Wrapping wrapping(int x) {
		return new Wrapping(x) { // pass constructor argument
			public int value() {
				return super.value() * 47;
			}
		}; // semicolon required
	}
	
	public static void main(String[] args) {
		Parcel8 p = new Parcel8();
		Wrapping w = p.wrapping(10);
		int value = w.value();
		System.out.println("value = " + value);
	}
}
