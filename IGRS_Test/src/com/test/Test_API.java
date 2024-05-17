package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test_API {

	
	public static void main(String[] args) {
		
		
		int p=8;
		p=p++;
		p=++p;
		p=p+1;
		p=++p + p++;
		   
		    
		List<Integer> list = Arrays.asList(10,45,10,55,65,45);
		int[] array = new int[10];
		list.stream()
		.distinct()
		.forEach(System.out::println);
		
		//
		
		
		 List<Integer> numbers = new ArrayList<>();
	        numbers.add(1);
	        numbers.add(2);
	        numbers.add(3);
	        numbers.add(4);
	        numbers.add(5);

	        // Define a Consumer to print each element of the list
	        Consumer<Integer> printConsumer = num -> System.out.println(num);

	        // Use the Consumer to print each element of the list
	        System.out.println("Printing elements of the list:");
	        numbers.forEach(printConsumer);

	        // Define a Consumer to double each element of the list
	        Consumer<Integer> doubleConsumer = num -> numbers.set(numbers.indexOf(num), num * 2);

	        // Use the Consumer to double each element of the list
	        System.out.println("Doubling elements of the list:");
	        numbers.forEach(doubleConsumer);

	        // Print the modified list
	        System.out.println("Modified list after doubling:");
	        numbers.forEach(printConsumer);
	        
	        
	        int n = 3;
	        String s = "";
	        s += ".**";
	        s += ".**";
	        s += ".**";
	        int k = 0;
	 
	        // Loop to insert letters from
	        // string to array
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < n; j++)
	                A[i][j] = s.charAt(k++);
	        }
	        solve(n);
	}
	
	
	  // Matrix A stores the string
    static char[][] A = new char[105][105];
 
    // ans stores the pair of indices
    // to be cleaned by the machine
    static ArrayList<Pair<Integer, Integer>> ans = new ArrayList<>();
 
    // Function for printing the
    // ArrayList of pair
    static void print() {
        System.out.println("Yes, the house can be cleaned.");
 
        for (Pair<Integer, Integer> p : ans)
            System.out.println(p.getKey() + " " + p.getValue());
    }
 
    // Function performing calculations
    static int solve(int n) {
        // push every first cell in
        // each row containing '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == '.') {
                    ans.add(new Pair<>(i + 1, j + 1));
                    
                    break;
                }
            }
        }
 
        // If total number of cells are
        // n then house can be cleaned
        if (ans.size() == n) {
            print();
            return 0;
        }
 
        ans.clear();
 
        // push every first cell in
        // each column containing '.'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (A[j][i] == '.') {
                    ans.add(new Pair<>(i + 1, j + 1));
                    break;
                }
            }
        }
 
        // If total number of cells are
        // n then house can be cleaned
        if (ans.size() == n) {
            print();
            return 0;
        }
        System.out.println("house cannot be cleaned.");
        return 0;
    }
 
   
}
 class Pair<K, V> {
    private final K key;
    private final V value;
 
    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
 
    public K getKey() {
        return key;
    }
 
    public V getValue() {
        return value;
    }
}
