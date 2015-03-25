package com.gtr.e_reusing_classes.inheritance;

/**
 * 继承中没有默认构造器
 *   - 这时必须使用关键字super显式地调用父类构造器
 * 
 * @author GT-R
 * @date 2015年3月21日 下午4:51:27
 */
public class Chess extends BoardGame {
	public Chess() {
		super(11);
		System.out.println("Chess constructor");
	}

	public static void main(String[] args) {
		Chess chess = new Chess();
		System.out.println(chess);
	}
}

class Game {
	Game(int i) {
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game {
	public BoardGame(int i) {
		super(i);
		System.out.println("BoardGame constructor");
	}
}