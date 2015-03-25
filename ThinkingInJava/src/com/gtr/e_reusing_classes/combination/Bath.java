package com.gtr.e_reusing_classes.combination;

/**
 * 创建新类型数据成员可进行初始化的位置
 *   - 1.在定义的地方, 这意味着他们总在构造器被调用之前被初始化
 *     2.在构造器中
 *     3.在正要使用这些对象之前, 这种方式称为惰性初始化
 *     4.实例初始化块
 * 
 * @author GT-R
 * @date 2015年3月21日 下午1:31:23
 */
public class Bath {
	// initialization at point of definition
	private String
	    s1 = "Happy",
	    s2 = "Happy",
	    s3, s4;
	
	private Soup castille;
	private int i;
	private float toy;
	
	public Bath() {
		System.out.println("Inside Bath()");
		s3 = "Joy";
		toy = 3.14f;
		castille = new Soup();
	}
	
	// instance initialization
	{
		i = 47; 
	}
	
	public String toString() {
		// delayed intialization
		if (s4 == null) {  
			s4 = "Joy";
		}
		return
		    "s1 = " + s1 + "\n" +
		    "s2 = " + s2 + "\n" +
		    "s3 = " + s3 + "\n" +
		    "s4 = " + s4 + "\n" +
		    "i = " + i + "\n" +
		    "toy = " + toy + "\n" +
		    "castille = " + castille;
		
	}
	
	public static void main(String[] args) {
		Bath b = new Bath();
		System.out.println(b);
	}
}

class Soup {
	private String s;
	
	Soup() {
		System.out.println("Soup()");
		s = "constructed";
	}
	
	public String toString() { return s; }
}