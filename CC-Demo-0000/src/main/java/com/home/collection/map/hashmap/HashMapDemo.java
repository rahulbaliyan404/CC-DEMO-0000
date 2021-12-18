package com.home.collection.map.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(101, "Rahul");
		hashmap.put(102, "Kumar");
		hashmap.put(101, "Ravi");
		System.out.println(hashmap.size());
		System.out.println(hashmap);
		System.out.println(hashmap.containsKey(101));
		System.out.println(hashmap.containsValue("Ravi"));
		System.out.println(hashmap.get(101));
		//System.out.println(hashmap.remove(102));
		System.out.println(hashmap.isEmpty());

	}

}
