package com.home.string;

public class PalendromeString {

	public static void main(String[] args) {
		String str = "123";
		int intInput = 121;
		PalendromeString demo = new PalendromeString();
		String firstApp = demo.firstApproch(str);
		String secondApp = demo.secondApproch(str);
		String intApp = demo.firstApproch(intInput);
		System.out.println(firstApp);
		System.out.println(secondApp);
		System.out.println(intApp);
	}

	public String firstApproch(String str) {
		String revStr = "";
		StringBuffer bfr = new StringBuffer(str);
		revStr = bfr.reverse().toString();
		if (revStr.equals(str))
			return "Yes";
		else
			return "No";
	}

	public String secondApproch(String str) {
		String revStr = "";
		char[] arr = str.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			revStr = revStr + arr[i];
		}
		if (revStr.equals(str))
			return "Yes";
		else
			return "No";
	}

	public String firstApproch(int input) {
		String str = String.valueOf(input);
		String revStr = "";
		StringBuffer bfr = new StringBuffer(str);
		revStr = bfr.reverse().toString();
		if (revStr.equals(str))
			return "Yes";
		else
			return "No";

	}

}
