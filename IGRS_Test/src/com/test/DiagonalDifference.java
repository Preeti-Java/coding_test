package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DiagonalDifference {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

	        int n = Integer.parseInt(bufferedReader.readLine().trim());

	        List<List<Integer>> arr = new ArrayList<>();

	        IntStream.range(0, n).forEach(i -> {
	            try {
	                arr.add(
	                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
	                        .map(Integer::parseInt)
	                        .collect(Collectors.toList())
	                );
	            } catch (IOException ex) {
	                throw new RuntimeException(ex);
	            }
	        });

	        int result = diagonalDifference(arr);

	        bufferedWriter.write(String.valueOf(result));
	        bufferedWriter.newLine();

	        bufferedReader.close();
	        bufferedWriter.close();
		
		
	}

	private static int diagonalDifference(List<List<Integer>> arr) {
		
		 int firstSumDiagnol=0; 
	        int secondSumDiagnol=0;
	        for(int i = 0; i < arr.size();i++) {
	            List<Integer> list = arr.get(i);
	            firstSumDiagnol = firstSumDiagnol+list.get(i);
	                  secondSumDiagnol = secondSumDiagnol+list.get(arr.size()-1-i);
	           
	        }
	        return Math.abs(firstSumDiagnol-secondSumDiagnol);
	}
}
