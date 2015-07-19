package com.gtr.h_inner_class;

/**
 * 在任意作用域内定义类
 *   - 此处TrackingSlip类的作用域只有在if语句内, if外都不可以使用它
 * 
 * @author GT-R
 * @date 2015年4月6日 上午10:25:37
 */
public class Parcel6 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;
				
				TrackingSlip(String s) {
					id = s;
				}
				
				String getSlip() { return id; }
			}
			
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
			System.out.println("s = " + s);
		}
		// can't use it here! out of scope
		//! TrackingSlip ts = new TrackingSlip("x");
	}
	
	public void track() {
		internalTracking(true);
	}
	
	public static void main(String[] args) {
		Parcel6 p = new Parcel6();
		p.track();
	}
}
