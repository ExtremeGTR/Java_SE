package com.gtr.e_reusing_classes.combination;

/**
 * 组合 - 直接将新对象的引用置于新类中即可
 * 
 * toString()方法
 *   - 这个方法是属于Object类的, 然而Java中所有自定义类都继承了Object类,
 *     因此, 自定义类都自带toString()
 *     
 *   - 当编译器需要一个String而给出的只有一个自定义类对象时, 这个方法就会被调用
 * 
 * @author GT-R
 * @date 2015年3月21日 上午11:31:29
 */
public class SprinklerSystem {
	private String value1, value2, value3, value4;
	private WaterSource source = new WaterSource();
	private int i;
	private float f;
	
	public String toString() {
		return 
		    "valve1 = " + value1 + " " +
	        "value2 = " + value2 + " " +
		    "value3 = " + value3 + " " +
	        "value4 = " + value4 + "\n" +
		    "i = " + i + ", f = " + f + " " +
	        "souce = " + source;
	}
	
	public static void main(String[] args) {
		SprinklerSystem sprinklers = new SprinklerSystem();
		System.out.println(sprinklers);
	}
}

class WaterSource {
	private String s;
	
	WaterSource() {
		System.out.println("WaterSource()");
		s = "constructed";
	}
	
	public String toString() { return s; }
}
