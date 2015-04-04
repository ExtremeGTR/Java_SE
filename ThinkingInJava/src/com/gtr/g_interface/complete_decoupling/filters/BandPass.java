package com.gtr.g_interface.complete_decoupling.filters;

/**
 * @author GT-R
 * @date 2015年4月1日 下午2:15:57
 */
public class BandPass extends Filter {
	double lowCutoff, highCutoff;
	
	public BandPass(double lowCutoff, double highCutoff) {
		this.lowCutoff = lowCutoff;
		this.highCutoff = highCutoff;
	}
	
	public Waveform process(Waveform input) { return input; }
}
