package com.gtr.a_operator;

/**
 * 所有操作符的演示
 * 
 * @author GT-R
 * @date 2015年3月6日 下午4:26:11
 */
public class AllOps {
	public static void main(String[] args) {
		
	}
	
	// to accept the results of a boolean test
	void f(boolean b) { }
	
	void boolTest(boolean x, boolean y) {
		// arithmetic operators
		//! x = x * y;
		//! x = x / y;
		//! x = x % y;
		//! x = x + y;
		//! x = x - y;
		//! x++;
		//! x--;
		//! x = +y;
		//! x = -y;
		
		// relational and logical
		//! f(x > y);
		//! f(x >= y);
		//! f(x < y);
		//! f(x <= y);
		f(x == y);
		f(x != y);
		f(!y);
		x = x && y;
		x = x || y;
		
		// bitwise operators
		//! x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		
		// compound assignment
		//! x += y;
		//! x -= y;
		//! x *= y;
		//! x /= y;
		//! x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		x &= y;
		x |= y;
		x ^= y;
		
		// casting
		//! char c = (char) x;
		//! byte b = (byte) x;
		//! short s = (short) x;
		//! int i = (int) x;
		//! long l = (long) x;
		//! float f = (float) x;
		//! double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void charTest(char x, char y) {
		// arithmetic operators
		x = (char) (x * y);
		x = (char) (x / y);
		x = (char) (x % y);
		x = (char) (x + y);
		x = (char) (x - y);
		x++;
		x--;
		x = (char) +y;
		x = (char) -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		x = (char) ~y;
		x = (char) (x & y);
		x = (char) (x | y);
		x = (char) (x ^ y);
		x = (char) (x << 1);
		x = (char) (x >> 1);
		x = (char) (x >>> 1);
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x |= y;
		x ^= y;
		
		// casting
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void byteTest(byte x, byte y) {
		// arithmetic operators
		x = (byte) (x * y);
		x = (byte) (x / y);
		x = (byte) (x % y);
		x = (byte) (x + y);
		x = (byte) (x - y);
		x++;
		x--;
		x = (byte) +y;
		x = (byte) -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		x = (byte) ~y;
		x = (byte) (x & y);
		x = (byte) (x | y);
		x = (byte) (x ^ y);
		x = (byte) (x << 1);
		x = (byte) (x >> 1);
		x = (byte) (x >>> 1);
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x |= y;
		x ^= y;
		
		// casting
		//! boolean bl = (boolean)x;
		char c = (char) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void shortTest(short x, short y) {
		// arithmetic operators
		x = (short) (x * y);
		x = (short) (x / y);
		x = (short) (x % y);
		x = (short) (x + y);
		x = (short) (x - y);
		x++;
		x--;
		x = (short) +y;
		x = (short) -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		x = (short) ~y;
		x = (short) (x & y);
		x = (short) (x | y);
		x = (short) (x ^ y);
		x = (short) (x << 1);
		x = (short) (x >> 1);
		x = (short) (x >>> 1);
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x |= y;
		x ^= y;
		
		// casting
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void intTest(int x, int y) {
		// arithmetic operators
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		x = ~y;
		x = x & y;
		x = x | y;
		x = x ^ y;
		x = x << 1;
		x = x >> 1;
		x = x >>> 1;
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x |= y;
		x ^= y;
		
		// casting
		//! boolean bl = (boolean) x;
		char c = (char) x;
		short s = (short) x;
		byte b = (byte) x;
		long l = (long) x;
		float f = (float) x;
		double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void longTest(long x, long y) {
		// arithmetic operators
		x = (long) (x * y);
		x = (long) (x / y);
		x = (long) (x % y);
		x = (long) (x + y);
		x = (long) (x - y);
		x++;
		x--;
		x = (long) +y;
		x = (long) -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		x = (long) ~y;
		x = (long) (x & y);
		x = (long) (x | y);
		x = (long) (x ^ y);
		x = (long) (x << 1);
		x = (long) (x >> 1);
		x = (long) (x >>> 1);
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		x <<= 1;
		x >>= 1;
		x >>>= 1;
		x &= y;
		x |= y;
		x ^= y;
		
		// casting
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		float f = (float) x;
		double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void floatTest(float x, float y) {
		// arithmetic operators
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		//! x = ~y;
		//! x = x & y;
		//! x = x | y;
		//! x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		//! x &= y;
		//! x |= y;
		//! x ^= y;
		
		// casting
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		double d = (double) x;
	}
	
	@SuppressWarnings("unused")
	void doubleTest(double x, double y) {
		// arithmetic operators
		x = x * y;
		x = x / y;
		x = x % y;
		x = x + y;
		x = x - y;
		x++;
		x--;
		x = +y;
		x = -y;
		
		// relational and logical
		f(x > y);
		f(x >= y);
		f(x < y);
		f(x <= y);
		f(x == y);
		f(x != y);
		//! f(!y);
		//! f(x && y);
		//! f(x || y);
		
		// bitwise operators
		//! x = ~y;
		//! x = x & y;
		//! x = x | y;
		//! x = x ^ y;
		//! x = x << 1;
		//! x = x >> 1;
		//! x = x >>> 1;
		
		// compound assignment
		x += y;
		x -= y;
		x *= y;
		x /= y;
		x %= y;
		//! x <<= 1;
		//! x >>= 1;
		//! x >>>= 1;
		//! x &= y;
		//! x |= y;
		//! x ^= y;
		
		// casting
		//! boolean bl = (boolean)x;
		char c = (char) x;
		byte b = (byte) x;
		short s = (short) x;
		int i = (int) x;
		long l = (long) x;
		float f = (float) x;
	}
}
