package com.gtr.c_initialization_and_cleanup.f_constructor_initial;

/**
 * 使用构造器初始化
 *   - 在调用构造器初始化之前, 自动初始化就会进行
 *     i首先会被置为0, 然后再赋值为9
 * 
 * @author GT-R
 * @date 2015年3月15日 下午4:36:47
 */
public class ConstructorInitial {
	int i;
	
	public ConstructorInitial() {
		i = 9;
	}
}
