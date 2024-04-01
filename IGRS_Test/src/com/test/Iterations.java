package com.test;

import java.util.Scanner;

public class Iterations {
	 public static void main(String[] args){
		 //For binary number
		 int[] bin = new int[100];
		 int i = 1;
		 //Get input
		 Scanner scanner =  new Scanner(System.in);
		 int dec_num = scanner.nextInt();
		 //Convert into binary number
		 int quot = dec_num;
		 while(quot != 0) {
			 bin[i++] = quot % 2;
			 quot = quot /2;
		 }
		 //append all number in reverse form
		 String bin_String="";
		 for(int j = i-1;j>0;j--)
		 {
			 bin_String=bin_String+(bin[j]);
		 }
		 System.out.println("Binary  value : "+bin_String);
		 
		//if last number is zero, remove this
		 //Set i value
		 i = bin_String.length() - 1;
		 while(bin_String.charAt(i) == '0') {
			 i--;
		 }
		 
		 int length=0;
		 int ctr=0;
		 for(;i>0;i--) {
			 if(bin_String.charAt(i) == '1') {
				 length = Math.max(length, ctr);
				 ctr = 0;
			 }
			 else
				 ctr++;
		 }
		 length = Math.max(length, ctr);
		 System.out.println(length);
		 
		 
	 }
}
