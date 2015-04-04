package com.gtr.g_interface.extend_interface;

/**
 * 接口可以通过extends关键字进行扩展
 * 
 * | Monster
 * --| DangerousMonter
 * ----| DragonZilla
 * 
 * @author GT-R
 * @date 2015年4月2日 上午11:52:24
 */
public class HorrorShow {
	static void u(Monster m) { m.menace(); }
	
	static void v(DangerousMonster m) {
		m.menace();
		m.destroy();
	}
	
	static void w(Lethal l) { l.kill(); }
	
	public static void main(String[] args) {
		DangerousMonster barney = new DragonZilla();
		u(barney);
		v(barney);
		
		Vampire vlad = new VeryBadVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
}

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla implements DangerousMonster {
	public void menace() { }
	
	public void destroy() { } 
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire implements Vampire {
	public void menace() { }
	
	public void destroy() { }
	
	public void kill() { }
	
	public void drinkBlood() { }
}