package Algorithms.Sorting.QuickSort;

import java.util.Scanner;

public class QuickSortII {
	static int[] left= new int[1000];
	static int[] right= new int[1000];
	static int[] same= new int[1000];
	public static void main(String[] args) {
		int[] arr= new int[1000];
		Scanner scan =new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			arr[i]=scan.nextInt();
		}
		arr=quickSort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		} 
	}
	private static int[] quickSort(int[] arr) {
		int pivot=arr[0];
		int[] sorted= new int[1000];
		int r=0,l=0,s=0;
		for(int i=1;i<arr.length;i++){
			if(arr[i]>pivot){
				right[r]=arr[i];
				r++;
			}else if(arr[i]<pivot){
				left[l]=arr[i];
				l++;
			}else{
				same[s]=pivot;
				s++;
			}
		}
		int count=0;
	
		for(int i=0;i<right.length;i++){
			if(same.length!=1000)
			sorted[count]=right[i];
			count++;
		}
		
		for(int i=0;i<same.length;i++){
			if(same.length!=1000)
			sorted[count]=same[i];
		}
		for(int i=0;i<left.length;i++){
			if(same.length!=1000)
			sorted[count]=left[i];
		}
		return sorted;
	}

}
