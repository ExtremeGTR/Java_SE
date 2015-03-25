package com.gtr.e_reusing_classes.final_keyword;

/**
 * 继承与初始化
 *   - 父类与子类的初始化动作
 *     1.访问子类的static成员时 (构造器, static方法, static数据成员),
 *       类加载器就会启动并寻找子类的.class文件, 并对它进行加载,
 *       发现继承了父类, 它会继续加载父类, 若父类自身还有父类, 则这个过程一直递归下去
 *       
 *     2.根父类中的static初始化就会被执行, 然后是下一级子类的, 以此类推
 *       (子类的static初始化可能会依赖于父类成员能否被正确初始化, 因此这个过程式很重要的)
 *       
 *     3.经过1,2两个步骤, 所有类加载完毕并且static成员都被正确初始化, 对象就可以被创建了;
 *       子类对象创建过程中,
 *       首先, 调用子类对象的构造器时, 会调用父类的构造器,
 *       然后, 父类所有非静态成员会被设置默认值, 再按照定义处给出的初始值进行初始化, 最后执行实例初始化
 *       接着, 执行父类构造器剩余的代码,
 *       最后, 执行子类构造器剩余的代码,
 *       以上过程在子类与父类中以此类推   
 * 
 * @author GT-R
 * @date 2015年3月25日 上午11:24:25
 */
public class Beetle extends Insect {
	private static int x2 = printInit("static Beetle.x2 initialized");
	
	private int k = printInit("Beetle.k initialized");
	
	public Beetle() {
		System.out.println("k = " + k);
		System.out.println("j = " + j);
	}
	
	public String toString() {
		return "x2 = " + x2 + ", k = " + k;
	}
	
	public static void main(String[] args) {
		System.out.println("Beetle constructor");
		Beetle b = new Beetle();
		System.out.println(b);
	}
}

class Insect {
	private static int x1 = printInit("static Insect.x1 initialized");
	
	static int printInit(String s) {
		System.out.println(s);
		return 47;
	}
	
	private int i = 9;
	private int v = printInit("Insect.v initialized");
	protected int j;
	
	Insect() {
		System.out.println("i = " + i + ", j = " + j);
		j = 39;
	}
	
	public String toString() {
		return "x1 = " + x1 + ", i = " + i + ", j = " + j + ", v = " + v;
	}
}
