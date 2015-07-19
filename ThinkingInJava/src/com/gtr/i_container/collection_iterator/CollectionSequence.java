package com.gtr.i_container.collection_iterator;

import java.util.AbstractCollection;
import java.util.Iterator;

import com.gtr.l_type_info.pets.Pet;
import com.gtr.l_type_info.pets.Pets;

/**
 * 继承AbstractCollection比实现Collection要方便得多
 *   - 只需实现size()和iterator()
 * 
 * @author GT-R
 * @date 2015年7月19日 上午11:42:05
 */
public class CollectionSequence extends AbstractCollection<Pet> {
	private Pet[] pets = Pets.createArray(8);

	@Override
	public int size() {
		return pets.length;
	}
	
	@Override
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
		CollectionSequence c = new CollectionSequence();
		InterfaceVsInterator.display(c);
		InterfaceVsInterator.display(c.iterator());
	}
}
