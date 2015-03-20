package com.gtr.d_access_control;

/**
 * public访问权限
 *   - public修饰表示该元素是公开可见的
 *   
 * 包访问权限
 *   - 不使用任何权限修饰符表示该元素是包访问权限, 也可以理解为friendly;
 *     即当前的包中的所有其他类对这个元素都有访问权限, 但对于包之外的所有类, 该元素是不可见的
 *     
 * private访问权限
 *   - private修饰表示, 除了包含该成员的类之外, 其他任何类都无法访问这个成员
 * 
 * @author GT-R
 * @date 2015年3月19日 下午11:53:32
 */
public class Cookie {
	private int type;
	
	public Cookie() {
		System.out.println("Cookie constructor");
	}
	
	// 包访问权限
	void bite() {
		System.out.println("bite");
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
}