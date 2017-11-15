package RegularExpression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankRegExReapeatedWord {

	public static void main(String[] args) {
		Pattern p=Pattern.compile("\\S");
		Scanner scan = new Scanner(System.in);
		String s=new String();
		s=scan.nextLine();
		Matcher m=p.matcher(s);
		while(m.find()){
			String s1=m.group();
			System.out.println(s1);
//			p=Pattern.compile(s1);
//			m=p.matcher(s);
		}
	}

}
