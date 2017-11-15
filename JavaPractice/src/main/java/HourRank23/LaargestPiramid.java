package HourRank23;

import java.util.Scanner;

public class LaargestPiramid {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int[][] h = new int[n][m];
            for(int h_i = 0; h_i < n; h_i++){
                for(int h_j = 0; h_j < m; h_j++){
                    h[h_i][h_j] = in.nextInt();
                }
            }
        }
        in.close();
	}

}
