package com.gtr.c_initialization_and_cleanup.b_overload;

/**
 * 涉及基本类型的重载
 *   - 如果传入的实参大于重载方法声明的形参,那就得通过强制类型转换, 不然就会报错
 * 
 * @author GT-R
 * @date 2015年3月12日 下午3:39:56
 */
public class Demotion {
	public static void main(String[] args) {
		Demotion d = new Demotion();
		d.testDouble();
	}
	
	void f1(char x) { System.out.print("f1(char) "); };
	void f1(byte x) { System.out.print("f1(byte) "); };
	void f1(short x) { System.out.print("f1(short) "); };
	void f1(int x) { System.out.print("f1(int) "); };
	void f1(long x) { System.out.print("f1(long) "); };
	void f1(float x) { System.out.print("f1(float) "); };
	void f1(double x) { System.out.print("f1(double) "); };
	
	void f2(char x) { System.out.print("f2(char) "); };
	void f2(byte x) { System.out.print("f2(byte) "); };
	void f2(short x) { System.out.print("f2(short) "); };
	void f2(int x) { System.out.print("f2(int) "); };
	void f2(long x) { System.out.print("f2(long) "); };
	void f2(float x) { System.out.print("f2(float) "); };
	
	void f3(char x) { System.out.print("f3(char) "); };
	void f3(byte x) { System.out.print("f3(byte) "); };
	void f3(short x) { System.out.print("f3(short) "); };
	void f3(int x) { System.out.print("f3(int) "); };
	void f3(long x) { System.out.print("f3(long) "); };
	
	void f4(char x) { System.out.print("f4(char) "); };
	void f4(byte x) { System.out.print("f4(byte) "); };
	void f4(short x) { System.out.print("f4(short) "); };
	void f4(int x) { System.out.print("f4(int) "); };
	
	void f5(char x) { System.out.print("f5(char) "); };
	void f5(byte x) { System.out.print("f5(byte) "); };
	void f5(short x) { System.out.print("f5(short) "); };
	
	void f6(char x) { System.out.print("f6(char) "); };
	void f6(byte x) { System.out.print("f6(byte) "); };
	
	void f7(char x) { System.out.print("f6(char) "); };
	
	
	void testDouble() {
		double d = 0.0;
		System.out.println("double argument: ");
		f1(d); f2((float) d); f3((long) d);	
		f4((int) d); f5((short) d);	f6((byte) d); f7((char) d);
	}
}
