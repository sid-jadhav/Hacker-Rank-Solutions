package com.HackerRank.JavaPractice.Array;

import java.util.*;

public class Solution{

	public static void main(String[] args) {
		ArrayFunction af=new ArrayFunction();
		int t;
		Scanner scan =new Scanner(System.in);
		t=scan.nextInt();
		for(int i=0 ; i<t; i++)
		{
			af.arrayStore();
			System.out.println(af.Partition());
		}
		
	
	}

	

}
