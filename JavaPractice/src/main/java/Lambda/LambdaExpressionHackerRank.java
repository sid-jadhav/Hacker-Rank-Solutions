package Lambda;

import java.util.Comparator;

public class LambdaExpressionHackerRank {

	public static void main(String[] args) {
		
		Comparator c=(Object s1, Object s2)-> {
				String ss1=(String) s1;
				String ss2=(String) s2;
				return ss1.compareTo(ss2);
			};
			
		Comparable c1=s->{
		String ss2=(String) s;
		return 1;};
		
		Comparable c2=new Comparable(){

			public int compareTo(Object arg0) {
				return 0;
			}};
	}
}
