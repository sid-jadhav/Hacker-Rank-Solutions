package CodeChallenge30Days.Exception;

import java.util.Scanner;

public class HotChocolate {
public static final double tooHot=200;
public static final double tooCold=150;

	public static void DrinkHotChocolate(double temp) throws TooHotException,TooColdException{
		if(temp>=tooHot){
			throw new TooHotException();
		}else if(temp<=tooCold){
			throw new TooColdException();
		}
	}
	public static void main(String[] args) {
		double temp=170;
		Scanner scan=new Scanner(System.in);
		temp=scan.nextDouble();
		try{
			DrinkHotChocolate(temp);
			System.out.println("PERFECT");
			
		}catch(TooHotException e){
			System.out.println(e);
		}catch(TooColdException e){
			System.out.println(e);
		}
		finally{
			System.out.println("Drink it");
		}
		scan.close();
	}

}
