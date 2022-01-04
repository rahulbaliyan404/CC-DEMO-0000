package com.home.interview;

public class Demo1 {

	public void disp(String str) {
		System.out.println("String");
	}

	public void disp(Object obj) {
		System.out.println("Object");
	}

	public static void main(String[] args) {
		Demo1 demo1 = new Demo1();
		demo1.disp(null);
	}

}
