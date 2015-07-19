package com.gtr.h_inner_class.controller;

import java.util.ArrayList;
import java.util.List;

/**
 * the reusable framework for control systems
 * 
 * - run()方法循环遍历eventList, 寻找就绪的(ready()), 要运行的Event对象,
 *   对找到的每一个就绪的事件, 使用对象的toString()打印其信息, 再调用action(),
 *   最后从列表中移除该Event
 * 
 * @author GT-R
 * @date 2015年4月8日 下午5:19:28
 */
public class Controller {
	// a class from java.util to hold Event objects
	private List<Event> eventList = new ArrayList<Event>();
	
	public void addEvent(Event e) { eventList.add(e); }
	
	public void run() {
		while (eventList.size() > 0) {
			// make a copy so you're not modifying the list
			// while you're selecting the elements in it
			for (Event e : new ArrayList<Event>(eventList)) {
				if (e.ready()) {
					System.out.println(e);
					e.action();
					eventList.remove(e);
				}
			}
		}
	}
}