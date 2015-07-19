package com.gtr.h_inner_class.controller;

/**
 * 这个类的作用是初始化系统, 所以它添加了所有相应的事件
 *   - 通过添加各种不同的Event对象来配置该系统, 这就是命令设计模式
 * 
 * @author GT-R
 * @date 2015年4月8日 下午3:57:08
 */
public class GreenHouseController {
	public static void main(String[] args) {
		GreenHouseControls gc = new GreenHouseControls();
		// instead of hard-wiring, you could parse
		// configuration information from a text file here
		gc.addEvent(gc.new Bell(900));
		Event[] eventList = {
			gc.new ThermostatNight(0),
			gc.new LightOn(200),
			gc.new LightOff(400),
			gc.new WaterOn(600),
			gc.new WaterOff(800),
			gc.new ThermostatDay(1400)
		};
		gc.addEvent(gc.new Restart(2000, eventList));
		gc.addEvent(new GreenHouseControls.Terminate(3000));
		
		gc.run();
	}
}