package Algorithms.Greedy;

import java.util.Scanner;

public class MinAbsDiff {

	public static void main(String[] args) {
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		int a[]=new int[n];
		int min=999999999,abs=0;
		for(int i=0;i<n;i++){
			a[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(i!=j){
					abs=Math.abs(a[i]-a[j]);
					if(min>abs){
						min=abs;
						if(min==0){
							break;
						}
					}
				}
			}
		}
		System.out.println(min);
	}

}
