package com.gtr.h_inner_class;

/**
 * 使用匿名内部类改进
 * 
 * @author GT-R
 * @date 2015年4月7日 下午2:05:02
 */
public class Games {
	public static void playGame(GameFactory factory) {
		Game game = factory.getGame();
		while (game.move()) {
			
		}
	}
	
	public static void main(String[] args) {
		playGame(Checkers.factory);
		playGame(Chess.factory);
	}
}

interface Game { boolean move(); }
interface GameFactory { Game getGame(); }

class Checkers implements Game {
	private int moves = 0;
	private static final int MOVES = 3;
	
	private Checkers() { }
	
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Checkers();
		}
	};
}

class Chess implements Game {
	private int moves = 0;
	private static final int MOVES = 4;
	
	private Chess() { }
	
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
	
	public static GameFactory factory = new GameFactory() {
		@Override
		public Game getGame() {
			return new Chess();
		}
	};
}
