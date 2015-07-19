package com.gtr.h_inner_class;

/**
 * using "instance initialization" to perform
 * construction on an anonymous inner class
 * 
 * 对于匿名类而言, 实例初始化的实际效果就是构造器;
 * 不过它也受到限制, 因为不能重载实例初始化方法, 所以仅有一个这样的构造器
 * 
 * @author GT-R
 * @date 2015年4月7日 上午11:23:52
 */
public class Parcel10 {
	public Destination destination(final String dest, final float price) {
		return new Destination() {
			private int cost;
			private String label = dest;
			
			// instance initialization for each object
			{
				cost = Math.round(price);
				if (cost > 100) {
					System.out.println("Over budget!");
				}
			}
			
			@Override
			public String readLabel() { return label; }
		};
	}
	
	public static void main(String[] args) {
		Parcel10 p = new Parcel10();
		Destination d = p.destination("Tasmania", 101.395F);
		String msg = d.readLabel();
		System.out.println("msg = " + msg);
	}
}
