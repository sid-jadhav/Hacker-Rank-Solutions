package CodeChallenge30Days;

import java.util.Scanner;

public class TestingLibrary {

	public static void main(String[] args) {
		int d, m, y,fine=0;
		int de, me, ye;
		Scanner scan = new Scanner(System.in);
		d = scan.nextInt();
		m = scan.nextInt();
		y = scan.nextInt();
		de = scan.nextInt();
		me = scan.nextInt();
		ye = scan.nextInt();
		if (y == ye) {
			if (m <= me) {
				if (d <= de) {
					fine = 0;
					System.out.println(fine);
				}else{
					fine=15*(d-de);
					System.out.println(fine);
				}
			}else{
				fine=500*(m-me);
				System.out.println(fine);
			}
			
		}else if(y<ye){
			fine=0;
			System.out.println(fine);
		}
		else{
			fine=10000;
			System.out.println(fine);
		}
	}

}
