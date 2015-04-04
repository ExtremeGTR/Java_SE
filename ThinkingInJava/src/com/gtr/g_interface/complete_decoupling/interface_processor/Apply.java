package com.gtr.g_interface.complete_decoupling.interface_processor;

/**
 * 将process方法参数类型改为更通用的Processor接口类型
 * 
 * @author GT-R
 * @date 2015年4月1日 下午3:02:29
 */
public class Apply {
	public static void process(Processor processor, Object input) {
		System.out.println("Using Processor " + processor.name());
		System.out.println(processor.process(input));
	}
}