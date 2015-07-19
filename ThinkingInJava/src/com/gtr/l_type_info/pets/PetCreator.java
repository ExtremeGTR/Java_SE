package com.gtr.l_type_info.pets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Collection和Iterator接口
 *   - 在Java中, Collection与Iterator表示所有容器的共性
 * 
 * @author GT-R
 * @date 2015年7月19日 上午12:46:40
 */
public abstract class PetCreator {
	private Random rand = new Random(47);
	
	public Pet randomPet() {
		int n = rand.nextInt(types().size());
		try {
			return types().get(n).newInstance();
		} catch (InstantiationException e) {
			throw new RuntimeException(e);
		} catch (IllegalAccessException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Pet[] createArray(int size) {
		Pet[] result = new Pet[size];
		for (int i = 0; i < size; i++) {
			result[i] = randomPet();
		}
		return result;
	}
	
	public ArrayList<Pet> arrayList(int size) {
		ArrayList<Pet> result = new ArrayList<Pet>();
		Collections.addAll(result, createArray(size));
		return result;
	}
	
	public abstract List<Class<? extends Pet>> types();
}
