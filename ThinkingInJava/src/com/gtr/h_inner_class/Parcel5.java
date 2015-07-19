package com.gtr.h_inner_class;

/**
 * 在方法内部定义类
 *   - 这里表示PDestination类是destination()方法的一部分, 而不是Parcel5的一部分;
 *     所以在方法之外就不能访问这个内部类
 * 
 * @author GT-R
 * @date 2015年4月5日 下午11:45:13
 */
public class Parcel5 {
	public Destination destination(String s) {
		class PDestionation implements Destination {
			private  String label;
			
			private PDestionation(String whereTo) {
				label = whereTo;
			}
			
			public String readLabel() { return label; }
		}
		return new PDestionation(s);
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Parcel5 p = new Parcel5();
		Destination d = p.destination("Tasmania");
	}
}
