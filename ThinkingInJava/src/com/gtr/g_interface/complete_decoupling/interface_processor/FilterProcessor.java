package com.gtr.g_interface.complete_decoupling.interface_processor;

import com.gtr.g_interface.complete_decoupling.filters.BandPass;
import com.gtr.g_interface.complete_decoupling.filters.Filter;
import com.gtr.g_interface.complete_decoupling.filters.HighPass;
import com.gtr.g_interface.complete_decoupling.filters.LowPass;
import com.gtr.g_interface.complete_decoupling.filters.Waveform;

/**
 * 使用interface后, 将接口中具体视线中解耦出来,
 * 使得接口可以应用于多种不同的情况, 代码更具复用性
 * 
 * @author GT-R
 * @date 2015年4月1日 下午9:35:44
 */
public class FilterProcessor {
	public static void main(String[] args) {
		Waveform w = new Waveform();
		Apply.process(new FilterAdapter(new LowPass(1.0)), w);
		Apply.process(new FilterAdapter(new HighPass(2.0)), w);
		Apply.process(new FilterAdapter(new BandPass(3.0, 4.0)), w);
	}
}

// 当你无法修改想要使用的类, 但需要修改接口,
// 此时便可以用适配器设计模式
// 适配器中的代码将接受你所拥有的接口, 并产生你所需要的接口
class FilterAdapter implements Processor {
	Filter filter;
	
	public FilterAdapter(Filter filter) {
		this.filter = filter;
	}
	
	public String name() {
		return filter.name();
	}
	
	public Waveform process(Object input) {
		return filter.process((Waveform) input);
	}
}