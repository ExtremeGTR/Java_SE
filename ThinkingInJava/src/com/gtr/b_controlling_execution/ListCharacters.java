package com.gtr.b_controlling_execution;

/**
 * for循环语句
 *   - 通用格式
 *     for (initialization; boolean-expression; step)
 *       statement
 *       
 *   - 初始化表达式, 布尔表达式, 步进运算都可以为空
 *   
 *   - Character.isLowerCase()方法, 检测一个字符是否为小写字母
 * 
 * @author GT-R
 * @date 2015年3月9日 下午2:41:24
 */
public class ListCharacters {
	public static void main(String[] args) {
		for (char c = 0; c < 128; c++) {
			if (Character.isLowerCase(c)) {
				System.out.println("value: " + (int) c 
						+ " character: " + c);
			}
		}
	}
}
