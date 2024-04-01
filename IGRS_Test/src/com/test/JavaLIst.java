package com.test;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaLIst {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        //get N
        int N = scanner.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0;i <N;i++){
            al.add(scanner.nextInt());
        }
        //get queries number
        int q = scanner.nextInt();
        String q1;
            for(int i = 0; i<q ; i++) {
	        // q -> Insert and Delete
	         q1=scanner.next();
	         
		        if(q1.equals("Insert")){
		           // index x and value y
	
		        	int x = scanner.nextInt();
		            int y = scanner.nextInt();
		            al.add(x, y);
		        }
		        if(q1.equals("Delete")){
		             int x = scanner.nextInt();
		            if(al.size() > x){
		                al.remove(x);
		            }
		        }
            }
        for(int l : al)
          System.out.print(l + " ");
       
    }
}
