package CodeChallenge30Days;

import java.util.Scanner;

public class RegexDatabase {

	public static void main(String[] args) {
		String name;
		String email;
		int n;
		Scanner scan = new Scanner(System.in);
		n=scan.nextInt();
		for(int i=0;i<n;i++){
			name=scan.next();
			email=scan.next();
			if(email.contains("@gmail.com")){
				System.out.println(name);
			}
		}
	}

}
