package com.test;

public class TapeEquilibrium {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = {-1000, 1000};
		int result = solution(input);
		System.out.println (result);
	}
	
	public static int solution(int[] A) {
        // write your code in Java SE 8
        int sumA =0, sumB = 0, sum = 0; 

        for(int i=0; i<A.length; i++) {
            sum += A[i];
        }
        
        int minDifference = Integer.MAX_VALUE;
        int currentDifference = Integer.MAX_VALUE;

        for( int i =1 ; i<A.length; i++){
            sumA += A[i-1]; 
            sumB = sum-sumA;
            currentDifference = (int) Math.abs(sumA - sumB);
            minDifference = Math.min(currentDifference, minDifference);
        }
        return minDifference;
    }
}
