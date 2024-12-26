package Data;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Categories {
    private Map<String, String> categoriesFromFile = new HashMap<>();

    public Categories(String fileName) {
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] category = line.split("\t");
                categoriesFromFile.put(category[0], category[1]);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String getCategory(String product) {
        return categoriesFromFile.get(product) == null ? "другое" : categoriesFromFile.get(product);
    }
}
