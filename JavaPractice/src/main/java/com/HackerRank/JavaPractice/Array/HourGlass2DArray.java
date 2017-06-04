package com.HackerRank.JavaPractice.Array;

import java.util.Scanner;

public class HourGlass2DArray {

	public static void main(String[] args) {
		int sum=0,ans=0;
		Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                arr[arr_i][arr_j] = in.nextInt();
            }
        }
        for(int i=0;i<4;i++){
        	for(int j=0;j<4;j++){
        		printHourGlass(arr,i,j);
        		System.out.println("");
        		sum=SumofHourGlass(arr,i,j);
        		if(ans<sum){
        			ans=sum;
        		}
        		System.out.println(SumofHourGlass(arr,i,j));
        	}
        }
        printArray(arr);
        System.out.println(ans);
        
	}
	public static void printArray(int arr[][]){
		for(int arr_i=0; arr_i < 6; arr_i++){
            for(int arr_j=0; arr_j < 6; arr_j++){
                System.out.print(arr[arr_i][arr_j]+" ");
            }
            System.out.println();
        }
	}
	public static void printHourGlass(int arr[][],int arr_i,int arr_j){
		int count=1;
		for(int i=arr_i; i < arr_i+3; i++){
            for(int j=arr_j; j < arr_j+3; j++){
                if(count==4 || count==6){
                	System.out.print("  ");
                }
                else{
            	System.out.print(arr[i][j]+" ");
                }
                count++;
            }
            System.out.println();
        }
	}
	public static int SumofHourGlass(int arr[][],int arr_i,int arr_j){
		int count=1;
		int sum =0;
		for(int i=arr_i; i < arr_i+3; i++){
            
            	for(int j=arr_j; j < arr_j+3; j++){
            		if(count==4 || count==6){
            		}
            		else{
            			sum=sum+arr[i][j];
            		}
            		 count++;	
                }
			
           
        }
		return sum;
	}

}
