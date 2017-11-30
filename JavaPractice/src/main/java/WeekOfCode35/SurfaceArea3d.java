package WeekOfCode35;

import java.util.Scanner;

public class SurfaceArea3d {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int h=scan.nextInt();
		int w=scan.nextInt();
		int surfaceArea=0;
		int[][] arr=new int[h][w];
		for(int i=0;i<h;i++){
			for(int j=0;j<w;j++){
				arr[i][j]=scan.nextInt();
			}
		}
		if(h==1 && w==1){
			if(arr[0][0]==1){
				System.out.println("6");
			}else{
				System.out.println(10+4*(arr[0][0]-2));
			}
		}else if(h==1){
			for(int j=0;j<w;j++){
				if(j==0 ||j==w-1){
					if(j==0 && arr[0][0]>arr[0][1]){
						surfaceArea+=(arr[0][0]-arr[0][1]);
					}
					if(j==w-1 && arr[0][w-1]>arr[0][w-2]){
						surfaceArea+=(arr[0][w-1]-arr[0][w-2]);
					}
					if(arr[0][j]==1){
						surfaceArea+=5;
					}else if(arr[0][j]>1){
						surfaceArea+=8+3*(arr[0][j]-2);
					}
				}else{
					if(arr[0][j]>arr[0][j-1]){
						surfaceArea+=(arr[0][j]-arr[0][j-1]);
					}
					if(arr[0][j]>arr[0][j+1]){
						surfaceArea+=(arr[0][j]-arr[0][j+1]);
					}
					if(arr[0][j]==1){
						surfaceArea+=4;
					}else if(arr[0][j]>1){
						surfaceArea+=6+2*(arr[0][j]-2);
					}
				}
			}
			System.out.println(surfaceArea);
		}else if(w==1){
			for(int i=0;i<h;i++){
				if(i==0 ||i==h-1){
					if(i==0 && arr[0][0]>arr[1][0]){
						surfaceArea+=(arr[0][0]-arr[1][0]);
					}
					if(i==w-1 && arr[h-1][0]>arr[h-2][0]){
						surfaceArea+=(arr[h-1][0]-arr[h-2][0]);
					}
					if(arr[i][0]==1){
						surfaceArea+=5;
					}else if(arr[i][0]>1){
						surfaceArea+=8+3*(arr[i][0]-2);
					}
				}else{
					if(arr[i][0]>arr[i-1][0]){
						surfaceArea+=(arr[i][0]-arr[i-1][0]);
					}
					if(arr[i][0]>arr[i+1][0]){
						surfaceArea+=(arr[i][0]-arr[i+1][0]);
					}
					if(arr[i][0]==1){
						surfaceArea+=4;
					}else if(arr[i][0]>1){
						surfaceArea+=6+2*(arr[i][0]-2);
					}
				}
			}
			System.out.println(surfaceArea);
		}else{
		
			for(int i=0;i<h;i++){
				for(int j=0;j<w;j++){
					if(i==0 &&j==0 ||i==0 &&j==w-1 ||i==h-1 &&j==0 ||i==h-1 &&j==w-1){
						if(i==0 &&j==0){
							if(arr[i][j]>arr[i][j+1]){
								surfaceArea+=(arr[i][j]-arr[i][j+1]);
							}
							if(arr[i][j]>arr[i+1][j]){
								surfaceArea+=(arr[i][j]-arr[i+1][j]);
							}
						}
						if(i==0 &&j==w-1){
							if(arr[i][j]>arr[i][j-1]){
								surfaceArea+=(arr[i][j]-arr[i][j-1]);
							}
							if(arr[i][j]>arr[i+1][j]){
								surfaceArea+=(arr[i][j]-arr[i+1][j]);
							}
						}
						if(i==h-1 &&j==0){
							if(arr[i][j]>arr[i][j+1]){
								surfaceArea+=(arr[i][j]-arr[i][j+1]);
							}
							if(arr[i][j]>arr[i-1][j]){
								surfaceArea+=(arr[i][j]-arr[i-1][j]);
							}
						}
						if(i==h-1 &&j==w-1){
							if(arr[i][j]>arr[i][j-1]){
								surfaceArea+=(arr[i][j]-arr[i][j-1]);
							}
							if(arr[i][j]>arr[i-1][j]){
								surfaceArea+=(arr[i][j]-arr[i-1][j]);
							}
						}
						
						if(arr[i][j]==1){
							surfaceArea+=4;
						}else if(arr[i][j]>1){
							surfaceArea+=6+2*(arr[i][j]-2);
						}
					}else if(i==0||i==h-1 ||j==0||j==w-1){
						if(i==0){
							if(arr[i][j]>arr[i][j-1]){
								surfaceArea+=(arr[i][j]-arr[i][j-1]);
							}
							if(arr[i][j]>arr[i][j+1]){
								surfaceArea+=(arr[i][j]-arr[i][j+1]);
							}
							if(arr[i][j]>arr[i+1][j]){
								surfaceArea+=(arr[i][j]-arr[i+1][j]);
							}
						}
						if(i==h-1){
							if(arr[i][j]>arr[i][j-1]){
								surfaceArea+=(arr[i][j]-arr[i][j-1]);
							}
							if(arr[i][j]>arr[i][j+1]){
								surfaceArea+=(arr[i][j]-arr[i][j+1]);
							}
							if(arr[i][j]>arr[i-1][j]){
								surfaceArea+=(arr[i][j]-arr[i-1][j]);
							}
						}
						if(j==0){
							if(arr[i][j]>arr[i-1][j]){
								surfaceArea+=(arr[i][j]-arr[i-1][j]);
							}
							if(arr[i][j]>arr[i+1][j]){
								surfaceArea+=(arr[i][j]-arr[i+1][j]);
							}
							if(arr[i][j]>arr[i][j+1]){
								surfaceArea+=(arr[i][j]-arr[i][j+1]);
							}
						}
						if(j==w-1){
							if(arr[i][j]>arr[i-1][j]){
								surfaceArea+=(arr[i][j]-arr[i-1][j]);
							}
							if(arr[i][j]>arr[i+1][j]){
								surfaceArea+=(arr[i][j]-arr[i+1][j]);
							}
							if(arr[i][j]>arr[i][j-1]){
								surfaceArea+=(arr[i][j]-arr[i][j-1]);
							}
						}
						if(arr[i][j]==1){
							surfaceArea+=3;
						}else if(arr[i][j]>1){
							surfaceArea+=4+(arr[i][j]-2);
						}
					}else{
						surfaceArea+=2;
						if(arr[i][j]>arr[i-1][j]){
							surfaceArea+=(arr[i][j]-arr[i-1][j]);
						}
						if(arr[i][j]>arr[i][j-1]){
							surfaceArea+=arr[i][j]-arr[i][j-1];
						}
						if(arr[i][j]>arr[i+1][j]){
							surfaceArea+=arr[i][j]-arr[i+1][j];
						}
						if(arr[i][j]>arr[i][j+1]){
							surfaceArea+=arr[i][j]-arr[i][j+1];
						}
					}
				}
			}
			System.out.println(surfaceArea);
		}
	}

}
