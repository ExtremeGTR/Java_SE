package com.gtr.i_container.stack;

import com.gtr.utils.Stack;

/**
 * @author GT-R
 * @date 2015年5月3日 下午7:43:10
 */
public class StackTest {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		for (String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
	}
}
