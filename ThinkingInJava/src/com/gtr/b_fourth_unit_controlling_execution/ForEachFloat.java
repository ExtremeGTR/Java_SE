package com.gtr.b_fourth_unit_controlling_execution;

import java.util.Random;

/**
 * foreach循环
 * 
 * @author GT-R
 * @date 2015年3月9日 下午3:24:31
 */
public class ForEachFloat {
	public static void main(String[] args) {
		Random rand = new Random(47);
		float[] fArr = new float[10];
		for (int i = 0; i < 10; i++) {
			fArr[i] = rand.nextFloat();
		}
		for (float f : fArr) {
			System.out.println(f);
		}
	}
}
