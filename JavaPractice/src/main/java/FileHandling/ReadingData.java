package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ReadingData {

	public static void main(String[] args) {
		File file= new File("panDetails.txt");
		Map details=new HashMap();
		try {
			int i=2,j=0,stop=0;
			FileReader in=new FileReader(file);
			BufferedReader br=new BufferedReader(in);
			StringBuffer str=new StringBuffer();
			StringBuffer data=new StringBuffer();
			str.append(br.readLine());
			System.out.println(str);
			while(j<=i){
				br.readLine();
				if(j==i){
					data.append(br.readLine());
					System.out.println(data);
				}
				j++;
			}
			int start=0,startdata=0,end=0,enddata=0;
			String s1=data.toString();
			String s=str.toString();
			while(stop<str.length()){
				
				while(str.charAt(end)!=','){
					end++;
					stop++;
				}
				//value of string separated by comma
				System.out.println(s.substring(start, end));
				while(data.charAt(enddata)!=','){
					enddata++;
				}
				System.out.println(s1.substring(startdata, enddata));
				details.put(s.substring(start, end), s1.substring(startdata, enddata));
				//for data
				enddata++;
				startdata=enddata;
				//for str
				end++;
				start=end;
				stop++;
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
