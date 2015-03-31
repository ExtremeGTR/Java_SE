package com.gtr.f_polymorphism.covariant_return_type;

/**
 * 协变返回类型
 *   - 它表示在子类中的被覆盖的方法可以返回父类方法的返回类型的子类类型
 * 
 * @author GT-R
 * @date 2015年3月30日 下午7:28:55
 */
public class ConvariantReturn {
	public static void main(String[] args) {
		Mill m = new Mill();
		Grain g = m.process();
		System.out.println(g);
		
		m = new WheatMill();
		g = m.process();
		System.out.println(g);
	}
}

class Grain {
	public String toString() {
		return "Grain";
	}
}

class Wheat extends Grain {
	public String toString() {
		return "Wheat";
	}
}

class Mill {
	Grain process() {
		return new Grain();
	}
}

class WheatMill extends Mill {
	Wheat process() {
		return new Wheat();
	}
}