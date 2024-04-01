package com.test;

import java.util.Scanner;

public class TestingInnerInterface {
	
		
	   public static String getSmallestAndLargest(String s, int k) {
	        String smallest = "";
	        String largest = "";
	        
	        // Complete the function
	        // 'smallest' must be the lexicographically smallest substring of length 'k'
	        // 'largest' must be the lexicographically largest substring of length 'k'
	        String[] subStrings = new String[s.length()-(k-1)];
	        for(int i = 0; i <= s.length()-k; i++) {
	        	subStrings[i] = s.substring(i, i+k);
	        	System.out.println(subStrings[i]);
	        	
	        }
	        largest = subStrings[0];
	        for(int j = 0; j < subStrings.length;j++) {
	        	System.out.println("subStrings[j] " + subStrings[j]);
	        	
	        	System.out.println("largest.compareTo(subStrings[j] "+largest.compareTo(subStrings[j]));
	        	
	        	if(largest.compareTo(subStrings[j]) >= 1) {
	        		largest = subStrings[j];
	        		System.out.println("largest " + largest);
	        	}
	        	if(smallest.compareTo(subStrings[j]) < 1) {
	        		smallest = subStrings[j];
	        		System.out.println("smallest " + smallest);
	        	}
	        }
	        
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        scan.close();
	      
	        System.out.println(getSmallestAndLargest(s, k));
	    }

}
