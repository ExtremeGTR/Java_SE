package com.gtr.h_inner_class.controller;

/**
 * 事件
 *   - 基于时间去执行控制
 *   
 *   - start()首先获取当前时间, 然后加延迟时间, 生成触发事件的时间
 *     如果想要重复一个事件, 只需要简单地在action()中调用start()方法
 *   
 *   - ready()告诉你何时可以运行action()方法
 *     可以在子类覆盖ready()方法, 使得Event能够基于时间以外的其他因素而触发
 * 
 * @author GT-R
 * @date 2015年4月8日 下午4:12:43
 */
public abstract class Event {
	private long eventTime;
	protected final long delayTime;
	
	public Event(long delayTime) {
		this.delayTime = delayTime;
		start();
	}
	
	public void start() {
		eventTime = System.nanoTime() + delayTime;
	}
	
	public boolean ready() {
		return System.nanoTime() >= eventTime;
	}
	
	public abstract void action();
}