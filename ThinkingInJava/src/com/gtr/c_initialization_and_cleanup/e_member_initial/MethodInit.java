package com.gtr.c_initialization_and_cleanup.e_member_initial;

/**
 * 通过方法来提供初始值
 *   - 调用某个方法来提供数据成员的初始值,
 *     可以给这个方法传参, 但这些参数必须是已经初始化
 *     
 *   - "向前引用"会导致编译错误
 *     
 * @author GT-R
 * @date 2015年3月15日 下午2:43:01
 */
public class MethodInit {
	//! int k = h(i); // illegal forward reference
	int i = f();
	int j = g(i);
	
	int f() { return 11; }
	
	int g(int n) { return n * 10; }
	
	int h(int n) { return n * 20; }
}
