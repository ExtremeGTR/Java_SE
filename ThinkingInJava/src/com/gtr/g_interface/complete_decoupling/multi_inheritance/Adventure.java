package com.gtr.g_interface.complete_decoupling.multi_inheritance;

/**
 * Java中的多重继承
 *   - Hero组合了具体类ActionCharacter和接口CanFight, CanSwim, CanFly;
 *     当通过这种方式将一个具体类和多个接口组合到一起时, 这个具体类必须放在最前,
 *     后面跟着才是接口
 *     
 *   - 使用接口的原因
 *       1.为了能够向上转型为多个基类型
 *       2.与使用抽象基类相同: 防止客户端程序员创建该类型的对象, 并确保这仅仅是建立一个接口
 * 
 * @author GT-R
 * @date 2015年4月1日 下午11:35:11
 */
public class Adventure {
	public static void t(CanFight x) { x.fight(); }
	
	public static void u(CanSwim x) { x.swim(); }
	
	public static void v(CanFly x) { x.fly(); }
	
	public static void w(ActionCharacter x) { x.fight(); }
	
	public static void main(String[] args) {
		Hero hero = new Hero();
		t(hero); // Treat it as a CanFight
		u(hero); // Treat it as a CanSwim
		v(hero); // Treat it as a CanFly
		w(hero); // Treat it as an ActionCharacter
	}
}

interface CanFight {
	void fight();
}

interface CanSwim {
	void swim();
}

interface CanFly {
	void fly();
}

class ActionCharacter {
	public void fight() { }
}

class Hero extends ActionCharacter
		implements CanFight, CanSwim, CanFly {
	public void swim() { }
	
	public void fly() { }
}