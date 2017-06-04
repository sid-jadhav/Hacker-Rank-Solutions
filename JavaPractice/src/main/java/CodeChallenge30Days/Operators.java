package CodeChallenge30Days;

import java.util.Scanner;

public class Operators {

	public static void main(String[] args) {
		        Scanner scan = new Scanner(System.in);
		        double mealCost = scan.nextDouble(); // original meal price
		        int tipPercent = scan.nextInt(); // tip percentage
		        int taxPercent = scan.nextInt(); // tax percentage
		        scan.close();
		      
		        // Write your calculation code here.
		        mealCost= mealCost+(tipPercent+ taxPercent)*mealCost/100;
		        // cast the result of the rounding operation to an int and save it as totalCost 
		        int totalCost = (int) Math.round(mealCost);
		        System.out.println("The total meal cost is "+totalCost+" dollars.");
		        // Print your result
		    }
}


