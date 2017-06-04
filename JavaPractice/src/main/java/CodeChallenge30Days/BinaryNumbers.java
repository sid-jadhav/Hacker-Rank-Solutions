package CodeChallenge30Days;

import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int count=0,mul=1;
        int seq=0,longest=0;
        int n = in.nextInt();
        if(n==0){
        	count=0;
        }else{
        while(n>=1){
            if(n%2==1){
                count=n%2*mul+count;
                mul=mul*10;
                seq++;
            }else if(n%2==0){
                mul=mul*10;
                if(longest<seq){
                	longest=seq;
                }
                seq=0;
            }
            n=n/2;
            
        }
        if(longest<seq){
        	longest=seq;
        }
        }
        System.out.println(count);
        System.out.println(longest);
	}

}
