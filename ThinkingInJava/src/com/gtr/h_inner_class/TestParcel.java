package com.gtr.h_inner_class;

/**
 * 内部类与向上转型
 *   - private内部类给类的设计者提供了一种途径,
 *     通过这种方式可以完全阻止任何依赖于类型的编码,
 *     并且完全隐藏了实现的细节
 * 
 * @author GT-R
 * @date 2015年4月5日 下午9:46:10
 */
public class TestParcel {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parcel4 p = new Parcel4();
		Contents c = p.contents();
		Destination d = p.destination("Tasmania");
		
		// illegal -- can't access private class
		//! Parcel4.PContents p.new PContents();
	}
}

class Parcel4 {
	private class PContents implements Contents {
		private int i = 11;
		
		public int value() { return i; }
	}
	
	protected class PDestination implements Destination {
		private String label;
		
		private PDestination(String whereTo) {
			label = whereTo;
		}
		
		public String readLabel() { return label; }
	}
	
	public Destination destination(String s) {
		return new PDestination(s);
	}
	
	public Contents contents() {
		return new PContents();
	}
}