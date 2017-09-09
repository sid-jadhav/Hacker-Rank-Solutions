package Algorithms.Sorting.QuickSort;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Partition {
	public static void main(String[] args){
		List<Integer> left= new ArrayList<Integer>();
		List<Integer> right= new ArrayList<Integer>();
		List<Integer> same= new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		int pivot=scan.nextInt();
		same.add(pivot);
		for(int i=0;i<n-1;i++){
			int value=scan.nextInt();
			if(value>pivot){
				right.add(value);
			}else if(value<pivot){
				left.add(value);
			}else{
				same.add(value);
			}
		}
		for(int i:left){
			System.out.print(i+" ");
		}
		for(int i:same){
			System.out.print(i+" ");
		}
		for(int i:right){
			System.out.print(i+" ");
		}
	}
}
