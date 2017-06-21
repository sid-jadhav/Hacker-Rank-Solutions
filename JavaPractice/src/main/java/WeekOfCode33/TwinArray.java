package WeekOfCode33;

import java.util.ArrayList;
import java.util.Scanner;

public class TwinArray {

	public static void main(String[] args) {
		int max=1000000000;
		ArrayList<Integer> a1=new ArrayList();
		ArrayList<Integer> a2=new ArrayList();
		Scanner scan= new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++){
			a1.add(scan.nextInt());
		}
		for(int i=0;i<n;i++){
			a2.add(scan.nextInt());
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(max>(a1.get(i)+a2.get(j))&& j!=i){
					max=a1.get(i)+a2.get(j);
				}
			}
		}
		System.out.println(max);
	}

}
