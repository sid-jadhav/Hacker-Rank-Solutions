package WeekOfCode33;

import java.util.Scanner;

public class OptimizedTwinArray {

	 static int twinArrays(int[] ar1, int[] ar2){
		 int swap1=0, swap2=0;
		 boolean sid=true;
		 for(int i=0;i<ar1.length-1;i++){
	        	if(ar1[i]<ar1[i+1]){
	        		int temp =ar1[i];
	        		ar1[i]=ar1[i+1];
	        		ar1[i+1]=temp;
	        		swap1++;
	        	}else{
	        		swap1=0;
	        	}
	        	if(ar2[i]<ar2[i+1]){
	        		int temp =ar2[i];
	        		ar2[i]=ar2[i+1];
	        		ar2[i+1]=temp;
	        		swap2++;
	        	}else{
	        		swap2=0;
	        	}
	        	if(swap1!=swap2){
	        		sid=false;
	        	}
	        }
	       
	     
	        if(sid==true){
	        	 for(int i=0;i<ar1.length-1;i++){
	 	        	if(ar1[i]<ar1[i+1]){
	 	        		int temp =ar1[i];
	 	        		ar1[i]=ar1[i+1];
	 	        		ar1[i+1]=temp;
	 	        	}
	 	        	if(ar2[i]<ar2[i+1]){
	 	        		int temp =ar2[i];
	 	        		ar2[i]=ar2[i+1];
	 	        		ar2[i+1]=temp;
	 	        	}
	 	        }
	        	return(Math.min(ar1[ar1.length-1]+ar2[ar2.length-2], ar1[ar1.length-2]+ar2[ar2.length-1]));
	        }else{
	        return ar1[ar1.length-1]+ar2[ar2.length-1];
	        }
	    }

	    public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int[] ar1 = new int[n];
	        for(int ar1_i = 0; ar1_i < n; ar1_i++){
	            ar1[ar1_i] = in.nextInt();
	        }
	        int[] ar2 = new int[n];
	        for(int ar2_i = 0; ar2_i < n; ar2_i++){
	            ar2[ar2_i] = in.nextInt();
	        }
	        int result = twinArrays(ar1, ar2);
	        System.out.println(result);
	    }
}
