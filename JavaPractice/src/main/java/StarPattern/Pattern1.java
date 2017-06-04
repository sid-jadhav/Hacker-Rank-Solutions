package StarPattern;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		int n;
		n=scan.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++){
			char a='a';
			for(int j=1;j<=i;j++){
				System.out.print(a+" ");
				a++;
			}
			System.out.println();
		}
	}

}
