package com.cars;

public class Car implements Comparable<Car>{
	String name;
	int year;

	Car(String name, int year) {
		this.name = name;
		this.year = year;
	}

	@Override
	public int compareTo(Car o) {
		// TODO Auto-generated method stub
		return this.year>o.year ? 1 :this.year<o.year ? -1:0;
	}

}
