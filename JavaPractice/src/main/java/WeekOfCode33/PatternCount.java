package WeekOfCode33;

import java.util.Scanner;

public class PatternCount {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int q= scan.nextInt();
		scan.nextLine();
		for(int i=0;i<q;i++){
			String s=scan.nextLine();
			pattern(s);
		}

	}

	private static void pattern(String s) {
		int count=0;
		boolean zero=false;
		for(int i=0;i<s.length()-1;i++){
			zero=false;
			if(s.charAt(i)=='1'){
				while(s.charAt(i+1)=='0' && i<s.length()-2){
					i++;
					zero=true;
				}
				if(s.charAt(i+1)=='1' && zero==true){
					count++;
					zero=false;
				}else{
					
				}
			}
		}
		System.out.println(count);
	}

}
