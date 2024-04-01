package com.test;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	 static boolean isAnagram(String a, String b) {
	       //anagram
		 //margana
		char[] aChar = a.toLowerCase().toCharArray();
		char[] bChar = b.toLowerCase().toCharArray();
		
		Arrays.sort(bChar);
		Arrays.sort(aChar);
		
		return aChar.equals(bChar);
		 
	    }

	  public static void main(String[] args) {
	    
	        Scanner scan = new Scanner(System.in);
	        String a = scan.next();
	        String b = scan.next();
	        scan.close();
	        boolean ret = isAnagram(a, b);
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
	    }
}
