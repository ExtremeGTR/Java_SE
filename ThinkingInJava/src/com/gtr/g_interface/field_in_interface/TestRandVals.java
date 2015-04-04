package com.gtr.g_interface.field_in_interface;

/**
 * 接口中的数据成员并不是接口的一部分,
 * 它们的值被存储在该接口的静态存储区域内
 * 
 * @author GT-R
 * @date 2015年4月3日 上午11:50:13
 */
public class TestRandVals {
	public static void main(String[] args) {
		System.out.println("RandVals.RANDOM_INT = " + RandVals.RANDOM_INT);
		System.out.println("RandVals.RANDOM_LONG = " + RandVals.RANDOM_LONG);
		System.out.println("RandVals.RANDOM_FLOAT = " + RandVals.RANDOM_FLOAT);
		System.out.println("RandVals.RANDOM_DOUBLE = " + RandVals.RANDOM_DOUBLE);
	}
}
