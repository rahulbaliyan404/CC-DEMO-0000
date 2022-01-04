package com.home.interview;

public class Demo2 {

	@SuppressWarnings("finally")
	public static int info() {
		try {
			// System.out.println("0");
			return 0;
		} catch (Exception e) {
			// System.out.println("1");
			return 1;
		}

		finally {

			// System.out.println("2");
			return 2;
		}
	}

	public static void main(String[] args) {
		int result = Demo2.info();
		System.out.println(result);
	}
}
