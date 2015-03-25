package com.gtr.e_reusing_classes.final_keyword;

/**
 * final类
 *   - final修饰类的时候, 表示此类不需要做任何变动, 即不能继承该类产生子类;
 *     并且final类中的所有方法都隐式指定为final
 *   
 * @author GT-R
 * @date 2015年3月25日 上午11:09:54
 */
public class Jurassic {
	public static void main(String[] args) {
		Dinosaur n = new Dinosaur();
		n.f();
		n.i = 40;
		n.j++;
	}
}

class SmallBrain {
	
}

final class Dinosaur {
	int i = 7;
	int j = 1;
	SmallBrain smallBrain = new SmallBrain();
	
	void f() { }
}

// can't extend final class 'Dinosaur'
//! class Further extends Dinosaur { }