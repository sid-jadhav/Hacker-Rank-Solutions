package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WrittingData {

	public static void main(String[] args) {
		File file=new File("panDetails.txt");
		try {
			FileWriter out=new FileWriter(file);
			out.write("pan,pin,expDate,cvv\n");
			out.append("2132902384923,9892,928392,192");
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
