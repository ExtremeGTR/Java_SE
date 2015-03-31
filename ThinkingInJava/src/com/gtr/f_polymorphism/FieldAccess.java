package com.gtr.f_polymorphism;

/**
 * 多态与数据成员
 *   - 访问数据成员这一操作不会多态地发生,
 *     需要访问父类的数据成员, 必须显式地使用super关键字
 * 
 * @author GT-R
 * @date 2015年3月27日 下午2:46:05
 */
public class FieldAccess {
	public static void main(String[] args) {
		Super sup = new Sub(); // upcast
		System.out.println("sup.field = " + sup.field +
				", sup.getField() = " + sup.getField());
		Sub sub = new Sub();
		System.out.println("sub.field = " + sub.field +
				", sub.getField() = " + sub.getField() +
				", sub.getSuperField() = " + sub.getSuperField());
	}
}

class Super {
	public int field = 0;
	
	public int getField() {
		return field;
	}
}

class Sub extends Super {
	public int field = 1;
	
	public int getField() {
		return field;
	}
	
	public int getSuperField() {
		return super.field;
	}
}
