package com.gtr.d_access_control;

import static com.gtr.utils.Print.*;

/**
 * 静态import语句
 *   - 这个语句可以直接导入静态方法和静态数据成员, 而使用的时候不需要再用类名引出
 *   
 * @author GT-R
 * @date 2015年3月19日 下午2:32:58
 */
public class StaticImport {
	public static void main(String[] args) {
		print("available from now on!");
		print(100);
		print(100L);
		print(3.14159);
	}
}
