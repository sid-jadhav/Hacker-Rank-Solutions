package JacksonJSON;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.json.JSONArray;
import org.json.JSONObject;

public class WriteJson {

	public static void main(String[] args) {
		JSONObject json=new JSONObject();
		json.put("name", "Siddhesh");
		json.put("RollNo", "11712");
		JSONArray list=new JSONArray();
		list.put("REST");
		list.put("JAVA");
		list.put("Cucumber");
		list.put("Selenium");
		
		JSONObject subJson=new JSONObject();
		subJson.put("Java", "2Years");
		subJson.put("Selenium", "15Months");
		json.put("AdvanceCources", subJson);
		json.put("Courses", list);
		System.out.println(json.toString());
		
		try {
			FileWriter f=new FileWriter("Sid.json");
			f.write(json.toString());
			f.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
