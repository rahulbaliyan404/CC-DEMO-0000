package com.home.basic.demo1;

import java.util.Comparator;

public class CompratorDemo implements Comparator<ComparableDemo> {

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

	@Override
	public int compare(ComparableDemo o1, ComparableDemo o2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
