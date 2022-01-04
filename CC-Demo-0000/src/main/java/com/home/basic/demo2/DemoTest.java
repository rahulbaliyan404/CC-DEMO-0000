package com.home.basic.demo2;

public abstract class DemoTest {

	DemoTest(int a) {
		System.out.println("Test Constructor."+a);
	}

	public static void disp() {
		System.out.println("This is disp method.");
	}

	public static void main(String[] args) {

		disp();
	}

}
