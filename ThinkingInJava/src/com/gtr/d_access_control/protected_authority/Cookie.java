package com.gtr.d_access_control.protected_authority;

/**
 * protected访问权限
 *   - protected修饰, 表示继承链中的所有类都可以访问该元素;
 *     并且, 该访问权限也提供包访问权限, 包内的其他类可以访问该protected元素
 * 
 * @author GT-R
 * @date 2015年3月20日 下午1:34:18
 */
public class Cookie {
	public Cookie() {
		System.out.println("Cookie default constructor");
	}
	
	protected void bite() {
		System.out.println("bite");
	}
	
	protected static void test() {
		System.out.println("test");
	}
}
