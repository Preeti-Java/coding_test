package com.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxList {

	public static void miniMaxSum(List<Integer> arr) {
        long highestVal = Long.MIN_VALUE, lowestVal = Long.MAX_VALUE, totalSum = 0;
for (Integer val : arr){
    if(lowestVal > val){
        lowestVal = val;
    }
    if(highestVal < val){
        highestVal = val;
    }
    totalSum+=val;
}

System.out.println((totalSum-highestVal)+" "+(totalSum-lowestVal) );


// Write your code here

}
	
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(Collectors.toList());

       miniMaxSum(arr);

        bufferedReader.close();
    }
}
