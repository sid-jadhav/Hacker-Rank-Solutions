package com.HackerRank.JavaPractice.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class AlgorithmicCrush {
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList();
		int n,m;
		int a,b,k;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		m=scan.nextInt();
		for(int i=0;i<m;i++){
			a=scan.nextInt();
			b=scan.nextInt();
			k=scan.nextInt();
			for(int j=a; j<=b;j++){
				arr.add(j, (arr.get(j)+k));
			}
		}
	}
}
