package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class JavaArrayList {

	 public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	       
	        Scanner scanner = new Scanner(System.in);
	         //Set number of lines
	         int n = scanner.nextInt();
	         List<List<Integer>> listOfList = new ArrayList<>();
	          for(int j = 0;j <n ; j++){
	        	int d = scanner.nextInt();
		         ArrayList<Integer> d1 = new ArrayList<>();
		         for(int i = 0;i <d ; i++){
		             d1.add(scanner.nextInt());
		         }
		         listOfList.add(d1);
	         }
	        System.out.println(listOfList);
	        System.out.println("================Select=============");
	        //Get queries Data 
			
	        int q = scanner.nextInt(); 
	        for(int j=0;j<q;j++) { 
	        	int x = scanner.nextInt();
	        	int y = scanner.nextInt();
	        	List<Integer> data = listOfList.get(x-1);
	        	if(!data.isEmpty()) {
	        		if(data.size() < y)
	        			System.out.println("Error !");
	        		else {
			        	int result = data.get(y-1);
			        	System.out.println(result);
	        		}
	        	}
	        	else
	        		System.out.println("Error !");
	        	
	        }
			 
	        
	    }
	    
	    //n -> no of line
	    //d-> no of integer in this line
	    // q-> queries (5)
	    // x,y -> 1 3
}
