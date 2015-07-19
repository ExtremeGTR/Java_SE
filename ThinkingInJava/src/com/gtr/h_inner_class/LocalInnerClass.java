package com.gtr.h_inner_class;

/**
 * 局部内部类
 *   - 在代码块内创建内部类, 它不能有访问说明符;
 *     但它能够访问代码块内的常量以及外围类的所有成员
 * 
 * @author GT-R
 * @date 2015年4月11日 下午2:34:14
 */
public class LocalInnerClass {
	private int count = 0;
	
	Counter getCounter(final String name) {
		// a local inner class
		class LocalCounter implements Counter {
			public LocalCounter() {
				// local inner class can have a constructor
				System.out.println("LocalCounter()");
			}
			
			public int next() {
				System.out.println(name); // access local final
				return count++;
			}
		}
		
		return new LocalCounter();
	}
	
	Counter getCounter2(final String name) {
		return new Counter() {
			// anonymous inner class can't have a named
			// constructor, only an instance initializer
			{
				System.out.println("Counter()");
			}
			@Override
			public int next() {
				System.out.println(name);
				return count++;
			}
		};
	}
	
	public static void main(String[] args) {
		LocalInnerClass lic = new LocalInnerClass();
		Counter c1 = lic.getCounter("Local inner ");
		Counter c2 = lic.getCounter2("Anonymous inner ");
		for (int i = 0; i < 5; i++) {
			System.out.println(c1.next());
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(c2.next());
		}
	}
}

interface Counter {
	int next();
}