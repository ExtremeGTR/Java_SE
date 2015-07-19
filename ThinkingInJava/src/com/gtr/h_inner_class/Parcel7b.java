package com.gtr.h_inner_class;

/**
 * expanded version of Parcel7.java
 * 
 * 此处演示的是Parcel7匿名内部类的展开形式
 * 
 * @author GT-R
 * @date 2015年4月6日 下午1:13:02
 */
public class Parcel7b {
	class MyContents implements Contents {
		private int i = 11;
		
		public int value() { return i; }
	}

	public Contents contents() { return new MyContents(); }
	
	public static void main(String[] args) {
		Parcel7b p = new Parcel7b();
		Contents c = p.contents();
		c.value();
	}
}
