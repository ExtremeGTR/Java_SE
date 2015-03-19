package com.gtr.c_initialization_and_cleanup.e_member_initial;

/**
 * 类数据成员的默认初始值
 * 
 * @author GT-R
 * @date 2015年3月14日 下午2:20:29
 */
public class InitialValues {
	boolean t;
	char c;
	byte b;
	short s;
	int i;
	long l;
	float f;
	double d;
	InitialValues reference;
	
	void printInitialValues() {
		System.out.println("Data type       Initial value");
		System.out.println("boolean         " + t);
		System.out.println("char            [" + c + "]");
		System.out.println("byte            " + b);
		System.out.println("short           " + s);
		System.out.println("int             " + i);
		System.out.println("long            " + l);
		System.out.println("float           " + f);
		System.out.println("double          " + d);
		System.out.println("reference       " + reference);
	}
	
	public static void main(String[] args) {
		InitialValues iv = new InitialValues();
		iv.printInitialValues();
	}
}
