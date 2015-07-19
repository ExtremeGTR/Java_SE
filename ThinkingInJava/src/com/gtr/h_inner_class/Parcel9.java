package com.gtr.h_inner_class;

/**
 * 匿名内部类使用外部定义的对象
 *   - 如果匿名内部类一定要使用其外部定义的对象,
 *     那该对象必须使用final修饰, 使用final保持对象的一致性
 * 
 * @author GT-R
 * @date 2015年4月6日 下午2:29:04
 */
public class Parcel9 {
	public Destination destination(final String dest) {
		return new Destination() {
			private String label = dest;
			
			@Override
			public String readLabel() { return label; }
		};
	}
	
	public static void main(String[] args) {
		Parcel9 p = new Parcel9();
		Destination d = p.destination("Tasmania");
		d.readLabel();
	}
}