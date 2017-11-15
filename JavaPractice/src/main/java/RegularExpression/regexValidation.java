package RegularExpression;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexValidation {
	//for Moblie number (91|0)?[789][0-9]{9}
	public static final String mobNo="(91|0)?[789][0-9]{9}";
	public static final String email="[a-z A-Z 0-9][a-z A-Z 0-9 #$]*@[a-z A-Z 0-9]+([.][a-z A-Z]+)+";
	public static final String gmail="[a-z A-Z 0-9][a-z A-Z 0-9 #$]*@gmail.com";
	public static final String ipAddress="([01]|2)([0-9]|[0-5]{2})";
	public static void main(String[] args) {
		ArrayList i= new ArrayList();
		Pattern p=Pattern.compile(ipAddress);
		String s=new String();
		Scanner scan =new Scanner(System.in);
		s=scan.nextLine();
		Matcher m=p.matcher(s);
		if(m.find() && m.group().equals(s)){
			System.out.println("Valid");
		}else{
			System.out.println("Not Valid");
		}
	}

}
