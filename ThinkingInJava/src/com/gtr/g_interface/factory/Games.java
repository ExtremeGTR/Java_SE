package com.gtr.g_interface.factory;

/**
 * 利用工厂方法创建对象就像是利用构造器创建对象, 那为何要添加这种额外的间接性?
 *   - 一个最常见的理由就是: 为了搭建更加通用的框架
 *   
 * 选择类还是选择接口?
 *   - 优先选择类而不是接口, 如果到处都使用接口, 这是一种草率的设计,
 *     并且由此带来额外的复杂性; 如果接口的必要性变得非常明确,
 *     那原有的类就能用接口进行重构
 * 
 * @author GT-R
 * @date 2015年4月4日 下午2:18:29
 */
public class Games {
	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move())
			;
	}
	
	public static void main(String[] args) {
		playGame(new CheckersFactory());
		playGame(new ChessFactory());
	}
}

interface Game { 
	boolean move();
}

interface GameFactory {
	Game getGame();
}

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;
	
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}

class CheckersFactory implements GameFactory {
	public Game getGame() {
		return new Checkers();
	}
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
}

class ChessFactory implements GameFactory {
	public Game getGame() {
		return new Chess();
	}
}