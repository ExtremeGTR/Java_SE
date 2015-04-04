package com.gtr.g_interface.complete_decoupling.filters;

/**
 * @author GT-R
 * @date 2015年4月1日 下午2:14:28
 */
public class HighPass extends Filter {
	double cutoff;
	
	public HighPass(double cutoff) { this.cutoff = cutoff; }
	
	public Waveform process(Waveform input) { return input; }
}