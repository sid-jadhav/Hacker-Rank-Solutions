package Algorithms;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ReducedString {
	public static void main(String[] args){
		 StringBuilder s=new StringBuilder();
			Scanner scan =new Scanner(System.in);
			s.append(scan.nextLine());
			int i=0;
			for(i=0;i<s.length();i++){
				if(s.charAt(i)==s.charAt(i+1)){
					s.delete(i,i+2);
					i=i--;
				}
			}
	        if(s.length()==0){
				System.out.println("Empty String");
			}
			else if(s.length()==2){
				if(s.charAt(0)==s.charAt(1)){
					System.out.println("Empty String");
				}else{
					System.out.println(s);
				}
			}else {
				System.out.println(s);
			}
	}
}
