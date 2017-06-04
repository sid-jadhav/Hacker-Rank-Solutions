package WeekOfCode32;

import java.util.Scanner;

public class Duplication {

	static String duplication(int x){
        StringBuilder s=new StringBuilder();
        StringBuilder t=new StringBuilder();
        s.append("0");
        while(s.length()<=10){
        	for(int i=0;i<s.length();i++){
        		t.insert(i,('1'-s.charAt(i)));
        	}
        	s.append(t);
        	t.replace(0, t.length(), "");
        	System.out.println(s);
        }
        
		return s.substring(x,x+1);
		// Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            String result = duplication(x);
            System.out.println(result);
        }
    }

}
