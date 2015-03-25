package com.gtr.e_reusing_classes;

/**
 * 使用继承组合技术时确保正确清理内存
 *   - 将清理动作置于finally子句中, 以防异常的出现,
 *     finally子句表示 "无论发生什么事, 一定要执行块中语句"
 * 
 * @author GT-R
 * @date 2015年3月22日 下午4:25:45
 */
public class CADSystem extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];
	
	public CADSystem(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++) {
			lines[j] = new Line(j, j * j);
		}
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined constructor");
	}
	
	@Override
	void dispose() {
		System.out.println("CADSystem.dispose()");
		// the order of clearup is the reverse
		// of the order of initialization
		t.dispose();
		c.dispose();
		for (int i = 0; i < lines.length; i++) {
			lines[i].dispose();
		}
		super.dispose();
	}
	
	public static void main(String[] args) {
		CADSystem sys = new CADSystem(47);
		try {
			// code and exception handing...
		} finally {
			sys.dispose();
		}
	}
}

class Shape {
	public Shape(int i) {
		System.out.println("Shape constructor");
	}
	
	void dispose() {
		System.out.println("Shape dispose");
	}
}

class Circle extends Shape {
	Circle(int i) {
		super(i);
		System.out.println("Drawing Circle");
	}
	
	@Override
	void dispose() {
		System.out.println("Erasing Circle");
		super.dispose();
	}
}

class Triangle extends Shape {
	public Triangle(int i) {
		super(i);
		System.out.println("Drawing Triangle");
	}
	
	@Override
	void dispose() {
		System.out.println("Erasing Triangle");
		super.dispose();
	}
}

class Line extends Shape {
	private int start, end;
	
	public Line(int start, int end) {
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing Line: " + start + ", " + end);
	}
	
	@Override
	void dispose() {
		System.out.println("Erasing Line: " + start + ", " + end);
		super.dispose();
	}
}

