package com.home.collection.list.demo1;

import java.util.LinkedList;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<Integer>();
		list.add(2);
		list.add(5);
		list.add(3);
		
		System.out.println(list.get(2));

	}

}
