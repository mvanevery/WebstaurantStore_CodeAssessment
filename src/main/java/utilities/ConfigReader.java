package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private Properties properties;

    /**
     * This is used to load the properties from the config.properties file.
     * @return it returns the Properties property object
     * */
    public Properties readPropertyFile() {
        properties = new Properties();
        try {
            FileInputStream file = new FileInputStream("src/testResources/config.properties");
            properties.load(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("Unable to find file at given path");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

    public String getProperty(String keyword) {
        return properties.getProperty(keyword);
    }

}
