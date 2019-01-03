package JSONFILE;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONWriter 
{
	public static void main(String[] args) {

        JSONObject obj = new JSONObject();
        obj.put("name", "mkyong.com");
        obj.put("age", new Integer(200));

        JSONArray list = new JSONArray();
        list.add("msg 4");
        list.add("msg 5");
        list.add("msg 6");

        obj.put("messages", list);

        try (FileWriter file = new FileWriter(".\\test.json")) {

            file.write(obj.toJSONString());
            file.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.print(obj);

    }

}
