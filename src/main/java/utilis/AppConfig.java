package utilis;

import java.io.InputStream;
import java.util.Properties;

public class AppConfig {

    private static final String PROPERTIES_FILE = "config.properties";

    private final Properties properties;

    private AppConfig() {
        properties = new Properties();
        try {
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE);
            properties.load(inputStream);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getApiKey() {
        return properties.getProperty("apiKey");
    }
}
