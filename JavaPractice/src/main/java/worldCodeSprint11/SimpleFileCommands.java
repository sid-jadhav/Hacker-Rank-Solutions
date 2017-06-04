package worldCodeSprint11;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFileCommands {

	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int q = in.nextInt();
	        // Process each command
	        for(int a0 = 0; a0 < q; a0++){
	            String command = in.next();
	            StringBuffer fileName=new StringBuffer(), fileName2=new StringBuffer();
	            if(command.equals("crt")){
	            	fileName.append(in.nextLine());
	            	fileName.deleteCharAt(0);
	            	CreateFile(fileName);
	            }else if (command.equals("del")){
	            	fileName.append(in.nextLine());
	                fileName.deleteCharAt(0);
	            	DeleteFile(fileName);
	            }else if (command.equals("rnm")){
	            	fileName.append(in.next());
	            	fileName2.append(in.nextLine());
	                fileName2.deleteCharAt(0);
	            	RenameFile(fileName,fileName2);
	            }
	            
	        }
	        in.close();
	    }
	    private static void RenameFile(StringBuffer fileName, StringBuffer fileName2) {
			String file;
			file=fileName.toString();
			File next=new File(file);
			next.delete();
			
			file=fileName2.toString();
			File next3=new File(file);
			char s='1';
			if(next3.exists()){
				for(int i=0;i<5;){
					
					fileName2.append("("+s+")");
					file=fileName2.toString();
					fileName2.deleteCharAt((fileName2.length()-1));
					fileName2.deleteCharAt((fileName2.length()-1));
					fileName2.deleteCharAt((fileName2.length()-1));
					File next1=new File(file);
					if(!next1.exists()){
						try {
							next1.createNewFile();
							i=5;
							System.out.println("r "+fileName+" -> "+file);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					s++;
				}
			}else{
				try {
					next3.createNewFile();
					System.out.println("r "+fileName+" -> "+file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		private static void DeleteFile(StringBuffer fileName) {
			String file;
			file=fileName.toString();
			File next=new File(file);
			System.out.println("- "+file);
			next.delete();
			
		}

		private static void CreateFile(StringBuffer fileName) {
			String file;
			file=fileName.toString();
			File next=new File(file);
			char s='1';
			if(next.exists()){
				for(int i=0;i<5;){
					
					fileName.append("("+s+")");
					file=fileName.toString();
					fileName.deleteCharAt((fileName.length()-1));
					fileName.deleteCharAt((fileName.length()-1));
					fileName.deleteCharAt((fileName.length()-1));
					File next1=new File(file);
					if(!next1.exists()){
						try {
							next1.createNewFile();
							i=5;
							System.out.println("+ "+file);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
					s++;
				}
			}else{
				try {
					next.createNewFile();
					System.out.println("+ "+file);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	    
}
