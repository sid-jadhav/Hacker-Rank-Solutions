package WeekOfCode33;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TransformToPalindrome {

	public static void main(String[] args) {
		ArrayList<Integer> a= new ArrayList();
		int n,k,m;
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		k=scan.nextInt();
		m=scan.nextInt();
		Map<Integer,Integer> map=new HashMap<Integer,Integer>();
		for(int i=0;i<k;i++){
			int key=scan.nextInt();
			int value=scan.nextInt();
			map.put(key, value);
		}
		for(int i=0;i<m;i++){
			a.add(scan.nextInt());
		}
		palindrome(a,map);
	}

	private static void palindrome(ArrayList<Integer> a, Map<Integer,Integer> map) {
		
		for(int i=0;i<a.size()/2;i++){
			int mid=a.size()/2;
			if(a.get(i)==a.get(a.size()-i-1)){
				System.out.println("Is palandrome");
			}else{
				System.out.println("Oppss...It isn't palandrome");
				int result=switchElement(map,a.get(i),a.get(a.size()-i-1));
				System.out.println(result);
				a.set(i, result);
				a.set(a.size()-i-1, result);
			}
		}
		for(int i:a){
			System.out.print(i);
		}
	}

	private static int switchElement(Map<Integer, Integer> map, int comp1,int comp2) {
		if(map.containsKey(comp1)){
			if(map.get(comp1)==comp2){
				return comp2;
			}
			else if(map.containsKey(map.get(comp1))){
				if(map.get(map.get(comp1))==comp2){
					return comp2;
				}
			}
		}
		if (map.containsKey(comp2)){
			if(map.get(comp2)==comp1){
				return comp1;
			}else if(map.containsKey(map.get(comp2))){
				if(map.get(map.get(comp2))==comp1){
					return comp1;
				}else{
					return 0;
				}
			}else{
				return 0;
			}
			
			
		}else{
			return 0;
		}
		
		
	} 

}

