package com.gtr.h_inner_class;

/**
 * .new语法应用于Parcel
 * 
 * @author GT-R
 * @date 2015年4月5日 下午4:29:35
 */
public class Parcel3 {
	class Contents {
		private int i = 11;
		
		public int value() { return i; }
	}
	
	class Destination {
		private String label;
		
		Destination(String whereTo) { label = whereTo; }
		
		String readLine() { return label; }
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parcel3 p = new Parcel3();
		
		// must use instance of outer class
		// to create an instance of the inner class
		Parcel3.Contents c = p.new Contents();
		Parcel3.Destination d = p.new Destination("Tasmania");
	}
}
