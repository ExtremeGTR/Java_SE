package com.gtr.h_inner_class;

/**
 * 接口内部的类
 *   - 如果想要创建某些公共代码, 使得它们可以被某个接口的所有不同实现所共用,
 *     那么使用接口内部的嵌套类才会显得更方便
 * 
 * @author GT-R
 * @date 2015年4月7日 下午9:21:56
 */
public interface ClassInterface {
	void howdy();
	
	class Test implements ClassInterface {
		public void howdy() {
			System.out.println("Howdy!");
		}
		
		public static void main(String[] args) {
			new Test().howdy();
		}
	}
}
