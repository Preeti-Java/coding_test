package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeConversation {

	 public static String timeConversion(String s) {
		    // Write your code here
		       if(s.contains("AM") && s.substring(0, 2).equals("12")){
		          s= s.replace(s.substring(0, 2), "00");
		           return s.substring(0, 8);
		       }
		       else if(s.contains("PM")){
		           if(!s.substring(0, 2).equals("12")){
		           s=s.replace(s.substring(0, 2), String.valueOf(Integer.parseInt(s.substring(0, 2))+12));
		           return s.substring(0, 8);
		           }
		           else{
		               return s.substring(0, 8);
		           }
		       }
		       return s.substring(0,8);
		    }

	

		
		    public static void main(String[] args) throws IOException {
		        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		        String s = bufferedReader.readLine();

		        String result = timeConversion(s);

		        bufferedWriter.write(result);
		        bufferedWriter.newLine();

		        bufferedReader.close();
		        bufferedWriter.close();
		    }
}
