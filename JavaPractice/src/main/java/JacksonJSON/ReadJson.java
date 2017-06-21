package JacksonJSON;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadJson {

	public static void main(String[] args) {
		JSONParser json=new JSONParser();
		
		
		try {
			JSONObject obJSON=(JSONObject)json.parse(new FileReader("Sid.json"));
			System.out.println(obJSON.toString());
			System.out.println(obJSON.get("name"));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

}
