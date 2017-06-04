package com.HackerRank.JavaPractice.Array;

import java.util.Scanner;

public class SparseArray {

	public static void main(String[] args) {
		String[] s = new String[20];
		int n,q;
        int ans[]=new int[1000];
		String ss;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<n;i++){
			s[i]=scan.nextLine();
		}
		q=scan.nextInt();
		scan.nextLine();
		for(int i=0;i<q;i++){
			ss=scan.nextLine();
			int count=0;
			for(int j=0;j<n;j++){
				if(ss.equals(s[j])){
					count++;
				}
			}
			ans[i]=count;
		}
        for(int i=0;i<q;i++){
            System.out.println(ans[i]);
        }
	}

}
