package com.home.basic;

public interface Intf {
	
	void info();

	default void disp() {
		System.out.println("Default");
	}

	static void show() {
		System.out.println("Static");
	}

}
