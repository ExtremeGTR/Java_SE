package com.gtr.f_polymorphism.design;

/**
 * dynamically changing the behavior of an object
 * via composition (the "State" design pattern)
 * 
 * 通过组合技术动态改变对象的行为(状态设计模式)
 * 
 * 使用继承与组合进行设计
 *   - 一条通用的准则:
 *     用继承表达行为之间的差异, 并用组合表达状态上的变化,
 *     即通过继承所覆盖的方法表现类之间的行为差异, 运用组合的成员对象来表达自身状态的变化
 * 
 * @author GT-R
 * @date 2015年3月31日 上午11:20:46
 */
public class Transmogrify {
	public static void main(String[] args) {
		Stage stage = new Stage();
		stage.performPlay();
		stage.change();
		stage.performPlay();
	}
}

class Actor {
	public void act() { }
}

class HappyActor extends Actor {
	public void act() {
		System.out.println("HappyActor");
	}
}

class SadActor extends Actor {
	public void act() {
		System.out.println("SadActor");
	}
}

class Stage {
	private Actor actor = new HappyActor();
	
	public void change() {
		actor = new SadActor();
	}
	
	public void performPlay() {
		actor.act();
	}
}