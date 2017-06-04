package WeekOfCode32;

import java.util.Scanner;

public class GeometricTrick {
	static int geometricTrick(String s,int n){
		int i=0,j=0,k=0,count=0;
		System.out.println(s.indexOf('a', 3));
		for(int a=0;a<n;a++){
			
			i=s.indexOf('a',i+1);
			j=s.indexOf('b',j+1);
			k=s.indexOf('c',k+1);
			if((j+1)*(j+1)==(i+1)*(k+1)){
				count++;
			}
		}
		
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = geometricTrick(s,n);
        System.out.println(result);
    }

}
