package JsonOperation.JsonOperation;

import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONObject;

public class WriteJson {
    public static void main(String[] args) {
// Create the main JSON object
    	System.out.println("writing into JSON file");
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("name", "John Doe");
        jsonObject.put("age", 30);
        jsonObject.put("city", "New York");

        // Create a nested JSON object
        JSONObject addressObject = new JSONObject();
        addressObject.put("street", "123 Main St");
        addressObject.put("zipcode", "10001");

        // Add the nested JSON ob
// Add the nested JSON object to the main JSON object
        jsonObject.put("address", addressObject);

        try (FileWriter file = new FileWriter("output.json")) {
            file.write(jsonObject.toString(2)); // Pretty print
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
