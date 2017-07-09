package Algorithms.Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class CountNoOfSwitchInInsertionSort {
	 public static void main(String[] args) {
			ArrayList<Integer> arr= new ArrayList<>();
			Scanner scan =new Scanner(System.in);
			int n=scan.nextInt();
		    int count=0;
			arr=ReadArrayList(n,arr,scan);
			for(int i=0;i<arr.size()-1;i++){
				count=Sorting(arr,arr.get(i+1),i,count);
			}
	        System.out.print(count);
		}
		private static int Sorting(ArrayList<Integer> arr, int toInsert,int n,int count) {
			for(int i=n;i>=0;i--){
				if(arr.get(i)>toInsert){
					if(i==arr.size()-1){
						arr.add(i+1, arr.get(i));
	                    count++;
					}else{
						arr.set(i+1, arr.get(i));
	                    count++;
					}
					
				}else{
					arr.set(i+1,toInsert);
					
					break;
				}
				if(i==0 && arr.get(i)>toInsert ){
					arr.set(i,toInsert);
					
				}
			}
			return count;
		}
	    

		public static ArrayList<Integer> ReadArrayList(int n, ArrayList<Integer> arr, Scanner scan) {
			for(int i=0;i<n;i++){
				arr.add(scan.nextInt());
			}
			return arr;
		}
}
