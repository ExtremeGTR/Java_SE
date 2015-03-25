package com.gtr.e_reusing_classes;

/**
 * 继承中重载名称屏蔽问题
 *   - 如果Java的父类拥有某个已被多次重载的方法名称,
 *     那么在子类中重新定义该方法名称并不会屏蔽其在基类中的任何版本(C++则不同)
 * 
 *   - Override注解可以防止你在不想重载时而意外进行了重载的行为
 *   
 * @author GT-R
 * @date 2015年3月23日 上午12:42:00
 */
public class Hide {
	public static void main(String[] args) {
		Bart b = new Bart();
		b.doh(1);
		b.doh('x');
		b.doh(1.0f);
		b.doh(new Milhouse());
	}
}

class Homer {
	char doh(char c) {
		System.out.println("doh(char)");
		return 'd';
	}
	
	float doh(float f) {
		System.out.println("doh(float)");
		return 1.0f;
	}
}

class Milhouse {
	
}

class Bart extends Homer {
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse)");
	}
}

class Lisa extends Homer {
	/*@Override
	void doh(Milhouse m) {
		System.out.println("doh(Milhouse");
	}*/
}
