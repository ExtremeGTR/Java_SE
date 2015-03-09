package com.gtr.a_third_unit_operator;

/**
 * 字面值常量
 *   -常量后面的后缀字符标志了它的类型
 *    1.大小写L代表long
 *    2.大小写F代表float
 *    3.大小写D代表double
 *    
 *   -数字进制表示法
 *    1.0x或0X作为前缀的是十六进制数
 *    2.0作为前缀的是八进制数
 *    
 * @author GT-R
 * @date 2015年3月1日 下午2:30:09
 */
public class Literals {
	public static void main(String[] args) {
		int i1 = 0x2f; // Hexadecimal (lowercase)
		System.out.println("i1 = " + Integer.toBinaryString(i1));
		int i2 = 0X2F; // Hexadecimal (uppercase)
		System.out.println("i2 = " + Integer.toBinaryString(i2));
		int i3 = 0117; // Octal (leading zero)
		System.out.println("i3 = " + Integer.toBinaryString(i3));
		char c = 0xffff; // max char hex value
		System.out.println("c = " + Integer.toBinaryString(c));
		byte b = 0x7f; // max byte hex value
		System.out.println("b = " + Integer.toBinaryString(b));
		short s = 0x7fff; // max short hex vale
		System.out.println("s = " + Integer.toBinaryString(s));
		
		long n1 = 200L; // long suffix
		long n2 = 200l; // long suffix(but can be confusing)
		long n3 = 200;  
		float f1 = 1;   
		float f2 = 1F;  // float suffix
		float f3 = 1f;  // float suffix
		double d1 = 1d; // double suffix
		double d2 =1D;  // double suffix
		System.out.println("n1 = " + n1 + ", n2 = " + n2 + ", n3 = " + n3);
		System.out.println("f1 = " + f1 + ", f2 = " + f2 + ", n3 = " + f3);
		System.out.println("d1 = " + d1 + ", d2 = " + d2);
	}
}
