package com.gtr.l_type_info.pets;

import java.util.ArrayList;

/**
 * @author GT-R
 * @date 2015年7月19日 上午12:40:31
 */
public class Pets {
	public static final PetCreator CREATOR =
			new LiteralPetCreator();
	
	public static Pet randomPet() {
		return CREATOR.randomPet();
	}
	
	public static Pet[] createArray(int size) {
		return CREATOR.createArray(size);
	}
	
	public static ArrayList<Pet> arrayList(int size) {
		return CREATOR.arrayList(size);
	}
}
