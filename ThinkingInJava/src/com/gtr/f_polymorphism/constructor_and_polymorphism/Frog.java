package com.gtr.f_polymorphism.constructor_and_polymorphism;

/**
 * inheritance and cleanup
 * 
 * 类关系图
 * | Characteristic - 特性, Description - 描述
 * 
 * | LivingCreature - 生物
 * --| Animal       - 动物
 * ----| Amphibian  - 两栖动物
 * ------| Frog     - 青蛙
 * 
 * 其中, 这4个类中都包含了Characteristic和Description成员对象
 * 
 * 继承与清理
 *   - 一般情况下, 垃圾回收器会帮我们解决对象的清理问题;
 *     但如果确实遇到需要自身手动清理的问题, 那必须为类创建一个方法进行清理操作
 *     此处是dispose()方法
 *     
 *   - 清理动作一般都遵循这个规则:
 *     组合关系, 对象销毁的顺序和创建的顺序相反;
 *     继承关系, 应该先对子类进行清理, 然后再对父类进行清理
 * 
 * @author GT-R
 * @date 2015年3月29日 下午9:10:09
 */
public class Frog extends Amphibian {
	private Characteristic p = new Characteristic("Croaks");
	private Description t = new Description("Eats Bugs");
	
	public Frog() {
		System.out.println("Frog()");
	}
	
	protected void dispose() {
		System.out.println("Frog dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
	
	public static void main(String[] args) {
		Frog frog = new Frog();
		System.out.println("Bye!");
		frog.dispose();
	}
}

class Characteristic {
	private String s;
	
	Characteristic(String s) {
		this.s = s;
		System.out.println("Creating Characteristic " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Characteristic " + s);
	}
}

class Description {
	private String s;
	
	Description(String s) {
		this.s = s;
		System.out.println("Creating Description " + s);
	}
	
	protected void dispose() {
		System.out.println("disposing Description " + s);
	}
}

class LivingCreature {
	private Characteristic p = new Characteristic("is alive");
	private Description t = new Description("Basic Living Creature");
	
	LivingCreature() {
		System.out.println("LivingCreature()");
	}
	
	protected void dispose() {
		System.out.println("LivingCreature dispose");
		t.dispose();
		p.dispose();
	}
}

class Animal extends LivingCreature {
	private Characteristic p = new Characteristic("has heart");
	private Description t = new Description("Animal not Vegetable");
	
	Animal() {
		System.out.println("Animal()");
	}
	
	protected void dispose() {
		System.out.println("Animal dispose");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}

class Amphibian extends Animal {
	private Characteristic p = new Characteristic("can live in water");
	private Description t = new Description("Both water and land");
	
	Amphibian() {
		System.out.println("Amphbian()");
	}
	
	protected void dispose() {
		System.out.println("Amphibian()");
		t.dispose();
		p.dispose();
		super.dispose();
	}
}
