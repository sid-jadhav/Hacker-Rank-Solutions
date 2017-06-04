package com.HackerRank.JavaPractice.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

	public static void main(String[] args) {
		ArrayList<Integer> List=new ArrayList<Integer>();
		ArrayList<Integer> seqList =new ArrayList<Integer>(List);
		int lastAns=0;
		int seqNo;
		int n,x,y,q,qno;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		q=scan.nextInt();
		for(int i=0;i<q;i++){
			qno=scan.nextInt();
			if(qno==1){
				x=scan.nextInt();
				y=scan.nextInt();
				seqNo=(x^lastAns)%n;
				List.add(i, y);
				seqList.addAll(seqNo, List);
				System.out.println(seqList.get(seqNo));
			}
			else if(qno==2){
				x=scan.nextInt();
				y=scan.nextInt();
				
			}
		}
		

	}

}
