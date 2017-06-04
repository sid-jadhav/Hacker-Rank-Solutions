package StarPattern;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			for(int j=n;j>i;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
