package com.gtr.e_reusing_classes.proxy;

/**
 * 使用代理, 可以拥有更多的控制力
 * 
 * @author GT-R
 * @date 2015年3月22日 上午12:27:04
 */
public class SpaceShipDelegation {
	private String name;
	private SpaceShipControls controls = new SpaceShipControls();
	
	public SpaceShipDelegation(String name) {
		this.name = name;
	}
	
	public void back(int velocity) {
		controls.back(velocity);
	}
	
	public void down(int velocity) {
		controls.down(velocity);
	}
	
	public void forward(int velocity) {
		controls.forward(velocity);
	}
	
	public void left(int velocity) {
		controls.left(velocity);
	}
	
	public void right(int velocity) {
		controls.right(velocity);
	}
	
	public void turboBoost(int velocity) {
		controls.turboBootst();
	}
	
	public void up(int velocity) {
		controls.up(velocity);
	}
	
	public String toString() { return name; }
	
	public static void main(String[] args) {
		SpaceShipDelegation protector = new SpaceShipDelegation("NSEA Protector");
		protector.forward(100);
	}
}
