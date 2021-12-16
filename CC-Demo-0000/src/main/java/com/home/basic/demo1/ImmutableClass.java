package com.home.basic.demo1;

class Engine {
	int speed;

	public Engine(int speed) {
		this.speed = speed;
	}
}

public final class ImmutableClass {
//Immutable class.
	private final int id;
	private final String name;
	private Engine engine;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public ImmutableClass(int i, String s, Engine e) {
		this.id = i;
		this.name = s;
		Engine newEngine = new Engine(e.speed);
		this.engine = newEngine;
	}

	public static void main(String[] args) {
		Engine eng = new Engine(50);
		ImmutableClass obj = new ImmutableClass(1, "Rahul", eng);
		eng.speed = 7;
		System.out.println(obj.id);
		System.out.println(obj.name);
		System.out.println(obj.engine.speed);

	}

}
