package com.gtr.a_operator;

/**
 * 赋值
 *   - 取右边的值, 把它复制到左边, 就叫做赋值
 *   - 右值可以是任何常数, 变量或表达式
 *   - 左值必须是一个明确并且已命名的变量
 *   
 *   - 对象使用=操作符的赋值操作只是将后者的引用赋给前者,
 *     使得两个引用都指向同一个对象,
 *     而不是真正意义上的创建对象的副本
 *     
 * @author GT-R
 * @date 2015年2月24日 下午2:15:01
 */
public class Assignment {
	public static void main(String[] args) {
		Tank t1 = new Tank();
		Tank t2 = new Tank();
		
		t1.level = 9;
		t2.level = 47;
		
		System.out.println("1: t1.level: " + t1.level + 
				", t2.level: " + t2.level);
		t1 = t2;
		
		System.out.println("1: t1.level: " + t1.level + 
				", t2.level: " + t2.level);

		t1.level = 27;
		
		System.out.println("1: t1.level: " + t1.level + 
				", t2.level: " + t2.level);
	}
}

class Tank {
	int level;
}
