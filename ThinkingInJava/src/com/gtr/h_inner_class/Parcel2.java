package com.gtr.h_inner_class;

/**
 * 从外部类的非静态方法之外的任意位置创建某个内部类的对象,
 * 那么必须使用以下语法指明这个对象的具体类型
 *   OuterClassName.InnerClassName
 * 
 * @author GT-R
 * @date 2015年4月5日 下午1:56:11
 */
public class Parcel2 {
	class Contents {
		private int i = 11;
		
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		
		Destination(String whereTo) { label = whereTo; }
		
		String readLine() { return label; }
	}
	
	public Destination to(String s) {
		return new Destination(s);
	}
	
	public Contents contents() {
		return new Contents();
	}
	
	public void ship(String dest) {
		Contents c = contents();
		Destination d = to(dest);
		System.out.println("c.value() = " + c.value() +
				", d.readLine() = " + d.readLine());
	}
	
	public static void main(String[] args) {
		Parcel2 p = new Parcel2();
		p.ship("Tasmania");
		Parcel2 q = new Parcel2();
		
		// defining references to inner classes
		Parcel2.Contents c = q.contents();
		Parcel2.Destination d= q.to("Borneo");
		c.value();
		d.readLine();
	}
}
