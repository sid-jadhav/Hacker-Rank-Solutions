package practice;

import java.util.HashSet;
import java.util.Scanner;

public class RecurringCharacter {

	public static void main(String[] args) {
		HashSet h= new HashSet();
		Scanner scan= new Scanner(System.in);
		String s=new String();
		s=scan.nextLine();
		for(int i=0;i<s.length();i++){
			if(h.add(s.charAt(i))){
				System.out.println(s.charAt(i)+" is added to table it is not repeated");
			}else{
				System.out.println(s.charAt(i)+" is first character that is repeated");
				break;
			}
		}
	}

}
