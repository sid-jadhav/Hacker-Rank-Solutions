package Algorithms;

import java.util.Scanner;

public class HackerRankInAString {

	public static void main(String[] args) {
		int q=0;
		
		Scanner scan =new Scanner(System.in);
		q= scan.nextInt();
		scan.nextLine();
		String hack="hackerrank";
		for(int i=0;i<q;i++){
			String s= scan.nextLine();
			
			Result(s);
		}
	}
	public static void Result(String s){
		String hack="hackerrank";
		int j=0;
		for(int i=0;i<s.length() && j!=hack.length();i++){
			if(s.charAt(i)==hack.charAt(j)){
				j++;
			}
		}
		if(j==hack.length()){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}
