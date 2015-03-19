package com.gtr.c_initialization_and_cleanup.b_overload;

/**
 * 涉及基本类型的重载
 *   - 如果传入的实参类型小于方法中生命的形参类型, 实参的数据类型就会被提升
 * 
 * @author GT-R
 * @date 2015年3月12日 上午11:31:21
 */
public class PrimitiveOverloading {
	public static void main(String[] args) {
		PrimitiveOverloading p = new PrimitiveOverloading();
		p.testConstVal();
		p.testChar();
		p.testByte();
		p.testShort();
		p.testInt();
		p.testLong();
		p.testFloat();
		p.testDouble();
	}
	
	void f1(char x) { System.out.print("f1(char) "); };
	void f1(byte x) { System.out.print("f1(byte) "); };
	void f1(short x) { System.out.print("f1(short) "); };
	void f1(int x) { System.out.print("f1(int) "); };
	void f1(long x) { System.out.print("f1(long) "); };
	void f1(float x) { System.out.print("f1(float) "); };
	void f1(double x) { System.out.print("f1(double) "); };
	
	void f2(byte x) { System.out.print("f2(byte) "); };
	void f2(short x) { System.out.print("f2(short) "); };
	void f2(int x) { System.out.print("f2(int) "); };
	void f2(long x) { System.out.print("f2(long) "); };
	void f2(float x) { System.out.print("f2(float) "); };
	void f2(double x) { System.out.print("f2(double) "); };
	
	void f3(short x) { System.out.print("f3(short) "); };
	void f3(int x) { System.out.print("f3(int) "); };
	void f3(long x) { System.out.print("f3(long) "); };
	void f3(float x) { System.out.print("f3(float) "); };
	void f3(double x) { System.out.print("f3(double) "); };
	
	void f4(int x) { System.out.print("f4(int) "); };
	void f4(long x) { System.out.print("f4(long) "); };
	void f4(float x) { System.out.print("f4(float) "); };
	void f4(double x) { System.out.print("f4(double) "); };
	
	void f5(long x) { System.out.print("f5(long) "); };
	void f5(float x) { System.out.print("f5(float) "); };
	void f5(double x) { System.out.print("f5(double) "); };
	
	void f6(float x) { System.out.print("f6(float) "); };
	void f6(double x) { System.out.print("f6(double) "); };
	
	void f7(double x) { System.out.print("f7(double) "); };

	
	void testConstVal() {
		System.out.print("5: ");
		f1(5); f2(5); f3(5); f4(5); f5(5); f6(5); f7(5);
		System.out.println();
	}
	
	void testChar() {
		char c = 'c';
		System.out.print("char: ");
		f1(c); f2(c); f3(c); f4(c); f5(c); f6(c); f7(c);
		System.out.println();
	}
	
	void testByte() {
		byte b = 0;
		System.out.print("byte: ");
		f1(b); f2(b); f3(b); f4(b); f5(b); f6(b); f7(b);
		System.out.println();
	}
	
	void testShort() {
		short s = 0;
		System.out.print("short: ");
		f1(s); f2(s); f3(s); f4(s); f5(s); f6(s); f7(s);
		System.out.println();
	}
	
	void testInt() {
		int i = 0;
		System.out.print("int: ");
		f1(i); f2(i); f3(i); f4(i); f5(i); f6(i); f7(i);
		System.out.println();
	}
	
	void testLong() {
		long l = 0L;
		System.out.print("long: ");
		f1(l); f2(l); f3(l); f4(l); f5(l); f6(l); f7(l);
		System.out.println();
	}
	
	void testFloat() {
		float f = 0f;
		System.out.print("float: ");
		f1(f); f2(f); f3(f); f4(f); f5(f); f6(f); f7(f);
		System.out.println();
	}
	
	void testDouble() {
		double d = 0;
		System.out.print("double: ");
		f1(d); f2(d); f3(d); f4(d); f5(d); f6(d); f7(d);
	}
}
