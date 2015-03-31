package com.gtr.f_polymorphism.constructor_and_polymorphism;

/**
 * cleaning up shared member objects
 * 
 * 引用计数
 *   - 如果有对象共享的情况, 那清理问题就会变得复杂, 此时并不能简单地调用清理方法了;
 *     这时该使用的是引用计数来跟踪仍旧访问着共享对象的对象数量
 *     
 *   - static long counter跟踪所创建的实例数量, 还能提供id值
 *     final long id是每个实例对象的唯一标识
 *     这两个变量是long而不是int, 是为了防止溢出
 * 
 * @author GT-R
 * @date 2015年3月30日 上午11:10:43
 */
public class ReferenceCounting {
	public static void main(String[] args) {
		Shared shared = new Shared();
		Composing[] composing = {
			new Composing(shared), new Composing(shared),
			new Composing(shared), new Composing(shared), new Composing(shared)
		};
		
		for (Composing c : composing) {
			c.dispose();
		}
	}
}

class Shared {
	private int refCount = 0;
	private static long counter = 0;
	private final long id = counter++;
	
	public Shared() {
		System.out.println("Creating " + this);
	}
	
	public void addRef() {
		refCount++;
	}
	
	protected void dispose() {
		if (--refCount == 0) {
			System.out.println("Disposing " + this);
		}
	}
	
	public String toString() {
		return "Shared " + id;
	}
}

class Composing {
	private Shared shared;
	private static long counter = 0;
	private final long id = counter++;
	
	public Composing(Shared shared) {
		System.out.println("Creating " + this);
		this.shared = shared;
		this.shared.addRef();
	}
	
	protected void dispose() {
		System.out.println("disposing " + this);
		shared.dispose();
	}
	
	public String toString() {
		return "Composing " + id;
	}
}