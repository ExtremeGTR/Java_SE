package com.gtr.h_inner_class;

/**
 * 内部类
 *   - 创建内部类的方式: 把类的定义置于令一个类的定义中
 *   
 *   - 内部类与组合是完全不同的概念
 * 
 * @author GT-R
 * @date 2015年4月4日 下午4:10:21
 */
public class Parcel1 {
	class Contents {
		private int i = 11;
		
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		
		Destination(String whereTo) {
			label = whereTo;
		}
		
		String readLabel() { return label; }
	}
	
	public void ship(String dest) {
		Contents c = new Contents();
		Destination d = new Destination(dest);
		System.out.println("c.value() = " + c.value() +
				", d.readLabel() = " + d.readLabel());
	}
	
	public static void main(String[] args) {
		Parcel1 p = new Parcel1();
		p.ship("Tasmania");
	}
}
