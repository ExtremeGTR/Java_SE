package com.gtr.b_fourth_unit_controlling_execution;

/**
 * 在while循环中使用标签进行跳转
 *   - 带标签的continue会到达标签的位置, 并重新进入紧接在那个标签后面的循环
 *   
 *   - 带标签的break会中断并跳出标签所指的循环
 * 
 * @author GT-R
 * @date 2015年3月11日 下午1:16:44
 */
public class LabeledWhile {
	public static void main(String[] args) {
		int i = 0;
		outer:
		while (true) {
			i++;
			System.out.println("i = " + i);
			if (i == 1) {
				System.out.println("continue");
				continue;
			}
			if (i == 3) {
				System.out.println("continue outer");
				continue outer;
			}
			if (i == 5) {
				System.out.println("break");
				break;
			}
			if (i == 7) {
				System.out.println("break outer");
				break outer;
			}
		}
		System.out.println("end");
	}
}
