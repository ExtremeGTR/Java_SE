package com.gtr.d_access_control.another;

import com.gtr.d_access_control.Cookie;

/**
 * 试图使用Cookie类包访问权限的bite方法
 * 
 * @author GT-R
 * @date 2015年3月20日 下午1:27:08
 */
public class Dinner {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Cookie cookie = new Cookie();
		//! cookie.bite(); // can't access
	}
}
