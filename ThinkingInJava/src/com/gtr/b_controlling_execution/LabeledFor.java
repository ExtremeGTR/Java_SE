package com.gtr.b_controlling_execution;

/**
 * 在for循环中使用标签进行跳转
 *   - 通用格式
 *     标签名后跟冒号(labelName:)
 *   
 *   - 标签可以和continue或break一起使用
 * 
 * @author GT-R
 * @date 2015年3月11日 下午1:10:55
 */
public class LabeledFor {
	public static void main(String[] args) {
		int i = 0;
		outer: // can't have statements here
		for (; true; ) {
			inner: // can't have statements here
			for (; i < 10; i++) {
				System.out.println("i = " + i);
				if (i == 2) {
					System.out.println("continue");
					continue;
				}
				if (i == 3) {
					System.out.println("break");
					i++; // otherwise i never gets incremented
					break;
				}
				if (i == 7) {
					System.out.println("continue outer");
					i++; // otherwise i never gets incremented
					continue outer;
				}
				if (i == 8) {
					System.out.println("break outer");
					break outer;
				}
				for (int k = 0; k < 5; k++) {
					if (k == 3) {
						System.out.println("continue inner");
						continue inner;
					}
				}
			}
		}
		System.out.println("end");
	}
}
