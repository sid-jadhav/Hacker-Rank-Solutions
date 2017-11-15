package HourRank23;

import java.util.Scanner;

public class HalloweeSale {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int p = in.nextInt();
        int d = in.nextInt();
        int m = in.nextInt();
        int s = in.nextInt();
        int answer = howManyGames(p, d, m, s);
        System.out.println(answer);
        in.close();
	}

	private static int howManyGames(int p, int d, int m, int s) {
		int count=0;
		int sum=0;
		while(p>m && sum<=s){
			sum+=p;
			p-=d;
			count++;
		}
		p=m;
		while(sum<=s){
			sum+=m;
			count++;
		}
		count--;
		return count;
	}

}
