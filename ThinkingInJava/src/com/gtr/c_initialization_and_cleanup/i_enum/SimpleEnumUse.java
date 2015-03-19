package com.gtr.c_initialization_and_cleanup.i_enum;

/**
 * 使用枚举
 *   - toString(), 显示枚举实例的名字
 *   - ordinal(), 返回某个特定enum常量的声明顺序 
 *   - values(), 按照enum常量的声明顺序, 产生由这些常量构成的数组
 * 
 * @author GT-R
 * @date 2015年3月18日 下午4:21:16
 */
public class SimpleEnumUse {
	public static void main(String[] args) {
		for (Spiciness s : Spiciness.values()) {
			System.out.println(s + ", ordinal " + s.ordinal());
		}
	}
}
