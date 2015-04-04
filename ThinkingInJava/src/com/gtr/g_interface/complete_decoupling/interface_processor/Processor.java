package com.gtr.g_interface.complete_decoupling.interface_processor;

/**
 * Processor接口
 * 
 * @author GT-R
 * @date 2015年4月1日 下午3:01:11
 */
public interface Processor {
	String name();
	Object process(Object input);
}