package RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatching {

	public static void main(String[] args) {
		Pattern p= Pattern.compile("[^si]");
		Matcher m=p.matcher("sidsidsisidssiddddsiidsidsiiisidsidisidisididisidisidis");
		while(m.find()){
			System.out.println("start: "+m.start()+" end: "+m.end()+" which group got matched: "+m.group());
		}
	}

}
