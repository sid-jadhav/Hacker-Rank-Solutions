package Algorithms.GraphTheory;

import java.util.Scanner;

public class RoadsAndLibraries {

	public static void main(String[] args) {
		int q,cityNo,roadNo,costLib,costRoad;
		Scanner scan =new Scanner(System.in);
		q=scan.nextInt();
		cityNo=scan.nextInt();
		roadNo=scan.nextInt();
		costLib=scan.nextInt();
		costRoad=scan.nextInt();
		int[] edge= new int[10];
		if(costRoad>=costLib){
			//build library at each node
			System.out.println(costLib*cityNo);
		}
	}

}
