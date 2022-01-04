package com.home.program.demo1;

public class Demo1 {
	public static void main(String[] args) {
		min();
	}

	public static int min() {
		int args[] = { 10, 20, 15, 25 };
		int min = args[0];
		for (int i = 0; i < args.length; i++) {
			if (args[i] < min)
				// min = +args[i];
				min += args[i];
			System.out.println(min);
		}
		return min;
	}

}

class A {
	public void disp() {
		System.out.println("A disp");
	}

	public void info() {
		System.out.println("A info");
	}
}

class B {

	public void disp() {
		System.out.println("B disp");
	}

	public void doStuff() {
		System.out.println("B doStuff");
	}

}
