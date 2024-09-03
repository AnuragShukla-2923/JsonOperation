package JsonOperation.JsonOperation;

import java.io.FileInputStream;
import java.io.IOException;

import org.json.JSONObject;
import org.json.JSONTokener;

public class ReadJson {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("output.json")) {
            JSONTokener tokener = new JSONTokener(fis);
            JSONObject jsonObject = new JSONObject(tokener);

            System.out.println("JSON Data: " + jsonObject.toString(2)); // Pretty print
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}