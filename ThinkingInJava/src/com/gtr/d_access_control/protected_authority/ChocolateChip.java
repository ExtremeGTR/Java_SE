package com.gtr.d_access_control.protected_authority;

/**
 * 在同一个包中继承Cookie类使用它的protected方法
 * 
 * @author GT-R
 * @date 2015年3月20日 下午2:35:46
 */
public class ChocolateChip extends Cookie {
	public ChocolateChip() {
		System.out.println("ChocolateChip default constructor");
	}
	
	public void chomp() {
		bite(); // protected method
	}
	
	public static void main(String[] args) {
		ChocolateChip chocolateChip = new ChocolateChip();
		chocolateChip.chomp();
	}
}
