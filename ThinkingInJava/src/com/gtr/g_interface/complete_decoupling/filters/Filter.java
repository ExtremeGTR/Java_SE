package com.gtr.g_interface.complete_decoupling.filters;

/**
 * 耦合过紧
 *   - Filter类与Processor具有相同的接口,
 *     但是不能将Apply.process()处理Filter,
 *     因Filter不再Processor的继承链中,
 *     所以, 可以说Processor与Apply.process()耦合过紧
 * 
 * @author GT-R
 * @date 2015年4月1日 下午2:01:27
 */
public class Filter {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public Waveform process(Waveform input) { return input; }
}