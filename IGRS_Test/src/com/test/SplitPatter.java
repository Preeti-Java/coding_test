package com.test;

import java.util.Scanner;

public class SplitPatter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		// Write your code here.
		if (s.trim().length() == 0) {
			System.out.println(0);
			return;
		}
		//
		String[] strArr = s.trim().split("[ !,?._'@]+");

		System.out.println(strArr.length);
		for (String str : strArr) {
			System.out.println(str);
		}

		scan.close();
	}
}
