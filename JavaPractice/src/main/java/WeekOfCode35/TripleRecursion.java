package WeekOfCode35;

import java.util.Scanner;

public class TripleRecursion {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n,m,k;
		n=scan.nextInt();
		m=scan.nextInt();
		k=scan.nextInt();
		int[][] a= new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=i;j<n;j++){
				if(i==0 && j==0){
					a[i][j]=m;
				}else if(i==j){
					a[i][j]=a[i-1][j-1]+k;
				}else if(i<j){
					a[i][j]=a[i][j-1]-1;
					a[j][i]=a[i][j];
				}
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}

}
