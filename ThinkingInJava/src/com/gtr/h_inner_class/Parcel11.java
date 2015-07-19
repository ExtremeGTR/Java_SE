package com.gtr.h_inner_class;

/**
 * nested classes (static inner class)
 * 
 * static内部类
 *   - static内部类类似于static方法一样, 它并没有this引用可以链接到外围类的对象
 * 
 * @author GT-R
 * @date 2015年4月7日 下午2:23:28
 */
public class Parcel11 {
	private static class ParcelContents implements Contents {
		private int i = 11;
		
		public int value() { return i; }
	}
	
	protected static class ParcelDestination implements Destination {
		private String label;
		
		private ParcelDestination(String whereTo) {
			label = whereTo;
		}
		
		public String readLabel() { return label; }
		
		// nest classes can contain other static elements
		static int x = 0;

		public static void f() { }
		
		static class AnotherLevel {
			static int x = 10;
			public static void f() { }
		}
	}
	
	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}
	
	public static Contents contents() {
		return new ParcelContents();
	}
	
	public static void main(String[] args) {
		Contents c = contents();
		c.value();
		Destination d = destination("Tasmania");
		d.readLabel();
	}
}
