package com.gtr.h_inner_class;

/**
 * OuterClassObjectReference.new
 *   - 如果要在外部直接创建内部类的对象,
 *     此时必须在new表达式中提供对其外部类对象的引用, 即.new语法
 *     
 *   - 在创建外部类对象之前是不可能创建内部类对象的,
 *     因为内部类对象会暗暗地链接到创建它的外部类对象上
 * 
 * @author GT-R
 * @date 2015年4月5日 下午3:46:40
 */
public class DotNew {
	public class Inner { }
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		DotNew outer = new DotNew();
		DotNew.Inner innerA = outer.new Inner();
		
		// No enclosing instance of type DotNew is accessible.
		// Must qualify the allocation with an enclosing instance of type DotNew
		// (e.g. x.new A() where x is an instance of DotNew)
		//! DotNew.Inner innerB = new Inner();
	}
}
