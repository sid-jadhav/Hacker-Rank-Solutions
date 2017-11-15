package WeekOfCode35;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LuckyPurchase {
/*	Sharon wants to buy a laptop for programming. She plans on buying a laptop whose price is made of digits 4 and 7 only. The number of 4s and 7s in the price should be equal. You are given laptop brand names and their prices. Find and print the name of the laptop brand that satisfies the above criteria. If there are multiple brands that meet the criteria, print the name of the one with the minimum price. If none of the laptops meet the criteria print -1.

	For example, if Sharon has a choice between laptops 'BestBook' priced at 444777 and 'LapBook' priced at 7744, the solution should indicate ideal choice to be 'LapBook'. Although both 'BestBook' and 'LapBook' have equal number of 4s and 7s in the price, 'LapBook' is priced lower which makes it the right choice for Sharon.

	Input Format

	The first line contains an integer , denoting the number of laptops. 
	The next  lines contains one string (name of company laptop) and an integer describing the value of each laptop.

	Constraints

	name of laptop consists of English letters only.
	Both name and price for laptops are unique.

	Output Format

	If answer doesn't exist, print -1. 
	Otherwise, print the name of the brand whose laptop costs the least (minimum lucky number) and meets the required criteria.

	Sample Input 0

	4
	HackerBook 777444
	RankBook 3
	TheBook 777
	BestBook 47
	Sample Output 0

	BestBook
*/

	public static void main(String[] args) {
		HashMap<String, Long> compList=new HashMap<>();
		Pattern p= Pattern.compile("[4 7]+");
		Pattern p4= Pattern.compile("4");
		Pattern p7= Pattern.compile("7");
		Matcher match;
		int n;
		Scanner scan =new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			String brandName;
			brandName=scan.next();
			Long cost=scan.nextLong();
			match=p.matcher(cost.toString());
			if(match.matches() && cost.toString().length()!=1){
				int count4=0,count7=0;
				match=p4.matcher(cost.toString());
				while(match.find()){
					count4++;
				}
				match=p7.matcher(cost.toString());
				while(match.find()){
					count7++;
				}
				if(count4==count7){
					compList.put(brandName,cost );
					System.out.println("match");
				}
			}
		}
		System.out.println(comparePrices(compList));
      
	}

	private static String comparePrices(HashMap<String, Long> compList) {
		if(compList.size()==0){
			return "-1";
		}else{
			Long min=(long) 0;
			String ret="-1";
			int i=0;
			for(String s: compList.keySet()){
				if(i==0){
					min=compList.get(s);
					ret=s;
					i++;
				}
				else if(compList.get(s)<min){
					min=compList.get(s);
					ret=s;
				}
			}
			return ret;
		}
	}

}
