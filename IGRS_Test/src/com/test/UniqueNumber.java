package com.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UniqueNumber {

	public static void main(String[] args) throws IOException {
        
       
        int result =lonelyinteger();

       System.out.println(result);
    }
	
	 public static int lonelyinteger() {
		 
		 List<Integer> a =  new ArrayList<>();
		 a.add(1);
		 a.add(1);
		 a.add(2);
		 
		for(int i =0;i<a.size();i++) {
			int count =0;
			for(int j =0;j<a.size();j++) {
				if(a.get(i).equals(a.get(j))) {
					count++;
				}
			}
			if(count == 1)
				return a.get(i);
			
			}
		return -1;
		}
}
