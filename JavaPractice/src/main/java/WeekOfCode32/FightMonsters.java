package WeekOfCode32;

import java.util.Scanner;

public class FightMonsters {
	
	 static int getMaxMonsters(int n, int hit, int t, int[] h){
		  int min=1000000000;
			int noM=0;
			for(int i=0;i<n &&t>0;i++){
				for(int j=i;j<n;j++){
					if(h[i]>h[j]){
						min=h[i];
						h[i]=h[j];
						h[j]=min;
					}
				}
	                if(h[i]%hit!=0){
	                    t=t-(h[i]/hit)-1;
	                    if(t>=0){
	                    	 noM++;
	                    }
	                }
	                else{
	                   
	                    t=t-(h[i]/hit);
	                    if(t>=0){
	                    	 noM++;
	                    }
	                }
			}
			return noM;
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int hit = in.nextInt();
	        int t = in.nextInt();
	        int[] h = new int[n];
	        for(int h_i=0; h_i < n; h_i++){
	            h[h_i] = in.nextInt();
	        }
	        int result = getMaxMonsters(n, hit, t, h);
	        System.out.println(result);
	    }

}
