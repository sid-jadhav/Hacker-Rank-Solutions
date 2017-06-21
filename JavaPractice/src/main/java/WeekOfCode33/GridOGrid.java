package WeekOfCode33;

import java.util.Scanner;

public class GridOGrid {

	public static void main(String[] args) {
		char c[][]=new char[101][101];
		int n;
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			int no=scan.nextInt();
			for(int j=0;j<no;j++){
				String s=scan.next();
				for(int k=0;k<no;k++){
					c[j][k]=s.charAt(k);
				}
			}
			
			for(int j=0;j<no;j++)
			c=sort(no,c);
			
			boolean b=assertT(no,c);
			if(b==true){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}

	private static boolean assertT(int no,char[][] c) {
		for(int i=0;i<no-1;i++){
			for(int j=0;j<no-1;j++){
				if(c[i][j]>c[i+1][j]){
					return false;
				}
			}
		}
		return true;
	}

	private static char[][] sort(int no, char[][] c) {
		for(int i=0;i<no;i++){
			for(int j=0;j<no-1;j++){
				if(c[i][j]>c[i][j+1]){
					char temp=c[i][j];
					c[i][j]=c[i][j+1];
					c[i][j+1]=temp;
				}
			}
		}
		return c;
	}

}
