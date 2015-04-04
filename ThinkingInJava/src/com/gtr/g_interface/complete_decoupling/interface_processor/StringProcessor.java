package com.gtr.g_interface.complete_decoupling.interface_processor;

import java.util.Arrays;

/**
 * 使用接口的形式的Processor, 耦合更加松动,
 * 可以说这个是对之前的使用抽象类形式的Processor程序进行解耦
 * 
 * @author GT-R
 * @date 2015年4月1日 下午4:21:31
 */
public abstract class StringProcessor implements Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	
	public abstract String process(Object input);
	
	public static String msg =
		"If she weighs the same as a duck, she's made of wood";
	
	public static void main(String[] args) {
		Apply.process(new Upcase(), msg);
		Apply.process(new Downcase(), msg);
		Apply.process(new Splitter(), msg);
	}
}

class Upcase extends StringProcessor {
	public String process(Object input) {
		return ((String) input).toUpperCase();
	}
}

class Downcase extends StringProcessor {
	public String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends StringProcessor {
	public String process(Object input) {
		return Arrays.toString(((String) input).split(" "));
	}
}