package setup;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

public class ReadProperties {

    public static HashMap<String, String> propertiesMap;

    public static void main() {
        propertiesMap = new HashMap<>();
        ReadProperties app = new ReadProperties();
        app.propertyToMap("testProps.properties");
    }

    private void propertyToMap(String filename) {

        try (InputStream input = getClass().getClassLoader().getResourceAsStream(filename)) {

            Properties prop = new Properties();

            if (input == null) {
                System.out.println("Sorry, unable to find " + filename);
                return;
            }

            prop.load(input);

            for (String key : prop.stringPropertyNames()) {
                propertiesMap.put(key, prop.getProperty(key));
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
