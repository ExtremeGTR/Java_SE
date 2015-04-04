package com.gtr.g_interface.complete_decoupling.class_processor;

import java.util.Arrays;

/**
 * 
 * 
 * @author GT-R
 * @date 2015年4月1日 下午1:37:54
 */
public class Apply {
	public static void process(Processor processor, Object obj) {
		System.out.println("Using Processor " + processor.name());
		Object result = processor.process(obj);
		System.out.println(result);
	}
	
	public static String msg = 
		"Disagreement with beliefs is by definition incorrect";
	
	public static void main(String[] args) {
		process(new Upcase(), msg);
		process(new Downcase(), msg);
		process(new Splitter(), msg);
	}
}

class Processor {
	public String name() {
		return getClass().getSimpleName();
	}
	
	Object process(Object input) { return input; }
}

class Upcase extends Processor {
	// convariant return 
	String process(Object input) {
		return ((String) input).toUpperCase(); 
	}
}

class Downcase extends Processor {
	String process(Object input) {
		return ((String) input).toLowerCase();
	}
}

class Splitter extends Processor {
	String process(Object input) {
		// the split() argument divides a String into pieces
		return Arrays.toString(((String) input).split(" "));
	}
}