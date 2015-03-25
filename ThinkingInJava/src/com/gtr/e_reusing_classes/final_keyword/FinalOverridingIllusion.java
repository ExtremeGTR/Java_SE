package com.gtr.e_reusing_classes.final_keyword;

/**
 * it only looks like you can override
 * a private or private final method
 * 
 * final和private关键字修饰的方法
 *   - final修饰的方法表示以防任何继承类修改它的含义, 即不能被覆盖;
 *     同时, 编译器将针对该方法的所有调用都转为内嵌调用(一般不建议为这种用途而使用final)
 *     
 *   - 类中的private方法都隐式指定为final的
 *   
 *   - private修饰的方法就不是父类接口的一部分, 如果试图在子类"覆盖"它,
 *     似乎是奏效的, 而且编译器也不会给出错误信息, 但实际上,
 *     子类并没有覆盖父类的方法, 仅是生成一个新的方法
 * 
 * @author GT-R
 * @date 2015年3月24日 下午8:18:17
 */
public class FinalOverridingIllusion {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		OverridingPrivate2 op2 = new OverridingPrivate2();
		op2.f();
		op2.g();
		
		// you can upcast
		OverridingPrivate op = op2;
		
		// but you can't call the methods
		//! op.f();
		//! op.g();
		
		// same here
		WithFinals wf = op2;
		//! wf.f();
		//! wf.g();
	}
}

@SuppressWarnings("unused")
class WithFinals {
	// indentical to "private" alone
	
	private final void f() {
		System.out.println("WithFinals.f()");
	}
	
	// also automatically "final"
	private void g() {
		System.out.println("WithFinals.g()");
	}
}

@SuppressWarnings("unused")
class OverridingPrivate extends WithFinals {
	private final void f() {
		System.out.println("OverringPrivate.f()");
	}
	
	private void g() {
		System.out.println("OverringPrivate.g()");
	}
}


class OverridingPrivate2 extends OverridingPrivate {
	public final void f() {
		System.out.println("OverringPrivate2.f()");
	}
	
	public void g() {
		System.out.println("OverringPrivate2.g()");
	}
}
