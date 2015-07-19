package com.gtr.i_container.collection_iterator;

import java.util.Iterator;

import com.gtr.l_type_info.pets.Pet;
import com.gtr.l_type_info.pets.Pets;

/**
 * 如果自定义类继承了其他类, 那它就不能再继承AbstractCollection
 * 
 * 解决方案:
 *   1.实现Collection接口, 但要实现接口中的所有方法, 很麻烦
 *   2.提供一个方法创建迭代器, 方便快捷
 * 
 * @author GT-R
 * @date 2015年7月19日 下午1:34:26
 */
public class NonCollectionSequence extends PetSequence {
	public Iterator<Pet> iterator() {
		return new Iterator<Pet>() {
			private int index = 0;
			
			@Override
			public Pet next() {
				return pets[index++];
			}
			
			@Override
			public boolean hasNext() {
				return index < pets.length;
			}
			
			// not implemented
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		NonCollectionSequence nc = new NonCollectionSequence();
		InterfaceVsInterator.display(nc.iterator());
	}
}

class PetSequence {
	protected Pet[] pets = Pets.createArray(8);
}
