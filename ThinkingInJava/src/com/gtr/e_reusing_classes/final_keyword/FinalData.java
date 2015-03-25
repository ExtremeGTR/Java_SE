package com.gtr.e_reusing_classes.final_keyword;

import java.util.Random;

/**
 * final数据
 *   - 一个永不改变的编译时常量
 *     这种常量必须是基本数据类型, 并且以关键字final修饰, 定义同时必须赋值
 *   
 *   - 一个在运行时被初始化的值, 而你不希望它被改变
 *   
 *   - 一个既是static又是final的数据成员只占据一段不能改变的内存空间
 *     (一般用大写表示, 单词之间用下划线分割)
 *     
 *   - final修饰对象引用表示该引用恒定不变, 但仍然可以修改它所指向的对象
 * 
 * @author GT-R
 * @date 2015年3月23日 下午4:29:02
 */
public class FinalData {
	private static Random rand = new Random(47);
	private String id;
	
	public FinalData(String id) {
		this.id = id;
	}
	
	// can be compile-time constants
	private final int valueOne = 9;
	private static final int VALUE_TWO = 99;
	
	// typical public constant
	public static final int VALUE_TREE = 39;
	
	// can't be compile-time constants
	private final int i4 = rand.nextInt(20);
	static final int INT_5 = rand.nextInt(20);
	
	private Value v1 = new Value(11);
	private final Value v2 = new Value(22);
	private static final Value VAL_3 = new Value(33);
	
	// arrays
	private final int[] a = { 1, 2, 3, 4, 5, 6 };
	
	public String toString() {
		return id + ": " + "valueOne = " + valueOne + ", VALUE_TWO = " + VALUE_TWO +
				", VALUE_THREE = " + VALUE_TREE + ", i4 = " + i4 + "\nINT_5 = " + INT_5 +
				", v1 = " + v1 + ", v2 = " + v2 + ", VAL_3 = " + VAL_3; 
	}
	
	public static void main(String[] args) {
		FinalData fd1 = new FinalData("fd1");
		//! fd1.valueOne++; // can't change value
		fd1.v2.i++; // object isn't constant
		fd1.v1 = new Value(9); // ok -- not final
		for (int i = 0; i < fd1.a.length; i++) {
			fd1.a[i]++; // object isn't constant
		}
		//! fd1.v2 = new Value(0);
		//! fd1.VAL_3 = new Value(1);
		//! fd1.a = new int[3];
		System.out.println(fd1);
		System.out.println("Creating new FinalData");
		FinalData fd2 = new FinalData("fd2");
		System.out.println(fd1);
		System.out.println(fd2);
	}
}

class Value {
	int i; // package access
	
	public Value(int i) { this.i = i; }
	
	public String toString() {
		return "" + i;
	}
}