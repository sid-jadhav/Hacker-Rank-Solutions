package Algorithms.Sorting.InsertionSort;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertionSortII {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>();
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		GeneralArrayList gen=new GeneralArrayList();
		arr=gen.ReadArrayList(n,arr,scan);
		for(int i=0;i<arr.size()-1;i++){
			arr=Sorting(arr,arr.get(i+1),i);
			gen.print(arr);
		}
	}
	private static ArrayList<Integer> Sorting(ArrayList<Integer> arr, int toInsert,int n) {
	
		for(int i=n;i>=0;i--){
			if(arr.get(i)>toInsert){
				if(i==arr.size()-1){
					arr.add(i+1, arr.get(i));
				}else{
					arr.set(i+1, arr.get(i));
				}
				
			}else{
				arr.set(i+1,toInsert);
				
				break;
			}
			if(i==0 && arr.get(i)>toInsert ){
				arr.set(i,toInsert);
				
			}
		}
		
		return arr;
	}

}
