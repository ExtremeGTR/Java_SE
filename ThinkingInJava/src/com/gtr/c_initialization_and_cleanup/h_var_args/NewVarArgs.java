package com.gtr.c_initialization_and_cleanup.h_var_args;


/**
 * 新的可变参数列表
 *   - Object... args这种形式是在Java1.5以及之后的可变参数列表
 *   
 *   - 可以传递任意个实参到拥有可变参数列表的方法中
 *   
 *   - 实参列表会被自动转化为数组, 因此可以使用循环遍历
 *   
 *   - 传递0个实参给可变参数列表也是可行的
 * 
 * @author GT-R
 * @date 2015年3月18日 上午12:24:40
 */
public class NewVarArgs {
	static void printArray(Object... args) {
		for (Object obj : args) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		// can take individual elements
		printArray(new Integer(47), new Float(3.14), new Double(11.11));
		printArray(47, 3.14F, 11.11);
		printArray("one", "two", "three");
		printArray(new A(), new A(), new A());
		// or an array
		printArray((Object[]) new Integer[] { 1, 2, 3, 4 });
		// empty list is ok
		printArray();
		
	}
}
