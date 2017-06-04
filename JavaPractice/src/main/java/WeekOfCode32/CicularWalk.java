package WeekOfCode32;

import java.util.Scanner;
import java.lang.Math.*;

public class CicularWalk {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int s = in.nextInt();
        int t = in.nextInt();
        int r_0 = in.nextInt();
        int g = in.nextInt();
        int seed = in.nextInt();
        int p = in.nextInt();
        int result = circularWalk(n, s, t, r_0, g, seed, p);
        System.out.println(result);
	}

	private static int circularWalk(int n, int s, int t, int r_0, int g, int seed, int p) {
		int[] a=new int[10000000];
		a[0]=r_0;
		int sid,count=0,max=s;
		for(int i=1;i<n;i++){
			a[i]=(a[i-1]*g+seed)%p;
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		while(s!=t){
			sid=a[s];
			if(Math.abs(s-t)<=sid){
				count++;
				s=t;
				break;
			}else{
				for(int i=s+1;i<sid;i++)
					{
						if(i==n){
							i=0;
						}
						if(a[i]>a[i+1]){
							if(a[max]<a[i]){
							max=i;
							System.out.println(max);
							}
						}
				
					}
			}
		}
		return count;
	}

}
