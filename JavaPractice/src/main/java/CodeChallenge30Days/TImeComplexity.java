package CodeChallenge30Days;

import java.util.HashMap;
import java.util.Scanner;

public class TImeComplexity {

	public static void main(String[] args) {
		int n;
		int[] isPrime =new int[30];
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			isPrime[i]=scan.nextInt();
		}
		isPrime=Function(isPrime,n);
	}

	private static int[] Function(int[] isPrime, int n) {
		boolean s=true;
		for(int i=0;i<n;i++)
		{
			int sq = (int) Math.sqrt(isPrime[i]);
			for(int j=2;j<=sq;j++){
				if(isPrime[i]%j==0){
					s=false;
				}
			}
			if(s==false || isPrime[i]==1){
                s=true;
                System.out.println("Not prime");				
			}else{
				System.out.println("Prime");
			}
		}
		return null;
	}

}
