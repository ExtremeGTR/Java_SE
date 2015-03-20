package com.gtr.d_access_control;

import java.util.ArrayList;

/**
 * package与import
 *  - package和import是将单一的全局名字空间分割开
 *   
 *  - Java解释器的运行过程:
 *    1.首先, 找出环境变量CLASSPATH
 *      CLASSPATH包含一个或多个目录, 用作查找.class文件的根目录
 *       
 *    2.从根目录开始, 解释器获取包的名称并将每个句点替换成斜杠(正反取决于操作系统),
 *      以从CLASSPATH根中产生一个路径名称
 *         
 *    3.产生的路径会与CLASSPATH中的各个不同的项相连接,
 *      解释器就在这些目录中查找与你所要创建的类名称相关的.class文件
 *         
 *  - java中虽然没有C的条件编译功能,
 *    但是, 可以通过修改import的包路径来实现代码的调试版和发布版的切换
 * 
 * @author GT-R
 * @date 2015年3月19日 上午11:07:27
 */
public class SingleImport {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		System.out.println(list);
	}
}
