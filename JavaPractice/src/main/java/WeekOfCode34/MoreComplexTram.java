package WeekOfCode34;

import java.util.Scanner;

public class MoreComplexTram {
	 public static void main(String[] args) {
			int ticketNo;
			Scanner scan = new Scanner(System.in);
			ticketNo=scan.nextInt();
			do{
				if(addFirstNo(ticketNo)<=addLastNo(ticketNo)){
					ticketNo+= 10-ticketNo%10;
					ticketNo+=(addFirstNo(ticketNo)-addLastNo(ticketNo));
				}else{
					ticketNo+=(addFirstNo(ticketNo)-addLastNo(ticketNo));
					
				}
			}while(addFirstNo(ticketNo)!=addLastNo(ticketNo));
			System.out.println(ticketNo);
			
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
