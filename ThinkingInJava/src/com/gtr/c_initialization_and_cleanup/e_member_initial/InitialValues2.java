package com.gtr.c_initialization_and_cleanup.e_member_initial;

/**
 * 指定类数据成员的初始值
 *   - 在数据成员声明处可以直接初始化, 貌似C++11之前不可这么做
 * 
 * @author GT-R
 * @date 2015年3月15日 下午1:30:10
 */
public class InitialValues2 {
	boolean bool = true;
	char c = 'x';
	byte b = 47;
	short s = 0xff;
	int i = 999;
	long lng = 1L;
	float f = 3.14f;
	double d = 3.14159;
	
	InitialValues2 reference = new InitialValues2();
}
