package com.home.basic;

public class Test implements Intf {
	
	public void disp()
	{
		System.out.println("class");
	}
	public static void main(String[] args) {
		Intf.show();
		Test test = new Test();
		test.disp();
		
	}
	@Override
	public void info() {
		System.out.println("aaaaaaaaaaa");
		
	}

}
