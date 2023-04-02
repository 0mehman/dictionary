package dictionary.main;

import java.io.*;
import java.util.Map;

public class DictionariList {

    public static void writeToFile(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            File file = new File("C:\\Users\\user\\Desktop\\dict.txt");
            try (FileWriter writer = new FileWriter(file,true)) {
                writer.write(entry.getKey()+" - "+entry.getValue()+"\n");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
