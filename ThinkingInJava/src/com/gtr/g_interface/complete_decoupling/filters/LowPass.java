package com.gtr.g_interface.complete_decoupling.filters;

/**
 * @author GT-R
 * @date 2015年4月1日 下午2:06:51
 */
public class LowPass extends Filter {
	double cutoff;
	
	public LowPass(double cutoff) { this.cutoff = cutoff; }
	
	public Waveform process(Waveform input) {
		return input; // dummy processing
	}
}
