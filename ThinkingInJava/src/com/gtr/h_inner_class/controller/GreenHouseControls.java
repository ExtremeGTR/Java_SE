package com.gtr.h_inner_class.controller;

/**
 * 细节
 *   - light灯, water水, thermostat恒温器 三个数据成员都是属于外围类GreenHouseControls;
 *     而所有内部类都能自由访问这些数据成员
 *   
 *   - 使用内部类后是多么像多重继承: Bell和Restart有Event方法, 并且似乎也拥有外围类GreenHouseControls的所有方法
 *   
 *   - 由于Restart也是Event, 因此可以将Restart对象添加到Restart.action()中,
 *     以使系统能够有规律地重启自己
 * 
 * @author GT-R
 * @date 2015年4月8日 下午5:52:33
 */
public class GreenHouseControls extends Controller {
	@SuppressWarnings("unused")
	private boolean light = false;
	
	public class LightOn extends Event {
		public LightOn(long delayTime) { super(delayTime); }
		
		@Override
		public void action() {
			// put hardware control code here to
			// physically turn on the light
			light = true;
		}
		
		public String toString() { return "Light is on"; }
	}
	
	public class LightOff extends Event {
		public LightOff(long delayTime) { super(delayTime); }
		
		@Override
		public void action() {
			// put hardware control code here to
			// physically turn off the light
			light = false;
		}
		
		public String toString() { return "Light is off"; }
	}
	
	@SuppressWarnings("unused")
	private boolean water = false;
	
	public class WaterOn extends Event {
		public WaterOn(long delayTime) { super(delayTime); }
		
		@Override
		public void action() {
			// put hardware control code here
			water = true;
		}
		
		public String toString() { return "GreenHouse water is on"; }
	}
	
	public class WaterOff extends Event {
		public WaterOff(long delayTime) { super(delayTime); }

		@Override
		public void action() {
			// put hardware control code here
			water = false;
		}
		
		public String toString() { return "GreenHouse water is off"; }
	}
	
	@SuppressWarnings("unused")
	private String thermostat = "Day";
	
	public class ThermostatNight extends Event {
		public ThermostatNight(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// put hardware control code here
			thermostat = "Night";
		}
		
		public String toString() {
			return "Thermostat on night setting";
		}
	}
	
	public class ThermostatDay extends Event {
		public ThermostatDay(long delayTime) {
			super(delayTime);
		}

		@Override
		public void action() {
			// put hardware control code here
			thermostat = "Day";
		}
		
		public String toString() {
			return "Thermostat on day setting";
		}
	}
	
	// an example of an action() that inserts a
	// new one of itself into the event list
	public class Bell extends Event {
		public Bell(long delayTime) { super(delayTime); }
		
		@Override
		public void action() {
			addEvent(new Bell(delayTime));
		}
		
		public String toString() { return "Bing!"; }
	}
	
	public class Restart extends Event {
		private Event[] eventList;
		
		public Restart(long delayTime, Event[] eventList) {
			super(delayTime);
			this.eventList = eventList;
			for (Event e : eventList) {
				addEvent(e);
			}
		}

		@Override
		public void action() {
			for (Event e : eventList) {
				e.start(); // return each event
				addEvent(e);
			}
			start(); // return this Event
			addEvent(this);
		}
		
		public String toString() {
			return "restarting system";
		}
	}
	
	public static class Terminate extends Event {
		public Terminate(long delayTime) { super(delayTime); }
		
		@Override
		public void action() { System.exit(0); }
		
		public String toString() { return "Terminating"; }
	}
}