package CodeChallenge30Days;

import java.util.Scanner;

public class LetsReview {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
        int n;
        String s1=new String();
        String s2=new String();
        n=scan.nextInt();
        scan.nextLine();
        for(int i=0;i<=n;i++){
        	s1=scan.nextLine();
        	for(int j=0;j<s1.length();j++){
        		if(j%2==0){
        			System.out.print(s1.charAt(j));
        		}
        	}
        	System.out.print(" ");
        	for(int j=0;j<s1.length();j++){
        		if(j%2!=0){
        			System.out.print(s1.charAt(j));
        		}
        	}
        }
	}
}
