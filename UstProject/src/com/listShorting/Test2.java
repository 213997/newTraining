package com.listShorting;

import java.util.Arrays;
import java.util.List;

public class Test2 {
	
	static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(arr[j-1] > arr[j]){  
                                 //swap elements  
                                 temp = arr[j-1];  
                                 arr[j-1] = arr[j];  
                                 arr[j] = temp;  
                         }  
                          
                 }  
         }  
  
    }  
	
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(9,8,7,6,5,4,3,3,2,1);
		int[] arr = {5,2,4,7,1,9,6};
		bubbleSort(arr);
		for (int i : arr) {
			System.out.print(i+" ");
		}
		
	}

}
