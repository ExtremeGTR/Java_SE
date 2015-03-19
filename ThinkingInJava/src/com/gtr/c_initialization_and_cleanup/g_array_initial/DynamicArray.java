package com.gtr.c_initialization_and_cleanup.g_array_initial;

/**
 * 在方法调用参数列表处使用数组的列表初始化形式
 * 
 * @author GT-R
 * @date 2015年3月17日 下午3:59:59
 */
public class DynamicArray {
	public static void main(String[] args) {
		Other.main(new String[] { "fiddle", "de", "dum" });
	}
}

class Other {
	public static void main(String[] args) {
		for (String s : args) {
			System.out.print(s + " ");
		}
	}
}
