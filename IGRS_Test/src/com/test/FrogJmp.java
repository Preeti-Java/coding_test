package com.test;

public class FrogJmp {

	public static void main(String[] args) {
		
		          int X = 10;
				  int Y = 100;
				  int D = 30;
				  int jump=0;
				 solution(X, Y, D);
	}
	
	 public static int solution(int X, int Y, int D) {
	        // Implement your solution here
	        //Calculate remaining distance
	        int distance =  Y-X;
	        if(distance <= D && distance != 0)
	          return 1;
	         else if(distance > D){
	           return (int)Math.ceil((double)distance/D);
	         } 
	         return 0;
	    }
}
