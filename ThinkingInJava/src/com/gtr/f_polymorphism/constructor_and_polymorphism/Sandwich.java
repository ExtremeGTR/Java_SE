package com.gtr.f_polymorphism.constructor_and_polymorphism;

/**
 * 构造器与多态
 *   - 在创建具有复杂继承结构的子类型对象时, 构造器的调用顺序是:
 *       1.调用父类构造器, 这个步骤会不断地反复递归下去, 直到达到顶级父类构造器
 *         
 *       2.若类包含有其他对象, 则按声明顺序调用成员的初始方法
 *       
 *       3.执行子类构造器的主体代码
 * 
 * @author GT-R
 * @date 2015年3月27日 下午10:00:53
 */
@SuppressWarnings("unused")
public class Sandwich extends PortableLunch {
	private Bread b = new Bread();
	private Cheese c = new Cheese();
	private Lettuce l = new Lettuce();

	public Sandwich() {
		System.out.println("Sandwich()");
	}
	
	public static void main(String[] args) {
		new Sandwich();
	}
}

class Meal {
	Meal() {
		System.out.println("Meal()");
	}
}

class Bread {
	Bread() {
		System.out.println("Bread()");
	}
}

class Cheese {
	Cheese() {
		System.out.println("Cheese()");
	}
}

class Lettuce {
	Lettuce() {
		System.out.println("Lettuce()");
	}
}

class Lunch extends Meal {
	Lunch() {
		System.out.println("Lunch()");
	}
}

class PortableLunch extends Lunch {
	PortableLunch() {
		System.out.println("PortableLunch()");
	}
}
