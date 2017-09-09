package Algorithms.Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class GeneralArrayList {
	public static void print(ArrayList<Integer> arr) {
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}

	public static ArrayList<Integer> ReadArrayList(int n, ArrayList<Integer> arr, Scanner scan) {
		for(int i=0;i<n;i++){
			arr.add(scan.nextInt());
		}
		return arr;
	}
}
