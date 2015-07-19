package com.gtr.l_type_info.pets;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author GT-R
 * @date 2015年7月19日 上午1:05:46
 */
public class LiteralPetCreator extends PetCreator {
	public static final List<Class<? extends Pet>> ALL_TYPES =
			Collections.unmodifiableList(Arrays.asList(
					Pet.class, Dog.class, Cat.class, Rodent.class,
					Mutt.class, Pug.class, EgyptianMau.class, Hamster.class));
	
	// types for random creation
	private static final List<Class<? extends Pet>> TYPES =
			ALL_TYPES.subList(ALL_TYPES.indexOf(Mutt.class), ALL_TYPES.size());

	@Override
	public List<Class<? extends Pet>> types() {
		return TYPES;
	}
	
	public static void main(String[] args) {
		System.out.println(TYPES);
	}
}
