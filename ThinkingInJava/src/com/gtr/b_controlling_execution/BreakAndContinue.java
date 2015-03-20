package com.gtr.b_controlling_execution;

/**
 * break和continue
 *   - break是强制退出循环, 不再执行循环中剩余的语句
 *   
 *   - continue是结束本次迭代, 开始新一轮的迭代
 *   
 *   - while(true) 与 for(;;)都表示死循环
 * 
 * @author GT-R
 * @date 2015年3月10日 下午3:50:39
 */
public class BreakAndContinue {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if (i == 74) break; // out of for loop
			if (i % 9 != 0) continue; // next iteration
			System.out.print(i + " ");
		}
		System.out.println();
		int i = 0;
		while (true) {
			i++;
			int j = i * 27;
			if (j == 1269) break; // out of loop
			if (i % 10 != 0) continue; // top of loop
			System.out.print(i + " ");
		}
	}
}
