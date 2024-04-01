package com.test;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternChecker {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
		while(testCases>0){
			String pattern = in.nextLine();
			if(pattern.length() > 0) {
          	boolean flag = Pattern.matches("[0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}[.][0-9]{1,3}", pattern);
          	if(flag == true)
          	System.out.println("Valid");
          	else
				System.out.println("Not Valid");
			}
          
		}
		in.close();
	}
}
