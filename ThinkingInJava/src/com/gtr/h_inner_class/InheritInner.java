package com.gtr.h_inner_class;

/**
 * inheriting an inner class
 * 
 * 继承内部类
 *   - 问题:
 *       因为内部类的构造器必须链接到指向其外围类对象的引用,
 *       所以在继承内部类的时候, 事情就会变得复杂
 *           
 *   - 解决:
 *       那个指向外围类对象的"秘密的"引用必须被初始化,
 *       而在继承内部类的子类中不存在可连接的默认对象,
 *       此时必须使用特殊语法来说明它们之间的关联
 *       
 *   - 特殊语法
 *     enclosingClassReference.super();
 *   
 *   - 当没有使用特殊语法时, Eclipse就会报以下错误
 *     No enclosing instance of type WithInner is available
 *     due to some intermediate constructor invocation
 * 
 * @author GT-R
 * @date 2015年4月9日 下午2:50:26
 */
public class InheritInner extends WithInner.Inner {
	// won't compile
	//! InheritInner() { }
	
	InheritInner(WithInner wi) {
		wi.super();
	}
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner ii = new InheritInner(wi);
	}
}

class WithInner {
	class Inner { }
}