package com.gtr.h_inner_class;

/**
 * 覆盖内部类
 *   - 当继承某个外围类, 并"覆盖"内部类时, 其实并没有特别的变化,
 *     两个内部类时完全独立的, 各自在自己的命名空间内
 * 
 * @author GT-R
 * @date 2015年4月10日 上午9:18:48
 */
public class BigEgg extends Egg {
	public class Yolk {
		public Yolk() {
			System.out.println("BigEgg.Yolk()");
		}
	}
	
	public static void main(String[] args) {
		new BigEgg();
	}
}

class Egg {
	@SuppressWarnings("unused")
	private Yolk y;
	
	protected class Yolk {
		public Yolk() {
			System.out.println("Egg.Yolk()");
		}
	}
	
	public Egg() {
		System.out.println("new Egg()");
		y = new Yolk();
	}
}