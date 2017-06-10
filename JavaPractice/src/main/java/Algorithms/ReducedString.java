package Algorithms;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ReducedString {
	public static void main(String[] args){
		Queue<Object> queue=new LinkedList<Object>(); 
		queue.add(10);
		System.out.println();
		int l=(Integer) queue.remove();
		if(l==0){
			
		}
		 StringBuilder s=new StringBuilder();
			Scanner scan =new Scanner(System.in);
			s.append(scan.nextLine());
			int i=0;
			for(i=0;i<s.length();i++){
				if(s.charAt(i)==s.charAt(i+1)){
					s.delete(i,i+2);
					System.out.println(s);
					i=i--;
					System.out.println(s.length());
				}
			}
	        if(s.length()==0){
				System.out.println("Empty String");
			}
			else{
			System.out.println(s);
			}
	}
}
