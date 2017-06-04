package CodeChallenge30Days;

import java.util.HashMap;
import java.util.Scanner;

public class DictionariesAndMaps {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		HashMap<String,Integer> p=new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            p.put(name,phone );
        }
        while(in.hasNext()){
            String s = in.next();
            if(p.containsKey(s)){
            	System.out.println(s+"="+p.get(s));
            }
        }
        in.close();
        
	}

}
