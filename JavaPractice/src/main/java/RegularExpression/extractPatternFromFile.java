package RegularExpression;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class extractPatternFromFile {
	//regex for .txt file [a-z A-Z 0-9][a-z A-Z 0-9 -_$.]*[.]txt
	public static void main(String[] args) {
		Pattern p=Pattern.compile("(91|0)?[789][0-9]{9}");
		try {
			PrintWriter writer= new PrintWriter("result.txt");
			BufferedReader br=new BufferedReader(new FileReader("source.txt"));
			String line=br.readLine();
			while(line!=null){
				Matcher m= p.matcher(line);
					while(m.find()){
						writer.println(m.group());
					}
					line=br.readLine();
			}
			writer.flush();
			writer.close();
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
