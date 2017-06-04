package com.HackerRank.JavaPractice.Array;

import java.util.Scanner;

public class LeftRotation {

	public static void main(String[] args) {
		int arr[]=new int[10];
		int n, d, swap;
		Scanner scan= new Scanner(System.in);
		n= scan.nextInt();
		d= scan.nextInt();
		for(int i=0; i<n;i++){
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<d;i++)
		{
			swap=arr[0];
			for(int j=0;j<n;j++){
				if(j<n-1)
				arr[j]=arr[j+1];
				else
				arr[j]=swap;
				
			}
		}
		for(int i=0; i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}

}
