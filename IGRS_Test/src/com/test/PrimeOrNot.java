package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class PrimeOrNot {

	public static void main(String[] args) throws IOException {
		 try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
	            BigInteger number = new BigInteger(bufferedReader.readLine());
	            if (number.isProbablePrime(1)) {
	                System.out.println("prime");
	            } else {
	                System.out.println("not prime");
	            }
	        } catch (IOException e) {
	            System.out.println("Could not validate input");
	        }
	}
}
