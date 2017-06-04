package com.HackerRank.JavaPractice.Array;

import java.util.*;

public class ArrayFunction {
	ArrayList<Integer> A =new ArrayList<Integer>();
	Scanner scan =new Scanner(System.in);
	int n;
	public void arrayStore() {
		n=scan.nextInt();
		for(int i=0; i<n; i++)
		{
			A.add(scan.nextInt());
		}
	}
	public int Partition(){
		int ArraySum=sum();
		return ArraySum;
	}
	private int sum(){
		int s=0;
		for(int i=0;i<n;i++)
		s=s+A.get(i);
		return s;
	}

}
