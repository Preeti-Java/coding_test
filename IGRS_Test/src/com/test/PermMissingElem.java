package com.test;

import java.util.Arrays;
import java.util.stream.Stream;

public class PermMissingElem {

	public static void main(String[] args) {
		
		int[] arr = { 1, 2, 3, 5 };
        int N = arr.length;
        System.out.println(solution(arr, N));
}

public static int solution(int[] a, int n) {
	 int c = a.length + 1;
    int result = (c * (c +1))/2;
	 
     return result - sum(a,n);
}

private static int sum(int[] a, int n) {
	int sum=0;
	for(int i : a) {
		sum +=i;
	}
	return sum;
}
}
