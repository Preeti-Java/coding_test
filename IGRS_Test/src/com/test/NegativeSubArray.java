package com.test;

import java.util.Scanner;

public class NegativeSubArray {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int A[] = new int[n];
        //Stored Value in array
        for(int i =0; i <n ; i++){
            A[i] = scanner.nextInt();
        }
        scanner.close();
        int count = 0;
        int sum = 0;
        for(int i =0;i<n;i++){
            sum = 0;
            for(int j = i;j<n;j++){
                 sum += A[j];
                if(sum < 0)
                  count++;
            }
        }
        System.out.println(count);
    }
}
