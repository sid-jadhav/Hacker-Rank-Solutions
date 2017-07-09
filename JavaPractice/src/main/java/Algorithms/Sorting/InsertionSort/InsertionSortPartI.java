package Algorithms.Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortPartI {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		int n;
		n=scan.nextInt();
		arr=ReadArrayList(n,arr,scan);
		int toInsert=scan.nextInt();
		arr=Sorting(arr,toInsert);
	}

	private static ArrayList<Integer> Sorting(ArrayList<Integer> arr, int toInsert) {
		for(int i=arr.size()-1;i>=0;i--){
			if(arr.get(i)>toInsert){
				if(i==arr.size()-1){
					arr.add(i+1, arr.get(i));
				}else{
					arr.set(i+1, arr.get(i));
				}
				print(arr);
			}else if(i!=arr.size()-1){
				arr.set(i+1,toInsert);
				print(arr);
				break;
			}else{
				arr.add(i+1, toInsert);
				print(arr);
				break;
			}
			if(i==0 && arr.get(i)>toInsert ){
				arr.set(i,toInsert);
				print(arr);
			}
		}
		
		return arr;
	}

	private static void print(ArrayList<Integer> arr) {
		for(int i=0;i<arr.size();i++){
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}

	private static ArrayList<Integer> ReadArrayList(int n, ArrayList<Integer> arr, Scanner scan) {
		for(int i=0;i<n-1;i++){
			arr.add(scan.nextInt());
		}
		return arr;
	}
	
	

}
