package worldCodeSprint11;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NumericString {

    static long getMagicNumber(String s, int k, int b, int m){
    	long sumMod=0,sunNo;
    	for(int i=0;i<=(s.length()-k);i++){
    		String sub;
    		long base10=0;
    		sub=s.substring(i, i+k);
    		sunNo=Integer.parseInt(sub);
    		for(int j=0;j<k;j++){
    			//convert base b to base 10
    			base10=(long) (base10+(sunNo%10)*Math.pow(b, j));
    			sunNo=sunNo/10;
    		}
    		sumMod=sumMod+base10%m;
    	}
    	return sumMod;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int k = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        long result = getMagicNumber(s, k, b, m);
        System.out.println(result);
    }
}



