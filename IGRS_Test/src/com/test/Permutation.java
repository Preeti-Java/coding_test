package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Permutation {

	public static int solution(int[] A) {
        // Implement your solution here
       //Create 2 Set 
       //comapre both
       Arrays.sort(A);
   Set<Integer> aSet = new HashSet<>();
   Set<Integer> cSet = new HashSet<>();
     int j = A[0];
   for(int i=0;i<A.length;i++){
       aSet.add(A[i]);
       cSet.add(j);
       j++;
   }
	if(aSet.size() != cSet.size())
        return 0;

       for(int c :cSet){
	
           if(!aSet.contains(c)){
               return 0;
           }
          
       }

       return 1;
   }
	
	
	public static void main(String[] args) {
		int A[] = {4, 1, 3, 2};
		solution(A);
	}
}
