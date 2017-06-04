package Algorithms;

import java.util.Scanner;

public class MinMax {

	public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int[] arr = new int[5];
	     int n=0;
	    int min=0,max=0;
	     for(int arr_i=0; arr_i < 5; arr_i++){
	    	 arr[arr_i] = in.nextInt();
          }
	     for(int i=0;i<4;i++){
	    	 if(arr[i]<arr[i+1]){
	    		 n=arr[i];
	    		 arr[i]=arr[i+1];
	    		 arr[i+1]=n;
	    	 }
	     }
	     for(int arr_i=0; arr_i < 4; arr_i++){
	    	 min=min+ arr[arr_i];
          }
	     for(int i=0;i<4;i++){
	    	 if(arr[i]>arr[i+1]){
	    		 n=arr[i];
	    		 arr[i]=arr[i+1];
	    		 arr[i+1]=n;
	    	 }
	     }
	     for(int arr_i=0; arr_i < 4; arr_i++){
	    	 max=max+ arr[arr_i];
          }
	     System.out.println(min+" "+max);
	     
	}

}
