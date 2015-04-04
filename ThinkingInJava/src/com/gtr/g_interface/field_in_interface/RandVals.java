package com.gtr.g_interface.field_in_interface;

import java.util.Random;

/**
 * 在接口中定义的数据成员不能是"空final",
 * 但是可以用非常亮表达式进行初始化
 * 
 * @author GT-R
 * @date 2015年4月3日 上午11:34:09
 */
public interface RandVals {
	Random RAND = new Random(47);
	int RANDOM_INT = RAND.nextInt(47);
	long RANDOM_LONG = RAND.nextLong() * 10;
	float RANDOM_FLOAT = RAND.nextFloat();
	double RANDOM_DOUBLE = RAND.nextDouble() * 10;
}
