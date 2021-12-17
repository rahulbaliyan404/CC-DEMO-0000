package com.home.basic.demo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo implements Comparable<ComparableDemo> {

	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(ComparableDemo o) {
		if (this.id > o.id) {
			return 1; 
		} else if (this.id < o.id) {
			return -1;
		} else {

			return 0;
		}
	}

	public static void main(String[] args) {

		ComparableDemo demo = new ComparableDemo();
		demo.setId(15);
		demo.setName("Rahul");

		ComparableDemo demo1 = new ComparableDemo();
		demo1.setId(5);
		demo1.setName("Amit");

		ComparableDemo demo2 = new ComparableDemo();
		demo2.setId(10);
		demo2.setName("Harish");

		List<ComparableDemo> list = new ArrayList<ComparableDemo>();
		list.add(demo);
		list.add(demo1);
		Collections.sort(list);
		for (ComparableDemo sortedList : list) {
			System.out.println(sortedList.id);
		}
		// Collections.sort(list, ComparableDemo.nameComparator); // call @compare(o1,o2)
		// Collections.sort(list, ComparableDemo.idComparator);

	}
}
