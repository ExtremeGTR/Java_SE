package com.gtr.l_type_info.pets;

public class Individual implements Comparable<Individual> {
	private static long counter = 0;
	private final long id = counter++;
	private String name;
	
	public Individual() { }

	public Individual(String name) {
		this.name = name;
	}

	
	public long id() {
		return id;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + 
				(name == null ? "" : " " + name);
	}
	
	@Override
	public boolean equals(Object obj) {
		return obj instanceof Individual && id == ((Individual) obj).id();
	}
	
	@Override
	public int hashCode() {
		int result = 17;
		if (name != null) {
			result = 37 * result + name.hashCode();
		}
		return result;
	}
	
	@Override
	public int compareTo(Individual o) {
		// compare by class name first
		String first = getClass().getSimpleName();
		String oFirst = o.getClass().getSimpleName();
		int firstCompare = first.compareTo(oFirst);
		if (firstCompare != 0) {
			return firstCompare;
		}
		
		if (name != null && o.name != null) {
			int secondCompare = name.compareTo(o.name);
			if (secondCompare != 0) {
				return secondCompare;
			}
		}
		return (o.id < id ? -1 : (o.id == id ? 0 : 1));
	}
}
