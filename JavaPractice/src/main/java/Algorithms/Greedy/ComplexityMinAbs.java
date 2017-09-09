package Algorithms.Greedy;

import java.util.Scanner;

public class ComplexityMinAbs {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int a[]=new int[n];
		int min=999999999,abs=0,max=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
			if(i==0){
				
			}else if(a[i]>a[i-1]){
				int swap=a[i-1];
				a[i-1]=a[i];
				a[i]=swap;
			}
		}
		for(int i:a){
			System.out.print(i+" ");
		}
		
	}

}
