package Algorithms;

import java.util.Scanner;

public class electronicShop {

	public static void main(String[] args) {
		int keyboardNo, usbNo, doller;
		int[] priceK =new int[1000];
		int[] priceU =new int[1000];
		Scanner scan =new Scanner(System.in);
		doller=scan.nextInt();
		keyboardNo=scan.nextInt();
		usbNo=scan.nextInt();
		for(int i=0;i<keyboardNo;i++){
			priceK[i]=scan.nextInt();
		}
		for(int i=0;i<usbNo;i++){
			priceU[i]=scan.nextInt();
		}
		int maxKeyboard= getMaxKey(keyboardNo,priceK);
	}

	private static int getMaxKey(int keyboardNo, int[] priceK) {
		for (int i=0;i<keyboardNo;i++){
			if(priceK[i]<priceK[i+1]){
				
			}
		}
		return 0;
	}

}
