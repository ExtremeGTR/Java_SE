package com.gtr.e_reusing_classes.proxy;

/**
 * 继承会暴露所有的成员方法, 而SpaceShip并非真正的SpaceShipControls类型
 * 
 * @author GT-R
 * @date 2015年3月22日 上午12:09:56
 */
public class SpaceShip extends SpaceShipControls {
	private String name;
	
	public SpaceShip(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		SpaceShip protector = new SpaceShip("NSEA Protector");
		protector.forward(100);
	}
}
