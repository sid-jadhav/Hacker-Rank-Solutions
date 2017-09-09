package Algorithms.GraphTheory;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

public class RoadsAndLibraries {

	public static void main(String[] args) {
		Graph g;
		int q,cityNo,roadNo,costLib,costRoad;
		Scanner scan =new Scanner(System.in);
		q=scan.nextInt();
		cityNo=scan.nextInt();
		roadNo=scan.nextInt();
		costLib=scan.nextInt();
		costRoad=scan.nextInt();
		g= new Graph(cityNo+1);
		for(int i=0;i<cityNo;i++){
			int v=scan.nextInt();
			int u=scan.nextInt();
			g.addEdge(u, v, costRoad);
		}
		if(costRoad>=costLib){
			//build library at each node
			System.out.println(costLib*cityNo);
		}else{
			System.out.println(g.toString());
		}
		
	}

}
