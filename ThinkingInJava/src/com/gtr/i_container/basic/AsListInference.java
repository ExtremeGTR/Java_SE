package com.gtr.i_container.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Arrays.asList() makes its best guess about type
 * 
 * 可以使用显式类型参数说明指明asList()产生的List类型
 * 
 * @author GT-R
 * @date 2015年4月19日 上午10:08:59
 */
public class AsListInference {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<Snow> snow1 = Arrays.asList(new Crusty(), new Slush(), new Powder());
		
		// won't compile
		//! List<Snow> snow2 = Arrays.asList(new Light(), new Heavy());
		
		// compiler says
		// found java.util.List<Powder>
		// required java.util.List<Snow>
		// Collections.addAll() doesn't get confused
		
		List<Snow> snow3 = new ArrayList<Snow>();
		Collections.addAll(snow3, new Light(), new Heavy());
		
		// give a hint using an
		// explicit type argument specification
		List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());
	}
}

class Snow { }
class Powder extends Snow { }
class Light extends Powder { }
class Heavy extends Powder { }
class Crusty extends Snow { }
class Slush extends Snow { }