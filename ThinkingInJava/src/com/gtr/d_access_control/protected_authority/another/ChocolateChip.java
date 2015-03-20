package com.gtr.d_access_control.protected_authority.another;

import com.gtr.d_access_control.protected_authority.Cookie;

/**
 * 在其他包创建一个继承自Cookie的类, 同样可以调用protected方法
 * 
 * @author GT-R
 * @date 2015年3月20日 下午2:57:08
 */
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip default constructor");
	}
	
	public void chomp() {
		bite(); // protected method
	}
}
