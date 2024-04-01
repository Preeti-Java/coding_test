package com.test;

public class Cycling_Rotation {

	public static void main(String[] args) {
	
		int arr[] = {5,4,3,2,1};
		int rot = 3;
		int n=arr.length;
		//Reverse the first n-1 terms //4 ,5,321
		for(int i =0,j = n-1-rot;j>i;i++,j--) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		System.out.println(arr);
		
		//reverse the entire array
		for(int i=0, j = n-1;j>i;i++,j--) {
			int temp = arr[i];
			arr[i] =arr[j];
			arr[j] =temp;
		}
		
		System.out.println(arr);
		
	}
	
}
