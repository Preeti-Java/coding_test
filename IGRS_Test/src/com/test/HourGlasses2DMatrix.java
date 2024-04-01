package com.test;

import java.util.Scanner;

public class HourGlasses2DMatrix {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//row and column
		int row = sc.nextInt();
		int col = sc.nextInt();
		
		//get data in 2 D array
		int[][] array = new int[row][col];
		
		for(int i =0;i < row;i++) {
			for(int j=0;j <col;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		for(int i =0;i < row;i++) {
			for(int j=0;j <col;j++) {
				System.out.print(array[i][j] +" ");
			}
			System.out.println();
		}
		
		//print 1st hourglass
		for(int i = 0;i < 3;i++) {
			for(int j =0;j <3;j++) {
				System.out.println();
			}
		}
		
	}

	
}
