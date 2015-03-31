package com.gtr.f_polymorphism.design;

/**
 * downcasting & runtime type information(RTTI)
 * 
 * 向下转型和运行时类型信息
 *   - 与向上转型相反, 向下转型是类型在继承层次中向下移动,
 *     这只需要进行一次扑通的加括号形式的类型转换,
 *     在进入运行期时仍会对其进行检查, 以确保它的确是我们所希望的那种类型,
 *     如果不是, 则会抛出一个ClassCastException(类型转换异常)
 *     
 *   - 在运行期间对类型进行检查的行为称作"运行时类型识别"(RTTI)
 * 
 * @author GT-R
 * @date 2015年3月31日 下午2:48:53
 */
public class RTTI {
	public static void main(String[] args) {
		Useful[] uArr = {
			new Useful(),
			new MoreUseful()
		};
		uArr[0].f();
		uArr[1].g();
		
		// compile time: method not found in Useful
		//! uArr[1].u();
		
		((MoreUseful) uArr[1]).u(); // downcast/RTTI
		((MoreUseful) uArr[0]).u(); // exception thrown
	}
}

class Useful {
	public void f() { }
	public void g() { }
}

class MoreUseful extends Useful {
	public void f() { }
	public void g() { }
	public void u() { }
	public void v() { }
	public void w() { }
}
