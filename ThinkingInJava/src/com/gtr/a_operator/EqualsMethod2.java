package com.gtr.a_operator;

/**
 * 自定义类型自带的equals()方法默认比较的是引用,
 * 需要重新定义使其正常工作
 * 
 * @author GT-R
 * @date 2015年2月28日 下午2:28:48
 */
public class EqualsMethod2 {
	public static void main(String[] args) {
		Value v1 = new Value();
		Value v2 = new Value();
		
		v1.i = v2.i = 100;
		System.out.println(v1.equals(v2));
	}
}

class Value {
	int i;
}