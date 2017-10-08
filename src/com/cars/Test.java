package com.cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String args[]) {
		List<Car> carsList = new ArrayList<>();

		Car car1 = new Car("tesla", 2017);
		Car car2 = new Car("honda", 2011);
		Car car3 = new Car("pontiac", 2015);
		Car car4 = new Car("hundai", 2010);
		Car car5 = new Car("tata", 2017);

		carsList.addAll(Arrays.asList(car1, car2, car3, car4, car5));

		System.out.println("----before sorting the cars");
		for (Car car : carsList) {
			System.out.println(car.name);
		}

		Collections.sort(carsList, new Comparator<Car>() {		//using comparator
			@Override
			public int compare(Car o1, Car o2) {
				// TODO Auto-generated method stub
				return o1.year - (o2.year);
			}
		});

		System.out.println("-------After sorting the cars with respect to year"); //sorted according to year
		for (Car car : carsList) {
			System.out.println(car.name);
		}

		Collections.sort(carsList, (a, b) -> a.name.compareTo(b.name));			//using comparator with  lambda expression

		System.out.println("-------After sorting the cars with respect to Name");//sorted according to name
		for (Car car : carsList) {
			System.out.println(car.name);
		}


		Collections.sort(carsList);  //using comparable interface 
		System.out.println("-------After sorting the cars with respect to year"); //sorted according to year
		for (Car car : carsList) {
			System.out.println(car.name);
		}


	}


}
