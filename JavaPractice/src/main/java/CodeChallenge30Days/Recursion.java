package CodeChallenge30Days;

import java.util.Scanner;

public class Recursion {
	public static void main(String[] args) {
		int n;
		Scanner scan= new Scanner(System.in);
		n=scan.nextInt();
		System.out.println(factorial(n));
	}

	private static int factorial(int n) {
		int fact=1;
		if(n==0){
			return 1;
		}else{
			fact=n*factorial(n-1);
			fact=fact+n;
			return (fact);
		}
	}
}
