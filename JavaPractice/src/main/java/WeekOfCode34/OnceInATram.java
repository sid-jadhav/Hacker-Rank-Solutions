package WeekOfCode34;

import java.util.Scanner;

public class OnceInATram {

	public static void main(String[] args) {
		int ticketNo;
		Scanner scan = new Scanner(System.in);
		ticketNo=scan.nextInt();
	
			if(addFirstNo(ticketNo)<=addLastNo(ticketNo)){
				ticketNo+= 10-ticketNo%10;
				int diff=(addFirstNo(ticketNo)-addLastNo(ticketNo));
				ticketNo+=diff;
				if(addFirstNo(ticketNo)==addLastNo(ticketNo)){
					System.out.println(ticketNo);
				}else{
					ticketNo-=diff;
					int var=addFirstNo(ticketNo);
					if(var<=9){
						ticketNo+=var;
						System.out.println(ticketNo);
					}
					else if(var<=18){
						ticketNo+=(var-9)*10+9;
						System.out.println(ticketNo);
					}else{
						var=(var-18)*100+9*10+9;
						ticketNo+=var;
						System.out.println(ticketNo);
					}
				}
			}else{
				ticketNo+=(addFirstNo(ticketNo)-addLastNo(ticketNo));
				
			}
	
		
	}
	
	public static int addFirstNo(int ticketNo){
		int sum=0;
		int div=100000;
		for(int i=0;i<3;i++){
			sum=sum+ ticketNo/div;
			ticketNo=ticketNo%div;
			div/=10;
		}
		return sum;
	}
	public static int addLastNo(int ticketNo){
		ticketNo=ticketNo%1000;
		int sum=0;
		int div=100;
		for(int i=0;i<3;i++){
			sum=sum+ ticketNo/div;
			ticketNo=ticketNo%div;
			div/=10;
		}
		return sum;
	}
}
