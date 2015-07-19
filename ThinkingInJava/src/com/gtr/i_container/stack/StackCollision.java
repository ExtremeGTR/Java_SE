package com.gtr.i_container.stack;

/**
 * 名称冲突
 *   - 使用包名可以防止名称冲突
 * 
 * @author GT-R
 * @date 2015年5月3日 下午8:52:26
 */
public class StackCollision {
	public static void main(String[] args) {
		com.gtr.utils.Stack<String> stack =
				new com.gtr.utils.Stack<String>();
		for (String s : "My dog has fleas".split(" ")) {
			stack.push(s);
		}
		while (!stack.isEmpty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();
		java.util.Stack<String> stack2 =
				new java.util.Stack<String>();
		for (String s : "My dog has fleas".split(" ")) {
			stack2.push(s);
		}
		while (!stack2.empty()) {
			System.out.print(stack2.pop() + " ");
		}
	}
}
