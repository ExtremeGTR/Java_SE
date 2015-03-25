package com.gtr.e_reusing_classes;

/**
 * 结合使用组合和继承
 * 
 * @author GT-R
 * @date 2015年3月22日 上午11:52:05
 */
@SuppressWarnings("unused")
public class PlaceSetting extends Custom {
	private Spoon sp;
	private Fork frk;
	private Knife kn;
	private DinnerPlate pl;
	
	public PlaceSetting(int i) {
		super(i + 1);
		sp = new Spoon(i + 2);
		frk = new Fork(i + 3);
		kn = new Knife(i + 4);
		pl = new DinnerPlate(i + 5);
		System.out.println("PlaceSetting constructor");
	}
	
	public static void main(String[] args) {
		PlaceSetting ps = new PlaceSetting(9);
		System.out.println(ps);
	}
}

class Plate {
	Plate(int i) {
		System.out.println("Plate constructor");
	}
}

class DinnerPlate extends Plate {
	public DinnerPlate(int i) {
		super(i);
		System.out.println("Utensil constructor");
	}
}

class Utensil {
	Utensil(int i) {
		System.out.println("Utensil constructor");
	}
}

class Spoon extends Utensil {
	Spoon(int i) {
		super(i);
		System.out.println("Spoon constructor");
	}
}

class Fork extends Utensil {
	Fork(int i) {
		super(i);
		System.out.println("Fork constructor");
	}
}

class Knife extends Utensil {
	Knife(int i) {
		super(i);
		System.out.println();
	}
}

// a cultural way of doing something
class Custom {
	Custom(int i) {
		System.out.println("Custom constructor");
	}
}