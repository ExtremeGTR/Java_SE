package com.gtr.g_interface.field_in_interface;

/**
 * 在Java SE5之前, 没有enum, 封装常量的工具是使用interface
 *   - 在接口中定义的数据成员会自动被static和final修饰
 * 
 * @author GT-R
 * @date 2015年4月2日 下午10:58:56
 */
public interface Months {
	int JANUARY = 1, FEBRARY = 2, MARCH = 3,
		APRIL = 4, MAY = 5, JUNE = 5, JULY = 7,
		AUGUST = 8, SEPTEMBER = 9, OCTOBER = 10,
		NOVEMBER = 11, DECEMBER = 12;
}
