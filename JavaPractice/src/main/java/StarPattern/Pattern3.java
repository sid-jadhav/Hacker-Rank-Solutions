package StarPattern;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=n-1;j>i;j--){
				System.out.print(" ");
			}
			for(int j=(i*2+1);j>0;j--){
				System.out.print(i);
			}
			
			System.out.println();
		}
	}

}
