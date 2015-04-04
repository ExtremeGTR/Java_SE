package com.gtr.g_interface.complete_decoupling.filters;

/**
 * @author GT-R
 * @date 2015年4月1日 下午2:00:01
 */
public class Waveform {
	private static long counter;
	private final long id = counter++;
	
	public String toString() { return "Waveform " + id; }
}